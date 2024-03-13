package ch09_20240312;

import java.util.ArrayList;
import java.util.Arrays;

public class Java240312_ex {
    public static void main(String[] args) {
        // 아래 배열의 모든 값들을 다른 배열에 복사하기
        int[] intArray1 = {1, 2, 3, 4, 5};
//        int[] intArray2;
//        intArray2 = new int[intArray1.length];
        ArrayList<Integer> intArray2 = new ArrayList<>();
        int plus = 0;
        for(int i = 0; i < intArray1.length; i++){
//            intArray2[i] = i+1;
//            intArray2[i] = intArray1[i];
//            plus = plus + 1;
            plus = intArray1[i];
            intArray2.add(plus);
        }
//        System.out.println(Arrays.toString(intArray2));
        System.out.println(intArray2); // → ArrayList로 했을때 출력방식
        System.out.println();
        // 위 코드 작성한 후, git에 올려져있는 코드 분석

        int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};
        int [] fr = new int [arr.length];
        int visited = -1; // 양의정수라는 가정 하에 나올 수 없는 값을 세팅
            for (int i = 0; i < arr.length; i++) {
                if(fr[i] == visited){
                    continue;
                }
                int count = 1; //
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        fr[j] = visited; // 없어도 카운트 세는것은 가능하지만,
                    }
                }
                //[0, 0, 0, 0, -1, -1, -1, 0, -1]
                if (fr[i] != visited) {
                    fr[i] = count;

                }
//                if (i < 8 && fr[i] == fr[i + 1]) {
//                    continue;
//                }
                System.out.println(Arrays.toString(fr));
            }
            // fr = [2, 4, 1, 1, -1, -1, -1, 1, -1]

            for (int i = 0; i < fr.length; i++) {
                if (fr[i] != visited) {
                    System.out.println("    " + arr[i] + "    |    " + fr[i]);
                }

            }
//        System.out.println(Arrays.toString(fr));
        }
    }


