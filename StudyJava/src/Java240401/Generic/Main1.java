package Java240401.Generic;

class MyClass<T>{ // T는 어느 클래스던지 될 수 있음
    private T t; // t는 변수이기에 이름 아무렇게나 지어도 됨(T는 클래스를 인스턴스화 할때 반드시 정함 / new 만들때)
    public T get(){
        return t;
    }
    public void set(T t){
        this.t = t;
    }
}
public class Main1 {
    public static void main(String[] args) {
        MyClass<String> mc1 = new MyClass<String>(); // 클래스의 생성단계
        mc1.set("안녕"); // 생성단계에서 자료형을 결정했기 때문에 입력단계에서 특정 자료형만 받음!
        System.out.println(mc1.get());

        MyClass<Integer> mc2 = new MyClass<>(); // int로만 적으면 원시타입(previtive?)이라는 오류가 뜸 → wrapper클래스로써 Integer 입력하면 됨
        mc2.set(100);
        System.out.println(mc2.get());
    }
}

// Object는 정의부분, 생성부분 둘 다 어떤 것으로 타입을 지정할 지 모른다는 단점이 있지만,
// Generic은 생성부분에서 타입을 지정함(이것이 바람직한 구조라고 함)
