package ch10_20240314;

class A{
    void abc(){
        System.out.println("A 클래스의 abc()");
    }
}
class B extends A{
    void abc(){
        System.out.println("B 클래스의 abc()");
    }
    void bcd(){
        abc(); // this.abc();
    }

}
public class Java20240314SuperKeyword {

}
