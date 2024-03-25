package ch12_240325.JavaEx;

import java.util.Arrays;

public class Students {

    String name;

    String department;

    int studentId;

    public Students() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String Sum(){
        return this.name + this.department + this.studentId;
    }

}
