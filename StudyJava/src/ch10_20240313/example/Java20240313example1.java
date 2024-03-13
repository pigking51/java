package ch10_20240313.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Java20240313example1 {
    public static void main(String[] args){
        // 아래 배열중에 짝수만 출력
        int[] arr = new int[] {1, 2, 3, 4, 5};
//        int[] fr = new int[2];
        ArrayList<Integer> list = new ArrayList<>();

        int num = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
//                fr[num] = arr[i];
                list.add(arr[i]);
                num++;
            }else{
                continue;
            }
        }
        System.out.println(list);

    }
}
