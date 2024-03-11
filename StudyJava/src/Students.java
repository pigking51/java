public class Students {


    private String name;
    private int age;
    private String address;
    private String personalNum;

    public Students() { // 기본생성자
    }

    public Students(String name, int age, String address, String personalNum) {
        // 생성자의 특징(클래스를 생성하는 역할을 하는 메소드, 생성시에만 사용)
        // 1. 반환(리턴)타입이 없음
        // → 생성하는 역할 이외의 일이 없기때문
        // 2. 클래스와 이름이 똑같다
        // →

        this.name = name;
        this.age = age;
        this.address = address;
        this.personalNum = personalNum;
    }
    public Students(String name, int age, String address) {

        this.name = name;
        this.age = age;
        this.address = address;
    }

    // getter : 읽는녀석 read
    // setter : 쓰는녀석 write
    // public void 메소드이름(파라미터) → parameter
    // 파라미터 == 매개변수
    // System.out.println("Java");, System.out.println(a);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPersonalNum() {
        return personalNum;
    }

    public void displayName() { // 메소드
        System.out.println(this.name);
    }
    public void displayAge() {
        System.out.println(this.age);
    }
    public void displayAddress(){
        System.out.println(this.address);
    }
    public void displayAll(){
        System.out.println(this.name + " " + this.age + " " + this.address);
    }
    
}



