package Java240920Thread;

public class Thread0 {
//    각 프로세스 간에는 완전히 독립적()
//    그러나 스레드는 힙, 메모리 등은 자원을 공유하고 스택만을 공유하지 않음
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5};
        String[] strArray = {"하나", "둘", "셋", "넷", "다섯"};
        for (int i = 0; i<intArray.length; i++){
            System.out.println("(비디오프레임) " + intArray[i]);
            // Thread 사용시에는 try catch문 안에서 사용해야함(안그러면 오류발생함)
            // Thread.slppe() 안의 숫자 단위는 ms
            try{Thread.sleep(200);}catch(InterruptedException e){}
        }
        for (int i = 0; i<strArray.length; i++){
            System.out.println("(자막번호) " + strArray[i]);
            // Thread 사용시에는 try catch문 안에서 사용해야함(안그러면 오류발생함)
            // Thread.slppe() 안의 숫자 단위는 ms
            try{Thread.sleep(200);}catch(InterruptedException e){}
        }


    }

}
