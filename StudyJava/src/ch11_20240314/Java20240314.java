package ch11_20240314;

public class Java20240314 {
    // this : 나 자신의 생성자
    // super : 부모의 생성자 (super.필드, super.메소드, super())
    // super()는 부모의 생성자를 호출하는 것
    // 클래스 내의 생성자에서 this(), super() 호출할때는
    // 그 구문의 제일 위에다가 입력할 것(메모리 구조적으로 먼저 부모생성 → 자식생성)
    //

    // String equals와 equals(object)의 차이
    // String equals는 문자열 그대로의 비교, 오버라이딩 된 것
    // equals(obj)는 오버라이딩 된 것이 아니라 참조주솟값을 비교
    // → 오버라이딩을 해서 입맛에 맞게 바꿔야함
    
    // hashmap은 반드시 <key, value>로 이루어져 있다.
    // key : 유니크한 값, 중복될 수 없음
    // hashmap은 반드시 <>표시 있어야되고, 그 안에 키, 값이 반드시 포함되야 한다

}
