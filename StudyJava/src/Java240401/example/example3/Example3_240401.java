package Java240401.example.example3;

class A{}
interface B{}

// A 또는 A의 자식 클래스만 제네릭 타입으로 지정 가능
class MyGenericA<T extends A >{

}

// B 또는 B의 자식 클래스만 제네릭 타입으로 지정 가능
class MyGenericB<T extends B >{
    
}
public class Example3_240401 {
}
