package ch12_240325;

public class Main {
    // 주로 패키지 이름을 쓰거나, 해당 앱 이름을 씀
    
   public static void main(String[] args) {
        // 클래스 안쪽에 있는 필드는 hep에 저장 
        // main안에 있는 지역변수는 stack에 저장
//        Java240325Abstract java240325Abstract = new Java240325Abstract(); // 추상클래스는 인스턴스화 안됨
        JavaChild javaChild = new JavaChild();  // 추상클래스를 상속한 클래스는 인스턴스화 가능
        System.out.println(javaChild.getValue());
        System.out.println(javaChild.getString());

        Java240325Abstract javaChild2 = new JavaChild(20, "Apple");
        System.out.println(javaChild2.getValue());
        System.out.println(javaChild2.getString());

        JavaChild javaChild3 = new JavaChild();
        javaChild3.setValue(999);
        javaChild3.setString("Banana");
        System.out.println(javaChild3.getValue());
        System.out.println(javaChild3.getString());
        System.out.println(javaChild3.b);
    }
}
