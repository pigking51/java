package ch10_20240314.MyClass;

class MyClass{}
public class Java20240314MyClass {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        System.out.println(myClass.toString());
        // println 자체가 내용을 출력하는 것이라 .toString()가
        // 작동할 필요가 없어 작동 안하는 것
    }
}
