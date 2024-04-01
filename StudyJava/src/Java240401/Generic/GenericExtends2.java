package Java240401.Generic;

class E {}
class F extends E {}
class G extends F {}
class H extends G {}

class Goods3<T> {
    private T t;
    public T get() {return t;}
    public void set(T t){ this.t = t;}
}

// 제네릭 클래스를 메소드의 입력매개변수(parameter)로 사용하는 경우의 문법!!!
class Test {
    void method1(Goods3<E> g){} // 입력매개변수를 입력하는 것이기에(입력단계) <T>를 쓰는 것이 아닌 구체적인 클래스를 적어야됨
        // <T>를 사용할 수 없음 : 구체적인 클래스를 명시(<T>는 정의단계에서만 입력)
    void method2(Goods3<?> g){} // ? : 이 자리에 어떤 클래스던 올 수 있음
    void method3(Goods3<? extends F> g){} // F와 F의 자식들로 제한
    void method4(Goods3<? super F> g){} // F와 F의 부모들로 제한 * 문법적으로는 있는 것이지만 거의 안쓰는듯?
}

public class GenericExtends2 {
    public static void main(String[] args) {
        Test test = new Test();
        // case 1 : Goods<E>
        test.method1(new Goods3<E>()); // A만 가능
        //test.method1(new Goods3<F>()); // 불가능

        // case 2 : <?>
        test.method2(new Goods3<E>()); // 가능
        test.method2(new Goods3<F>()); // 가능
        test.method2(new Goods3<G>()); // 가능
        test.method2(new Goods3<H>()); // 가능

        // case 3 : Goods3<? extends F>
        //test.method3(new Goods3<E>()); // F와 F의 자식클래스만 가능하기에 불가능
        test.method3(new Goods3<F>());
        test.method3(new Goods3<G>());
        test.method3(new Goods3<H>());

        // case 4 : Goods3<? super F>
        test.method4(new Goods3<E>());
        test.method4(new Goods3<F>());
        //test.method4(new Goods3<G>()); // F와 F의 부모클래스만 가능하기에 불가능
        //test.method4(new Goods3<H>()); // F와 F의 부모클래스만 가능하기에 불가능

    }
}
