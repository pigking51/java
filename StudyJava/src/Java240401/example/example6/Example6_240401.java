package Java240401.example.example6;

class A <K> {
    K k;

    public void setK(K k) {
        this.k = k;
    }
}
class B<T, V> extends A<T>{
    V v;
    public void setV(V v){
        this.v = v;
    }
    public void print(){
        System.out.println(k + " " + v);
    }
}

public class Example6_240401 {

    public static void main(String[] args) {
        B <Integer, String> b = new B<>();
        b.setK(1);
        b.setV("감사");
        b.print();
    }
}

