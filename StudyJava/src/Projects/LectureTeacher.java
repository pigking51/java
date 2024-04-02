package Projects;

import java.util.ArrayList;

class LectureTeacher<Name, Subject> {

   private String teacherNum;
   private Name name;
   private Subject subject;

    public LectureTeacher() {
    }

    public LectureTeacher(Name name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getTeacherNum() {
        return teacherNum;
    }

    public void setTeacherNum(String teacherNum) {
        this.teacherNum = teacherNum;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return name + "선생님께서 강의하시는 과목은" + subject + "입니다.";
    }
}
