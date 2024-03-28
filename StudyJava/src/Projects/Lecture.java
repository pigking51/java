package Projects;

public class Lecture { // 유니크한 값을 만들어야 한다 ex) User의 경우 중복체크 하는 ID나 이메일같은거
    String lecName;
    String lecTeacher;
    String category;
    int lectureNum;
    int play;
    int during;
    int grade;

    public Lecture() {
    }

    public Lecture(String lecName, String lecTeacher, String category, int lectureNum, int play, int during, int grade) {
        this.lecName = lecName;
        this.lecTeacher = lecTeacher;
        this.category = category;
        this.lectureNum = lectureNum;
        this.play = play;
        this.during = during;
        this.grade = grade;
    }

    public String getLecName() {
        return lecName;
    }

    public void setLecName(String lecName) {
        this.lecName = lecName;
    }

    public String getLecTeacher() {
        return lecTeacher;
    }

    public void setLecTeacher(String lecTeacher) {
        this.lecTeacher = lecTeacher;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getLectureNum() {
        return lectureNum;
    }

    public void setLectureNum(int lectureNum) {
        this.lectureNum = lectureNum;
    }

    public int getPlay() {
        return play;
    }

    public void setPlay(int play) {
        this.play = play;
    }

    public int getDuring() {
        return during;
    }

    public void setDuring(int during) {
        this.during = during;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "현재 듣고계신 강의는" + this.lecTeacher+"선생님의"+ this.lecName + "강의 입니다(" + this.play + "번의 재생)" ;
    }
}
