package ch12_240325;

public class JavaChild extends Java240325Abstract {
// 이거 연습해보다 문제뜨면 지웠다가 다시쓰면 문제 사라짐
    public JavaChild(){
        super();
    }
 
    public JavaChild(int a, String b) {
        super(a, b);
    }
    // 위의 2개는 필수는 아니지만 이용할거면 추가해야되는거

    // → 상속 시 이게 자동으로 생성되었다고 보면 됨( a : 10, b : Default 써져있는거)
    // 그리고 abstract가 되어있기에 b값은 영향을 받지 않고 아래 값을 반환할수 있게 만들어지는거?
    @Override
    public String getString() { // 옆에 나와있는 I표시는 Implement를 나타내는 것임
//        return "이것은 자식 클래스";
        return super.b;
    }
    // ↑ 이거는 필수

    public void setValue(int a){
        super.setValue(a); // 자식은 해당 변수를 가지고있지 않기때문에 설정해줘야되는것(부모의 a, b와 다름), java 스타일
        // java는 getter와 setter를 사용하는 것을 추천!!!
        // super.a = a; // 비추천, java스타일이 아님

    }

    public void setString(String b){
        super.setString(b); // 자식은 해당 변수를 가지고있지 않기때문에 설정해줘야되는것(부모의 a, b와 다름)
        // super.b = b;
    }
}
