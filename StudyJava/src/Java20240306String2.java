import java.util.Arrays;
import java.util.Scanner;

public class Java20240306String2 {
    public static void main(String[] args) {
        // 문자열 수정
        // @toLowerCase(), toUpperCase()
        String str1 = "Java Study";
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());
        System.out.println();

        // @replace()
        // Study를 못찾으면 변경하지 않고 원본 그대로 둠
        System.out.println(str1.replace("Study", "공부"));
        System.out.println();

        // @substring()
        // 두번째 파라미터로 사용된 인덱스는 포함되지 않음 (0 <= 범위 < 5)
        System.out.println(str1.substring(0,5));
        System.out.println();

        // @split()
        // split 메소드의 리턴형은 String[] 문자열의 배열이다!!!
        String[] strArray = "abe/def-ghi jkl".split("/|-| ");
        System.out.println(Arrays.toString(strArray));
        System.out.println();

        // @trim()
        System.out.println("   abc   ".trim());
        String _str1 = "   abc def   ";
        _str1 = _str1.trim();
        System.out.println(_str1);
        System.out.println();

        // 모든 공백 지우기
        System.out.println(_str1.replaceAll(" ", ""));
        System.out.println();

        // 문자열의 내용 비교
        String str2 = new String("Java");
        String str3 = new String("Java");
        String str4 = new String("java");

        // @stack 메모리 비교(==): 위치(번지) 비교
        System.out.println(str2 == str3);
        System.out.println(str3 == str4);
        System.out.println(str4 == str2);
        System.out.println();

        // @equals(), equalsIgnoreCase(): 내용 비교
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals(str4));
        System.out.println(str3.equalsIgnoreCase(str4));
        System.out.println();

        int[] intArray = new int[10];
        for(int i = 0; i < 10; i++){
            intArray[i] = i+1;
        }
        System.out.println(Arrays.toString(intArray));

//        int[] intList1 = new int[3];
//    int[] intList2 = {100, 200, 300};
//    for (int i = 0 ; i < 3 ; i++) {
//        intList1[i] = intList2[i];
//    }
        System.out.println();

        int[] intArray2 = new int[10];
          int x = 1;
        for(int i = intArray2.length-1; i >= 0; i--){
            intArray2[i] = x;
                x = x+1;
        }
        System.out.println(Arrays.toString(intArray2));
        System.out.println(intArray2[0]);

        // 2. 길이가 10인 배열에 10부터 1까지 값을 역순으로 입력
        int[] intList2 = new int[10];
        int len = intList2.length;
        for(int i = 0; i < intList2.length; i++){
            intList2[i] = len;
            len = len - 1;
        }
        System.out.println(Arrays.toString(intList2));
        System.out.println();

        // 3. 과일 배열에 "사과"가 몇번 들어있는지 확인
        String[] fruitList = {"배", "사과", "바나나", "딸기", "사과", "수박"};
        int cot = 0;
        for(int i = 0; i < fruitList.length; i++){
//            if(fruitList[i].equalsIgnoreCase("사과")){
//               cot = cot+1;
//            }
            if(fruitList[i] == "사과"){
                cot = cot+1;
            }
        }
        System.out.println(cot);
        System.out.println();

        // 자바에서 입력값을 받는 방법
//        Scanner sc = new Scanner(System.in);
//        System.out.print("0~6까지 숫자를 입력해주세요 : ");
//        int inputNumber = sc.nextInt();
//        if(inputNumber >= 0 && inputNumber <= 6){
//            System.out.println(inputNumber);
//        } else{
//            System.out.println("잘못입력하셨습니다.");
//        }

        // 자바에서 문자열을 입력 받는 방법
//        Scanner sc = new Scanner(System.in);
//        System.out.print("이름을 입력해주세요 : ");
//        String inputStr = sc.nextLine();
//        System.out.println(inputStr);

//         4. 사용자로부터 0~6까지 숫자를 입력받아 아래 배열에 해당하는 요일을 출력
        char[] week = {'월', '화', '수', '목', '금', '토', '일'};
        Scanner scan = new Scanner(System.in);
        System.out.print("0~6까지 숫자를 입력해주세요 : ");
        int num = scan.nextInt();
        for(int i = 0; i < week.length; i++){
            if(num >= 0 && num <= 6){
                System.out.println(week[num]);
                break;
            }else{
                System.out.println("잘못 입력하셨습니다.");
                break;
            }

        }
        System.out.println();

        // 5. 사용자로부터 이름을 입력받아 아래 회원배열에 있는 이름이면
        // "~~~~님 환영합니다"를 출력하고
        // 없으면 "회원가입해주세요"를 출력 (단, 대소문자 구분하지 마시오)
        String[] members = {"Steve", "Tom", "Michael", "Laura", "Jessica", "Annie"};
        Scanner scan2 = new Scanner(System.in);
        System.out.print("이름을 입력해주세요 : ");
        String name = scan2.nextLine();
        boolean found = false;
        for(int i = 0; i < members.length; i++){
          if(name.equalsIgnoreCase(members[i])){
            System.out.println(members[i] + "님 환영합니다");
            found = true;
            break;
            }
//          if (i == members.length - 1){
//              System.out.println("회원가입해주세요");
//          }
            }
        if(!found){
            System.out.println("회원가입해주세요");
        }
        System.out.println();
        int k = 0;
        for(; k < members.length; k++){
            if(members[k].equalsIgnoreCase(name)){
                System.out.println(members[k] + "님 환영합니다");
                break;
            }
        }
        if (k == members.length){
            System.out.println("회원가입해주세요");
        }

        }

    }
