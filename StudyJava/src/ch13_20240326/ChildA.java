package ch13_20240326;

public class ChildA implements A, B { // extends Object가 생략되있는것임
    @Override
    public void abc() {
        System.out.println("child of A");
    }

    @Override
    public void bcd() {
        System.out.println("child of B");
    }
}
