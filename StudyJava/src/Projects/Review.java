package Projects;

import java.util.Scanner;

// 한번 쓴 필드 변수는 그냥 버리는 것이 좋음?
//  → 개발자들은 삭제되었다는 표시만 한다고 함

public class Review {
//    private String reviewId;
    private String loginId;
    private int lectureId;
    private int rating; // 1점 ~ 10점
    private String text;

    public Review() {
    }

    public Review(String loginId, int lectureId, int rating, String text) {
        this.loginId = loginId;
        this.lectureId = lectureId;
        this.rating = rating;
        this.text = text;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public int getLectureId() {
        return lectureId;
    }

    public void setLectureId(int lectureId) {
        this.lectureId = lectureId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
//        return "(" + reviewId + ": " + rating + ": " + ;
        return "(" + loginId + ": ," + lectureId + ": ," + rating + ": ," + text + ": )";
    }
}
