package ch10_20240313.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Java20240313example2 {
    public static void main(String[] args) {
        // 아래 문자열의 글자수를 카운트
        // 스페이스는 카운트하지 마시오
        String string = "The best of both worlds";
        // replace를 활용한 방법
        // for문 없이 활용한 방법
        // charAt(i)을 활용한 방법 → 해당 위치의 문자를 반환
        int count = 0;
        char[] chrs = string.toCharArray();

        ArrayList<String> str2 = new ArrayList<>();
        
        for(int i = 0 ; i < chrs.length; i++){
            if(chrs[i] != chrs[3]){
                char num = chrs[i];
                str2.add(String.valueOf(num));
                count++;
            }
//            if(string.charAt(i) != " "){
//                count++;
//            }
        }
        System.out.println(count);
        }

    }

