package ch12_240325;

abstract public class Java240325Abstract {
    // 클래스 구성요소

    // 1. 필드
    int a;
    String b;

    // 2.생성자

    public Java240325Abstract() {
        this.a = 10;
        this.b = "Default";
    }
    // ↑ 기본생성자(*꼭 만들어야함!!)

    public Java240325Abstract(int a, String b) {
        this.a = a;
        this.b = b;
    }

    // 3. 메서드
    public int getValue(){
        return a;
    }
    abstract public String getString();
    // ↑ 얘는 반드시 오버라이딩 해야되는거고, 나머지 3개는 하던 안하던 상관은 없다

    public void setValue(int a){ // 세터(setter) 메서드(반드시 있을필요는 없지만 있으면 좋은거)
        this.a = a;
    }
    public void setString(String b){ // 세터(setter) 메서드(반드시 있을필요는 없지만 있으면 좋은거)
        this.b = b;
    }
}
