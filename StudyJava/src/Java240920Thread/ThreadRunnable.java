package Java240920Thread;

 class SMIFileRunnable implements Runnable {
     @Override
     public void run() {
         String[] strArray = {"하나", "둘", "셋", "넷", "다섯"};
         // 여기에 sleep을 넣으면 넣지 않았을때에 비해서 순서가 보장(완전히 같은결과 나오지는 않음)
         try{Thread.sleep(10);}catch(InterruptedException e){}
         for (int i = 0; i<strArray.length; i++){
             System.out.println("(자막번호) " + strArray[i]);
             // Thread 사용시에는 try catch문 안에서 사용해야함(안그러면 오류발생함)
             // Thread.sleep() 안의 숫자 단위는 ms
             try{Thread.sleep(200);}catch(InterruptedException e){}
         }
     }
 }
 class VideoFileRunnable implements Runnable{
     @Override
     public void run() {
         int[] intArray = {1,2,3,4,5};
         for (int i = 0; i<intArray.length; i++){
             System.out.println("(비디오프레임) " + intArray[i]);
             // Thread 사용시에는 try catch문 안에서 사용해야함(안그러면 오류발생함)
             // Thread.slppe() 안의 숫자 단위는 ms
             try{Thread.sleep(200);}catch(InterruptedException e){}
         }
     }
 }

public class ThreadRunnable {
    // Runnable(이건 인터페이스라 이걸 상속받아서 사용)을 사용
    // → 상속받는 함수명은 Run()임(이거 하나밖에 없음)
    // 시작할때는 Thread로 시작하고 그 안에 Runnable 객체를 넣어서 실행
    public static void main(String[] args) {
        // 자막 스레드 실행
        Runnable smiFileRunnable = new SMIFileRunnable();
        Thread thread1 = new Thread(smiFileRunnable);
        thread1.start();
        // 비디오 스레드 실행
        Runnable videoFileRunnable = new VideoFileRunnable();
        Thread thread2 = new Thread(videoFileRunnable);
        thread2.start();
    }
    // 실행해보면 결과가 다르게 나오는데 이는 스케쥴러때문(일부만 변경가능)
    // 하지만 처음 시작은 언제나 같음
}
