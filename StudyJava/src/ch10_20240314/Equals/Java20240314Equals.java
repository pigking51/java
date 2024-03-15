package ch10_20240314.Equals;


class A{
    String name;
    A(){}
    A(String name){ this.name = name;}
}
class B{
    String name;
    B(){}
    B(String name){ this.name = name;}
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof B) {
            if (this.name == ((B) obj).name)
                return true;
            }
                return false;
    }
    @Override
    public int hashCode(){ return name.hashCode();}
    @Override
    public String toString(){ return name;}
}

public class Java20240314Equals {
    public static void main(String[] args) {
        A a1 = new A("안녕");
        A a2 = new A("안녕");
        System.out.println(a1 == a2);
        System.out.println(a1.equals(a2));

        B b1 = new B("안녕");
        B b2 = new B("안녕");
        System.out.println(b1 == b2);
        System.out.println(b1.equals(b2));
    }
}





