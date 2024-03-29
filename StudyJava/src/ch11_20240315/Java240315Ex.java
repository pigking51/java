package ch11_20240315;

import java.util.ArrayList;
import java.util.Arrays;

public class Java240315Ex {
    public static void main(String[] args) {


        // 아래 문자열의 모음과 자음의 갯수를 각각 count 하시오
        // 모음은 a e i o u
        // 스페이스는 문자 아님
        // * 해당문제 유니코드 변환을 이용하여 해결하는 것 같음
        String str = "This is a really simple sentence";  // 모음 10개, 자음 17개
        char[] str2 = str.toCharArray();
        String[] str4 = new String[]{"a", "e", "i", "o", "u"};
        char[] str3 = new char[]{'a', 'e', 'i', 'o', 'u'};
        int count = 0;
        int count2 = 0;
//        ArrayList<String> arr = new ArrayList<>();
//       for(int i = 0; i < str2.length; i++){
//            if(str2[i] != str2[4]){
//                char num = str2[i];
//                arr.add(String.valueOf(num));
//            }
//       }
//       for(int i = 0; i < str4.length; i++){
//           if(arr.contains(str4[i])) {
//               arr.remove(str4[i]);
//               count++;
//               for(int j = 0; j < str4.length-1; j++) {
//                   if (arr.contains(str4[i])) {
//                       arr.remove(str4[i]);
//                       count++;
//                   }
//               }
//           } else{
//               count2++;
//           }
//       }
//        System.out.println(arr);

        // 답안

        str = str.toLowerCase();

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                count++;
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                count2++;
            }
        }

        System.out.println("자음 : " + count2);
        System.out.println("모음 : " + count);
    }

}
