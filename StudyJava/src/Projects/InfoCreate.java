package Projects;

import java.time.LocalDate;
import java.util.ArrayList;

public class InfoCreate {
    public static void createInfors(){
        //  1. 유저, 강의, 수강관리 클래스 생성 후 ArrayList에 담기
        //  User 정보
        Main.userProfiles = new ArrayList<>();
        User userProfile1 = new User("Steve", "aweSteve123", "adqfqwdq", "Steve123@daum.net", "potatoCity", 01066544434, LocalDate.of(1990,1,5));
        Main.userProfiles.add(userProfile1);
        User userProfile2 = new User("Tom", "qwerty12", "sdad12452", "Tomcat12345@google.com", "orangeCity", 01066214452, LocalDate.of(1999,6,15));
        Main.userProfiles.add(userProfile2);
        User userProfile3 = new User("susie", "susieQ", "sususu12341", "suQ2324@naver.com", "palletTown", 01065544034, LocalDate.of(2002,7,16));
        Main.userProfiles.add(userProfile3);
        User userProfile4 = new User("James", "poojkoke", "adqfqwdq", "chlrjs@daum.net", "City", 0106623434, LocalDate.of(2010,10,21));
        Main.userProfiles.add(userProfile4);
        User userProfile5 = new User("Mike", "pokemt", "adqfqwdq", "pototo@daum.net", "potato", 01065454434, LocalDate.of(1988, 12, 21));
        Main.userProfiles.add(userProfile5);

        //  Lecture 정보
        Main.lectureProfiles = new ArrayList<>();
        Lecture lectureProfile1 = new Lecture("Java", "Seo", Category.BACKEND, 1, 1, 54, 1);
        Main.lectureProfiles.add(lectureProfile1);
        Lecture lectureProfile2 = new Lecture("Javascript", "Kim", Category.FRONTEND, 2, 1, 54, 1);
        Main.lectureProfiles.add(lectureProfile2);
        Lecture lectureProfile3 = new Lecture("figma", "Cheon", Category.UIUX, 3, 1, 54, 1);
        Main.lectureProfiles.add(lectureProfile3);

        //  수강신청 정보
        Main.lectureRegistrations = new ArrayList<>();
        LectureRegistration lectureRegister1 = new LectureRegistration("aweSteve123", 1);
        Main.lectureRegistrations.add(lectureRegister1);
        LectureRegistration lectureRegister2 = new LectureRegistration("qwerty12", 3);
        Main.lectureRegistrations.add(lectureRegister2);
        LectureRegistration lectureRegister3 = new LectureRegistration("susieQ", 2);
        Main.lectureRegistrations.add(lectureRegister3);
        LectureRegistration lectureRegister4 = new LectureRegistration("poojkoke", 3);
        Main.lectureRegistrations.add(lectureRegister4);
        LectureRegistration lectureRegister5 = new LectureRegistration("pokemt", 1);
        Main.lectureRegistrations.add(lectureRegister5);

        //  Review 정보
        Main.createReviews = new ArrayList<>();
    }

}
