package Java240920Thread;

class MyDataSync{
    int data = 3;
    // 공유자원에 lock을 거는 방법 : 해당 메소드에 synchronized 넣기
    // block를 넣는 방법도 있다는데 책 참고할 것
    // * lock을 걸게되면 절대로 sleep 사용하지 말 것!!!
    // lock을 걸고 나가는 행위 → deadLock

    // Daemon(데몬)
    // 사용자가 인지하지 못한 상황에서 백그라운드에서 실행하는 것
    // 특징 : 다른 스레드가 일이 있을때는 살아있고, 일이 종료된다면 필요에 의해 스스로 종료됨

    // 스케쥴러(굉장히 중요!!!)
    // 수많은 스레드를 관리해줌
    // 한 스레드가 for문을 통해 계속 반복하더라도 스케쥴러가 중간에 개입하여 중간에 멈출 수 있게 함
    // → 스케쥴러가 임의로 한 스레드의 작업(프로세스 등)을 도중에 멈추게 하고 다른 스레드를 작동시키는 것 : ContextSwitching
    // → 멀티태스킹을 가능하게 해준다는 의미(동시에 실행되는 것처럼 보임)

    public synchronized void plusData(){
        int MyDataSync = data;
        try{Thread.sleep(2000);}catch(InterruptedException e){}
        data = MyDataSync + 1;
    }
}

class PlusThreadSync implements Runnable{
    MyDataSync MyDataSync;

    public PlusThreadSync(MyDataSync MyDataSync) {
        this.MyDataSync = MyDataSync;
    }

    @Override
    public void run() {
        MyDataSync.plusData();
        System.out.println("실행결과 : " + MyDataSync.data);
    }
}

public class ThreadWithSync {
    public static void main(String[] args) {
        MyDataSync MyDataSync = new MyDataSync();
        // 첫번째 스레드
        Runnable PlusThreadSync1 = new PlusThreadSync(MyDataSync);
        Thread thread1 = new Thread(PlusThreadSync1);
        thread1.start();
        // 1초 슬립
        try{Thread.sleep(1000);}catch(InterruptedException e){}
        // 두번째 스레드
        Runnable PlusThreadSync2 = new PlusThreadSync(MyDataSync);
        Thread thread2 = new Thread(PlusThreadSync2);
        thread2.start();
    }
}
