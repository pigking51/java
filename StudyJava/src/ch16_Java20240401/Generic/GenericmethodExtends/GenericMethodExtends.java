package ch16_Java20240401.Generic.GenericmethodExtends;

class AA {
    public <T extends Number> void methods1(T t){ // 이렇게 하면 Number가 가진 모든 것을 사용할 수 있음
        // → int, long, float, double 사용 가능
        System.out.println(t.intValue());
    }
}
interface MyInterface{
    public abstract void print();
}
class BB {
    public <T extends MyInterface> void method1(T t){ // 제네릭에서는 인터페이스도 extends로 사용할 수 있다
        // 사용자가 정의한 MyInterface의 자식만 제네릭T 위치에 올 수 있음
        // 이렇게 함으로써 사용자 정의 메소드만 print()를 사용할 수 있게 됨
        t.print();
    }
}

class CC implements MyInterface{ // 인터페이스의 구현체

    @Override
    public void print() {
        System.out.println("print() 구현2");
    }
}
public class GenericMethodExtends {
    public static void main(String[] args) {
        AA a = new AA();
        a.methods1(5.8); // <double>

        BB b = new BB();
        b.method1(new MyInterface() { // 1) 익명 이너 클래스 사용한 경우
            @Override
            public void print() {
                System.out.println("print() 구현");
            }
        });
        b.method1(new CC()); // 2) MyInterface의 구현체를 사용한 경우
        // 익명 이너클래스 사용 시 한번 사용할때는 편하지만
        // 여러 번 사용할때는 일일히 만들어줘야되서 불편하다는 단점이 있음
    }
}
