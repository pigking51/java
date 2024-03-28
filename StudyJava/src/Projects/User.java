package Projects;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class User {
    String name;
    String loginId;
    String password;
    String email;
    String address;
    int call;

//    LocalDate birthDate; // 이걸 사용하면 빠르고 늦는 것을 확인할 수 있음

    public User() {
    }

    public User(String name, String loginId, String password, String email, String address, int call) {
        this.name = name;
        this.loginId = loginId;
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

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
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
        return this.name + "(" + this.email + ")님 환영합니다!";
    }
}
