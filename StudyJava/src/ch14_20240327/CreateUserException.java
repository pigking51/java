package ch14_20240327;

// 1. 사용자 일반 예외
class MyException extends Exception{
    public MyException(){
        super();
    }
    public MyException(String message){
        super(message);
    }
}

// 2. 사용자 실행 예외 → 이쪽을 많이 사용한다고 함(그래도 하나만 할줄 알면 다 할줄 안다고 함)
// 보통은 src에 Exception패키지 하나 만들어서 넣어둔다고 함
class MyRTException extends RuntimeException{
    public MyRTException(){
        super();
    }
    public MyRTException(String message){
        super(message);
    }
}

class A{
    // 3. 사용자 정의 예외 객체 생성
    MyException me1 = new MyException();
    MyException me2 = new MyException("예외 메시지 : MyException");

    MyRTException mre1 = new MyRTException();
    MyRTException mre2 = new MyRTException("예외 메시지 : MyRTException");

    // 4. 예외 던지기(throw) : 던진 시점에서 예외 발생
    // 방법 ① 예외를 직접 처리
    void abc_1(int num){
        try{
            if(num > 70)
                System.out.println("정상 작동");
            else
//                throw me1;    // 예외를 던진 시점에 예외 발생
                 throw new MyException("나이가 70이하임 : " + num); // → 일반적으로 사용하는 방법
                // 아래있는 catch와 같아야 한다(다르면 해당 ID가 catch에 없다는 오류뜸)

        } catch (MyException e){
            System.out.println("예외 처리 1");
            System.out.println(e.getMessage());
        }
    }
    void bcd_1(){
        abc_1(65);
    }
    // 방법 ② 예외 전가
    // 한번에 몰아서 처리하기 위한 방법임
    // throws를 사용하면 호출한 녀석이 처리해야됨
    // Java를 공부하는 사람에게 있어 예외처리는 필수적으로 알아둬야됨
    // 계속 전가하다가 main() 메서드조차 throws를 했을때 :
    void abc_2(int num) throws MyException{
        if(num > 70){
            System.out.println("정상 작동");
        }else{
//            throw me1;
            throw new MyException("예외전가 == > 조건에 맞지 않음 : " + num);
        }
    }
    void bcd_2(){
        try{
            abc_2(65);
        }catch(MyException e){
            System.out.println("예외 처리 2");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
public class CreateUserException {
    public static void main(String[] args) {
        A a = new A();
        a.bcd_1();
        a.bcd_2();
    }
}
