package ch10_20240313.example;

import java.util.Arrays;

class A {
    A(){}
  static int n;
  static{
      n = 5;
  }
}

public class Java20240313example3 extends A {
    public static void main(String[] args) {

        int [] arr = new int [] {1, 2, 3, 4, 5};

//        int n = 3;


        // 1. 외부에서 5 입력해서 적용해보기
        // 2. 기존 방법과 반대로 적용하여 앞 배열에 뒷 배열 추가

        System.out.println("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
        for(int i = 0; i < n; i++){
            int j, first;
            int last;

//            first = arr[0];  // 포인트 1 → 고정값 아님(아래 for문의 첫번째 제외값이)
                            // i+1회차에 돌아올 시 해당 숫자로 변함)
            last = arr[4];
            for(j = 4; j > 0; j--){
                arr[j] = arr[j-1];
//                System.out.println(arr[j]);
            }

            arr[j] = last;  // 포인트 2 → 윗 for문의 false가 되는 값 [4]가 나와
                            // 맨 마지막 자리 배열로 됨
//            System.out.println(first);
            System.out.println(Arrays.toString(arr));
        }

        System.out.println();

        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

