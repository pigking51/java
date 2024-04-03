package ch18_20240403;

interface CC{
    MyClass method();
}
interface CC2{
    MyClass method(int k);
}
class MyClass{
    int k;
    MyClass(){
        System.out.println("MyClass 기본 생성자");
    }
    MyClass(int k){
        System.out.println("매개변수 생성자" + k);
        this.k = k;
    }

}
public class ClassConstructor {
    public static void main(String[] args) {
        // 함수인터페이스 메소드가 외부클래스를 리턴하는 경우
        // 메소드 내에서 외부클래스의 생성자를 이용하여 객체를 생성해야 함
        CC a1 = new CC(){ // 익명 이너클래스 방식
            @Override
            public MyClass method() {
                return new MyClass();
            }
        };
        CC a2 = () -> new MyClass(); // 람다식 단축형 1
        CC a3 = MyClass::new; // 람다식 단축형 2
        a3.method();

        CC2 c1 = (int k) -> new MyClass(k);
        CC2 c2 = MyClass::new;
        c1.method(5);
        c2.method(15);
    }
}
