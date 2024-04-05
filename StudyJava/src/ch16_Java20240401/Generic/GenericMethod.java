package ch16_Java20240401.Generic;

class GenericMethods { // 일반클래스 안에 정의한 제네릭메소드 예제
    public int method0 (int a){ // 일반 메소드
        return a;
    }
    public <T> T method1(T t){ // 제네릭 메소드
        return t;
    }
    public <T> boolean method2(T t1, T t2){ // 제네릭 타입은 1개만 씀 ()안의 변수 갯수는 <>안의 갯수와 관련없?
        return t1.equals(t2);
    }

    public <K,V> void method3(K k, V v){ // 2개의 제네릭타입을 사용
        System.out.println(k + " " + v);
    }
    public <AA, BB, CC> void method4(AA a, BB b, CC c){ // 3개의 제네릭타입을 사용
        System.out.println(a + " " + b + " " + c);
    }
    
    // 제네릭메소드 내부에서 사용할 수 있는 메소드
    // 반드시 제네릭 T의 위치에 올 수 있는 모든 클래스들이 사용 가능한 메소드만 쓸 수 있다
    public <T> void method6(T t){
//        System.out.println(t.length()); // 오류, String 클래스라고 단정할 수 없음
        // length()는 String에 대한거, length는 배열에 대한 거
        System.out.println(t.equals("안녕")); // 모든 클래스의 부모 Object의 메소드는 가능
    }
}
public class GenericMethod {
    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        String str1 = gm.<String>method1("안녕"); // 이것이 원래의 문법
        String str2 = gm.method1("안녕"); // <String> 생략 → 앞뒤정보로 유추가능하기 때문
        System.out.println(str1);
        System.out.println(str2);

        boolean bool1 = gm.<Double>method2(2.5, 2.5);
        boolean bool2 = gm.method2(2.5, 2.5);  // <Double>생략
        System.out.println(bool1);
        System.out.println(bool2);
        
        gm.<String, Integer> method3("국어", 80);
        gm.method3("국어", 80); // <String, Integer> 생략

        gm.<String, Double, Integer>method4("평균", 98.5, 10);
        gm.method4("평균", 98.5, 10); // <String, Double, Integer> 생략
    }
}
