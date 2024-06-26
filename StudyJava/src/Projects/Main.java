package Projects;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.*;

public class Main {

    static ArrayList<User> userProfiles;
    static ArrayList<Lecture> lectureProfiles;
    static ArrayList<LectureRegistration> lectureRegistrations;
    static ArrayList<Review> createReviews;
    static ArrayList<Teacher> teacherProfiles;
    static List<String> getLectureTitleByTeacherIds = new ArrayList<>();



    public static void main(String[] args) {

    // 정보 초기화
//        InfoCreate.createInfors(userProfiles, lectureProfiles, lectureRegistrations);
        InfoCreate.createInfors(); // → 이렇게만 할 경우 배열 파일에 있는 배열 전체 앞에 Main. 을 붙인다.
        System.out.println(FreeBoard.replies.get(0).id);

    //  2. 강의 1번 수강생의 로그인 ID 찾기
//        for(int i = 0; i < lectureRegistrations.size(); i++){
//            if(lectureRegistrations.get(i).lectureNum == 1){
//                System.out.println(lectureRegistrations.get(i).loginId);
//            }
//        }
//        System.out.println();

//        secondMethod(lectureRegistrations);
//        System.out.println();
        // 클래스 바로 아래에서 ArrayList 적용한 메서드
//        getLoginIdByLecture(1);

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

//        thirdMethod(lectureRegistrations, lectureProfiles);
//        System.out.println();

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
//        fourthMethod(lectureProfiles, lectureRegistrations, userProfiles);
//        System.out.println();


//        createReview("x", 1,2,"a");


         getTeacherByLectureId();

        getLectureTitleListByTeacherId();

        createReview("x",1, 1, "a");

        // 답글 정보





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
                            if(Objects.equals(userProfiles.get(k).getLoginId(), lID)){
                                System.out.println(userProfiles.get(k).getEmail());
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
                            if(Objects.equals(userProfiles.get(k).getLoginId(), lID)){
                                System.out.println("3. 이메일 주소 : " + userProfiles.get(k).getEmail());
                            }
                        }
                    }
                }
            }
        }
    }

    MyException me1 = new MyException();
    MyException me2 = new MyException("예외 메시지 : MyException");

    public static boolean createReview(String loginID, int lectureId, int rating, String text) {
        // return형 메소드로 만들어도 void형태로 만들어도 문제없음
        // → 활용범위가 넓으니 이쪽으로 사용하는 것이 좋음
        try{
//        System.out.println("Id를 입력해주세요 : ");
//            // 강의 id는 이전에 리뷰작성한게 있는지 확인하는 것이기에
//            // 입력받은거랑 비교하는 것이 아닌 기존에 있는 자료와 비교하여 결과
//            // 리턴하는 것임
        for(int i = 0; i < createReviews.size(); i++){
             loginID = createReviews.get(i).getLoginId();
            lectureId = createReviews.get(i).getLectureId();
             if (!(Objects.equals(lectureId, lectureRegistrations.get(i).lectureNum)) || !(lectureRegistrations.get(i).loginId.contains(loginID))) {
                break;
             }
            else if((Objects.equals(lectureId, lectureRegistrations.get(i).lectureNum)) && (lectureRegistrations.get(i).loginId.contains(loginID))){
                System.out.println("이전에 입력하신 후기가 있습니다. 중복으로 후기를 작성하실 수 없습니다.");
                    break;
            } else if(!(Objects.equals(lectureId, lectureRegistrations.get(i).lectureNum)) && !(lectureRegistrations.get(i).loginId.contains(loginID))){
                throw new MyException("잘못된 ID입니다.");
            }
        }


//        for(int i = 0; i < lectureRegistrations.size(); i++){
//
//            if(lectureId == lectureRegistrations.get(i).lectureNum &&
//            lectureRegistrations.get(i).loginId.equals(loginID)){
//                break;
//                // boolean 타입의 변수이름은 isxxx 혹은 canxxx 등의 이름을 사용한다고 함
//            }else{
//                throw new MyException("수강하지 않은 과목입니다.");
//            }
//        }
        Scanner sc5 = new Scanner(System.in);
        System.out.println("점수를 입력해주세요(1~10점 사이) : ");
        rating =Integer.valueOf(sc5.next());
//        rating = createReviews.get().getRating();
        if(!(rating >= 0 && rating <= 10)){
            throw new MyException("점수가 잘못되었습니다.");
        }
        System.out.println("리뷰를 입력해주세요 : ");
        text = sc5.next();
        System.out.println();

        }
        catch (MyException e){
            System.out.println("505 오류");
            System.out.println(e.getMessage());
        }

        Review createReview = new Review(loginID,lectureId,rating,text);
        createReviews.add(createReview);
          return true;
    }

   public static boolean getTeacherByLectureId(){
        Scanner sc6 = new Scanner(System.in);
       System.out.println("과목 ID를 입력해주세요 : ");
       Object subId = sc6.nextInt();
        for(int i = 0; i < lectureProfiles.size(); i++){
            if(Objects.equals(subId, lectureProfiles.get(i).lectureNum)){
                System.out.println("해당 과목의 선생님은 " + lectureProfiles.get(i).lecTeacher + "입니다.");
            }
        }
        return true;
   }
   public static boolean getLectureTitleListByTeacherId(){
        Scanner sc7 = new Scanner(System.in);
       System.out.println("선생님 이름을 입력해주세요 : ");
       Object tName = sc7.next();
       getLectureTitleByTeacherIds.add(String.valueOf(tName));
       for(int i = 0; i < lectureProfiles.size(); i++){
           if(Objects.equals(tName, lectureProfiles.get(i).lecTeacher)){
               getLectureTitleByTeacherIds.add(lectureProfiles.get(i).lecName);
           }
       }
       System.out.println(getLectureTitleByTeacherIds);
        return true;
   }

   // Reply 객체가 생성될때 해당 글의 객체에 있는 replies 필드에 등록
//    public static boolean setRepliesIntoReply(){
//        if()
//        return true;
//    }

}

// for(Review : reivews){ → for each문(요즘 개발자들이 많이 쓰는 반복문 사용이 편리함/ 일반적인 for문과는 구분됨)
// }
// → i = 0 일때 Review review = reviews[0];
//   i = 1 일때 Review review = reviews[1];
// ...
//   i = n-1   Review review = reviews[n-1];
// for each문의 단점 : 배열에만 사용가능함



