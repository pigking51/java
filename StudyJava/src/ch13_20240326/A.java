package ch13_20240326;

public interface A {
    int a = 10; // 이 필드는 제한적인 영역(그렇기에 값을 변경할 수가 없음)
    // → 유니크한 ID
    // 인터페이스는 추상메서드(미완성메서드)로 이루어져 있음
    // 인터페이스는 기본적으로 양방통신을 목적으로 만들어졌기 때문에 public 사용
    public abstract void abc();
}
