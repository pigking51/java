package Projects;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


    //  1. 유저, 강의, 수강관리 클래스 생성 후 ArrayList에 담기
        //  User 정보
        ArrayList<User> userProfiles = new ArrayList<>();
        User userProfile1 = new User("Steve", "aweSteve123", "adqfqwdq", "Steve123@daum.net", "potatoCity", 01066544434);
        userProfiles.add(userProfile1);
        User userProfile2 = new User("Tom", "qwerty12", "sdad12452", "Tomcat12345@google.com", "orangeCity", 01066214452);
        userProfiles.add(userProfile2);
        User userProfile3 = new User("susie", "susieQ", "sususu12341", "suQ2324@naver.com", "palletTown", 01065544034);
        userProfiles.add(userProfile3);
        User userProfile4 = new User("James", "poojkoke", "adqfqwdq", "chlrjs@daum.net", "City", 0106623434);
        userProfiles.add(userProfile4);
        User userProfile5 = new User("Mike", "pokemt", "adqfqwdq", "pototo@daum.net", "potato", 01065454434);
        userProfiles.add(userProfile5);

        //  Lecture 정보
        ArrayList<Lecture> lectureProfiles = new ArrayList<>();
        Lecture lectureProfile1 = new Lecture("Java", "Seo", "backEnd", 1, 1, 54, 1);
        lectureProfiles.add(lectureProfile1);
        Lecture lectureProfile2 = new Lecture("Javascript", "Kim", "frontEnd", 2, 1, 54, 1);
        lectureProfiles.add(lectureProfile2);
        Lecture lectureProfile3 = new Lecture("figma", "Cheon", "UI/UX", 3, 1, 54, 1);
        lectureProfiles.add(lectureProfile3);

        //  수강신청 정보
        ArrayList<LectureRegistration> lectureRegistrations = new ArrayList<>();
        LectureRegistration lectureRegister1 = new LectureRegistration("aweSteve123", 1);
        lectureRegistrations.add(lectureRegister1);
        LectureRegistration lectureRegister2 = new LectureRegistration("qwerty12", 3);
        lectureRegistrations.add(lectureRegister2);
        LectureRegistration lectureRegister3 = new LectureRegistration("susieQ", 2);
        lectureRegistrations.add(lectureRegister3);
        LectureRegistration lectureRegister4 = new LectureRegistration("poojkoke", 3);
        lectureRegistrations.add(lectureRegister4);
        LectureRegistration lectureRegister5 = new LectureRegistration("pokemt", 1);
        lectureRegistrations.add(lectureRegister5);

    //  2. 강의 1번 수강생의 로그인 ID 찾기
//        for(int i = 0; i < lectureRegistrations.size(); i++){
//            if(lectureRegistrations.get(i).lectureNum == 1){
//                System.out.println(lectureRegistrations.get(i).loginId);
//            }
//        }
//        System.out.println();

        secondMethod(lectureRegistrations);
        System.out.println();

//    //  3. 로그인 ID로 강의명 찾기
//        Scanner sc3 = new Scanner(System.in);
//        System.out.println("로그인 ID를 입력해주세요 : ");
//        Object LoID = sc3.nextLine();
//
//        for(int i = 0; i < lectureRegistrations.size(); i++){
//        if(Objects.equals(lectureRegistrations.get(i).loginId, LoID)){
//            for(int j = 0; j < lectureProfiles.size(); j++){
//            if(lectureRegistrations.get(i).lectureNum == lectureProfiles.get(j).lectureNum){
//                System.out.println(lectureProfiles.get(j).lecName);
//            }
//            }
//        }
//        };


//        for(int i = 0; i < lectureRegistrations.size(); i++){
//            if(LoID.equals(lectureRegistrations.get(i).loginId)){
//                System.out.println(lectureRegistrations.get(i).lectureNum);
//                for(int j = 0; j < lectureProfiles.size(); j++){
//                    if(lectureRegistrations.get(i).lectureNum == lectureProfiles.get(j).lectureNum){
//                        System.out.println(lectureProfiles.get(j).lecName);
//
//                    }
//                }break;
//            }else{
//                System.out.println("찾을 수 없습니다!");
//                break;
//            }
//        };

        thirdMethod(lectureRegistrations, lectureProfiles);
        System.out.println();

//    //  4. 강의명으로 수강생들의 이메일 찾기
//        Scanner sc4 = new Scanner(System.in);
//        System.out.println("강의명을 입력해주세요! : ");
//        Object LecName = sc4.nextLine();
//        Object nugu = "";
//        for(int i = 0; i < lectureProfiles.size(); i++){
//            if(Objects.equals(lectureProfiles.get(i).lecName, LecName)){
//                nugu = lectureProfiles.get(i).lectureNum;
//                for(int j = 0; j < lectureRegistrations.size(); j++){
//                    if(Objects.equals(lectureRegistrations.get(j).lectureNum, nugu)){
//                        Object lID = lectureRegistrations.get(j).loginId;
//                        for(int k = 0; k < userProfiles.size(); k++){
//                            if(Objects.equals(userProfiles.get(k).loginId, lID)){
//                                System.out.println(userProfiles.get(k).email);
//                            }
//                        }
//                    }
//                }
//            }
//        }
        fourthMethod(lectureProfiles, lectureRegistrations, userProfiles);
        System.out.println();
   }
    //  2. 강의 1번 수강생의 로그인 ID 찾기(메소드)
   public static void secondMethod(ArrayList<LectureRegistration> x){
        for(int i = 0; i < x.size(); i++){
           if(x.get(i).lectureNum == 1){
               System.out.println(x.get(i).loginId);
           }
        }
   }

    //  3. 로그인 ID로 강의명 찾기(메소드)
    public static void thirdMethod(ArrayList<LectureRegistration> lectureRegistrations, ArrayList<Lecture> lectureProfiles){
        Scanner sc3 = new Scanner(System.in);
        System.out.println("로그인 ID를 입력해주세요 : ");
        Object LoID = sc3.nextLine();


        for(int i = 0; i < lectureRegistrations.size(); i++) {
            if (Objects.equals(lectureRegistrations.get(i).loginId, LoID)) {

                for (int j = 0; j < lectureProfiles.size(); j++) {
                    if (lectureRegistrations.get(i).lectureNum == lectureProfiles.get(j).lectureNum) {
                        System.out.println(lectureProfiles.get(j).lecName);
                    }
                }
            }
        }
    }

    //  4. 강의명으로 수강생들의 이메일 찾기(메소드)
    public static void fourthMethod(ArrayList<Lecture> lectureProfiles, ArrayList<LectureRegistration>
            lectureRegistrations, ArrayList<User> userProfiles){
        Scanner sc4 = new Scanner(System.in);
        System.out.println("강의명을 입력해주세요! : ");
        Object LecName = sc4.nextLine();
        Object nugu = "";
        for(int i = 0; i < lectureProfiles.size(); i++){
            if(Objects.equals(lectureProfiles.get(i).lecName, LecName)){
                nugu = lectureProfiles.get(i).lectureNum;
                for(int j = 0; j < lectureRegistrations.size(); j++){
                    if(Objects.equals(lectureRegistrations.get(j).lectureNum, nugu)){
                        Object lID = lectureRegistrations.get(j).loginId;
                        for(int k = 0; k < userProfiles.size(); k++){
                            if(Objects.equals(userProfiles.get(k).loginId, lID)){
                                System.out.println(userProfiles.get(k).email);
                            }
                        }
                    }
                }
            }
        }
    }
}




