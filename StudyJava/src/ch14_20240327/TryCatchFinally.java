package ch14_20240327;

public class TryCatchFinally {
    public static void main(String[] args){
        // 시험에 나오기 쉬운 문제 (해당 코드의 결과로 무엇이 나오겠느냐)
        // 1. try-catch
        try{
            System.out.println(3 / 1); // 실행예외(ArithmeticException)
            System.out.println("프로그램 종료 1");
        }
        catch(ArithmeticException e){ // 예상이 되는 예외만 catch해서 실행되는것임
            // * ArithmeticException : 산술적 예외처리
            // 저 자리에 Exception을 넣으면 굳이 다른 여러 exception클래스 쓰지 않고
            // 한번에 쓰는 것이 가능
            // 보통은 많이 나오는 exception을 먼저 따로 catch구문 만들어주고
            // 나머지는 Exception으로 뭉뚱그려서 뒤에 catch구문으로 만듦
            System.out.println("숫자는 0으로 나눌 수 없습니다.");
            System.out.println("프로그램 종료 2");
        }
//        System.out.println("--------catch-try 예제 끝----------");
        // → try-catch구문 밖에서도 실행은 가능하지만 의미없게되므로 되도록
        // 구문 안에서만 사용할 것

        // 2. try-catch-finally
        try{
            System.out.println(3 / 1); // 실행예외(ArithmeticException)
            int a = Integer.parseInt("20");
            int[] arr = {1, 2, 3, 4, 5};
            arr[5] = 6; // ArrayIndexOutOfBoundsException → Exception 안썼으면 나오는 예외
            System.out.println("프로그램 종료 1");
        }
        catch(ArithmeticException e){
            System.out.println("숫자는 0으로 나눌 수 없습니다.");
            System.out.println("프로그램 종료 2");
        }
        catch(NumberFormatException e){
            System.out.println("숫자로 변환할 수 없습니다.");
        }
        catch(NullPointerException e){
            System.out.println("Null 관리 좀 잘하지");
        }
        catch(Exception e){
            System.out.println("예기치 못한 문제로 인하여 프로그램을 종료합니다.");
            // 개발자들은 안쓰려고 하고 관리자들은 계속 추가하려고 하는 일이 있다고 함
            // 이것만 쓸 수는 있지만 되도록 발생 잘 되는 예외상황 좀 써주고 나머지를
            // 이렇게 처리해주는 것이 좋은듯?

            // 다른 catch 위에 Execption을 try 바로 아래에 적어버리면
            // 아래쪽 catch예외들이 전부 무용지물이기에 오류가 뜸
            // → 원래 만들었던 예외처리가 적용되지 않음
            // 고로 범위가 큰 예외처리는 아래로 두어야됨
        }
        finally{
            // 정상이던지 비정상이던지 마지막 내용을 넣을거면 finally안에 쓸 것!!!
            // → 다시언급하지만 구문 아래에 써도 문제는 없지만 의미없다는거!!!!
            System.out.println("프로그램 종료 3");
        }
        
        // try 밖에 실행코드를 넣는 것은 좋지 않음.
        // 이 위치는 예외가 발생해도 실행이 되기 때문에 실행코드의 의미가 없음
        // 정상의 경우라면 try 또는 finally 안에서 실행코드를 마무리하는 것이 좋음
    }
}
