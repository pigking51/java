package Projects;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    static ArrayList<User> userProfiles;
    static ArrayList<Lecture> lectureProfiles;
    static ArrayList<LectureRegistration> lectureRegistrations;


    public static void main(String[] args) {

    // 정보 초기화
//        InfoCreate.createInfors(userProfiles, lectureProfiles, lectureRegistrations);
        InfoCreate.createInfors(); // → 이렇게만 할 경우 배열 파일에 있는 배열 전체 앞에 Main. 을 붙인다.


    //  2. 강의 1번 수강생의 로그인 ID 찾기
//        for(int i = 0; i < lectureRegistrations.size(); i++){
//            if(lectureRegistrations.get(i).lectureNum == 1){
//                System.out.println(lectureRegistrations.get(i).loginId);
//            }
//        }
//        System.out.println();

        secondMethod(lectureRegistrations);
        System.out.println();
        // 클래스 바로 아래에서 ArrayList 적용한 메서드
        getLoginIdByLecture(1);

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

    public static void getLoginIdByLecture(int x){
        for(int i = 0; i < lectureRegistrations.size(); i++){
            if(lectureRegistrations.get(i).lectureNum == x){
                System.out.println("1. 학생 : " + lectureRegistrations.get(i).loginId);
            }
        }
        System.out.println();
    }

    public static void getTitleByLoginId(){
        Scanner sc3 = new Scanner(System.in);
        System.out.println("로그인 ID를 입력해주세요 : ");
        Object LoID = sc3.nextLine();

        for(int i = 0; i < lectureRegistrations.size(); i++){
        if(Objects.equals(lectureRegistrations.get(i).loginId, LoID)){
            for(int j = 0; j < lectureProfiles.size(); j++){
            if(lectureRegistrations.get(i).lectureNum == lectureProfiles.get(j).lectureNum){
                System.out.println("2. 수강과목명 : " + lectureProfiles.get(j).lecName);
            }
            }
        }
        };
    }

    public static void getEmailByLectureTitle(){
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
                                System.out.println("3. 이메일 주소 : " + userProfiles.get(k).email);
                            }
                        }
                    }
                }
            }
        }
    }

}




