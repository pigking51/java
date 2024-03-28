package Projects;

public class LectureRegistration {
    String loginId;
    int lectureNum;

    public LectureRegistration() {
    }

    public LectureRegistration(String loginId, int lectureNum) {
        this.loginId = loginId;
        this.lectureNum = lectureNum;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public int getLectureNum() {
        return lectureNum;
    }

    public void setLectureNum(int lectureNum) {
        this.lectureNum = lectureNum;
    }
}
