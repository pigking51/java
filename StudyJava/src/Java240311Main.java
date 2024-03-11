public class Java240311Main {
    public static void main(String[] args) {
        // 클래스에 생성자가 없는 경우 ==> 기본생성자가 자동으로 만들어짐
        // 매개변수가 있는 생성자인 경우 ==> 기본생성자는 만들어지지 않는다!!
        // 생성자의 오버로딩
        Students a = new Students();
        Students tom = new Students("Tom", 20, "Seoul", "1235634");
        Students steve = new Students("Steve", 25, "LA");
        
    }
}
