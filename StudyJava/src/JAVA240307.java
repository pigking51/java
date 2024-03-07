import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class JAVA240307 {
    public static void main(String[] args){
//        // 6. 아래 배열에서 입력받은 값보다 큰 수만 출력하시오
//        int[] intList1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        Scanner scan = new Scanner(System.in);
//        System.out.print("0 ~ 10까지 숫자를 입력해주세요 : ");
//        int num = scan.nextInt();

//        for(int i = 0; i < intList1.length; i++){
//            if(num < intList1[i]){
//                System.out.print(intList1[i]+" ");
//
//            }
//        }

//        // 새로운 배열에 담기
//        int[] intList2 = new int[intList1.length];
//        int count = 0;
//        for (int i = 0; i < intList1.length; i++){
//            if (intList1[i] > num){
//                intList2[count] = intList1[i];
//                count = count + 1;
//            }
//        }
//        System.out.print(Arrays.toString(intList2));

//         // 새로운 배열에 담기 : ArrayList 사용하기
//        ArrayList<Integer> intList3 = new ArrayList<Integer>();
//        for(int i = 0; i < intList1.length; i++){
//            if (intList1[i] > num) {
//                intList3.add(intList1[i]);
//            }
//        }
//        System.out.print(intList3.toString());

//        // 7. 아래 배열의 종합과 평균을 구하시오
//        int[] numberList = {12, 34, 56, 32, 84, 99, 73, 69};
//        int sum = 0;
//        for(int i = 0; i < numberList.length; i++){
//            sum = numberList[i] + sum;
//        }
//        int average = sum / numberList.length;
//        System.out.println(sum + " " + average);
//            // 우연히 발견한거
//        System.out.println(Arrays.stream(numberList).sum());
//        System.out.println(Arrays.stream(numberList).average());

        // 8. 사용자로부터 문자열을 입력받아서 입력받은 문자열을 거꾸로 출력
        // 예) hello 를 입력하면 olleh를 출력
//        Scanner scan = new Scanner(System.in);
//        System.out.print("문자를 입력해주세요 : ");
//        String input = scan.nextLine();
//        char[] char1 = input.toCharArray();
//        char[] char2 = new char[char1.length];
//        int num = char1.length - 1 ;
//        for(int i = 0; i < char1.length; i++){
//            char2[num] = char1[i];
//            num = num - 1;
//        }
//        System.out.println(char2);

//        char[] charList1 = input.toCharArray();
//        char[] charList2 = new char[charList1.length];
//        int index = charList2.length - 1;
//        for (int i = 0; i < charList1.length; i++){
//            charList2[index] = charList1[i];
//            index = index - 1;
//        }
//        System.out.println(Arrays.toString(charList2));
//        for(int i = 0; i < charList2.length; i++){
//            System.out.print(charList2[i]);
//        }
//        System.out.println();

        // 난수생성법, Random 숫자 만드는 법

//        Random rd = new Random();
//        int randNumber = rd.nextInt(10); // 0 부터 입력한 정수값-1 범위에서 랜덤
//        System.out.print(randNumber);

        // 9. 1 ~45까지의 랜덤한 정수를 length가 6인 배열에 넣으시오.
        // 단, 중복 숫자는 허용하지 않음!!!
//        int[] intList1 = new int[6];
//        int num = 0;
//        for(int i = 0; i < intList1.length; i++) {
//            Random rd2 = new Random();
//            int randNumber2 = rd2.nextInt(45)+1;
//            intList1[i] = randNumber2;
//            for(int j = 0; j < intList1.length - 1; j++){
//                Random rd3 = new Random();
//                int randNumber3 = rd3.nextInt(45)+1;
//                intList1[j] = randNumber3;
//                if(intList1[i] == intList1[j]){
//                    Random rd4 = new Random();
//                    int randNumber4 = rd4.nextInt(45)+1;
//                    intList1[j] = randNumber4;
//                }
//            }
//
//        }
//        System.out.print(Arrays.toString(intList1));
        System.out.println();

//        int[] intList1 = new int[6];
//        int num = 0;
//        for(int i = 0; i < intList1.length; i++) {
//            Random rd2 = new Random();
//            int randNumber2 = rd2.nextInt(45)+1;
//            for (int j = 0; j < i; j++){
//                if(intList1[j] == randNumber2){
//                    randNumber2 = rd2.nextInt(45)+1;
//                    j = -1;
//                }
//            }
//            intList1[i] = randNumber2;
//            }
//        System.out.print(Arrays.toString(intList1));

        int[] intList1 = new int[6];
        for(int i = 0; i < intList1.length; i++) {
            Random rd2 = new Random();
            int randNumber2 = rd2.nextInt(45)+1;
            for (int j = 0; j < i; j++){
                if(intList1[j] == randNumber2){
                    i = i - 1;
                }

            }
        }
        System.out.print(Arrays.toString(intList1));

        }

    }
