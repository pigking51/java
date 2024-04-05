package ch16_Java20240401.example.example2;

class MyClass{
    public <T> T MyMethod(T t){
        return t;
    }
}
public class Example2_240401 {
    public static void main(String[] args) {
        // MyClass 객체 생성 + 제네릭메소드 호출
        MyClass mc = new MyClass();
        String out1 = mc.<String>MyMethod("감사");
        Integer out2 = mc.<Integer>MyMethod(3);
        Double out3 = mc.<Double>MyMethod(5.8);

        System.out.println(out1);
        System.out.println(out2);
        System.out.println(out3);
    }
}
