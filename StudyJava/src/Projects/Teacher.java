package Projects;
public class Teacher {
    String name;
    String teacherId;
    String password;
    String email;
    String address;
    int call;

    public Teacher() {
    }

    public Teacher(String name, String teacherId, String password, String email, String address, int call) {
        this.name = name;
        this.teacherId = teacherId;
        this.password = password;
        this.email = email;
        this.address = address;
        this.call = call;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCall() {
        return call;
    }

    public void setCall(int call) {
        this.call = call;
    }

    @Override
    public String toString() {
        return "해당 과목을 가르치는 선생님은 " + name + "선생님 입니다.";

    }
}
