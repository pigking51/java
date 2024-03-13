class Example {
    int m;
    int n;
    void init(int a, int b){
        int c;
        c = 3;
        this.m = a;
        this.n = b;
    }
    void work(){
        this.init(2, 3);
    }
}
public class Java20240311EX {
    public static void main(String[] args) {
        Example a = new Example();
        a.work();
        System.out.println(a.m);
        System.out.println(a.n);
    }

}
