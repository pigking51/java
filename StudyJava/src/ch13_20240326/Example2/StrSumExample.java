package ch13_20240326.Example2;

import java.util.Arrays;

public class StrSumExample {
    // 문자열 "12345"의 각 자리에 있는 숫자를 더하는 코드를 완성하시오
    public static void main(String[] args) {
        String str = "12345";
        int sum = 0;
//        int[] num = new int[5];
//        for(int i = 0; i < num.length; i++){
//           String box = String.valueOf(i+1);
//            num[i] = str.indexOf(box)+1;
//            sum = num[i]+sum;
//        }
//        System.out.println(Arrays.toString(num));
//        char[] chars = str.toCharArray();
//        String[] arr2 = new String[chars.length];

//        for(int i = 0; i < chars.length; i++){
//            arr2[i] = String.valueOf(chars[i]);
//        }
//
//        for(int i = 0; i < arr2.length; i++){
//            if((arr2[i].equalsIgnoreCase(String.valueOf(i+1)))){
//                sum = i+1+sum;
//            }
//        }

        for(int i = 0; i < str.length(); i++){
//            sum = sum + (str.charAt(i) - '0'); // → 첫번째 방법 (개발자들이 흔히 많이 쓰는 방법)
            // 이걸 출력하면 255가 나오는데 해당 문자열에 대한 유니코드 코드값이 인식되어 그 합이 나오기 때문
            // → 49~54의 값이 나온다고 함(문자를 숫자로 바꿨을때 유니코드로 나온다!!!)
            // - 0을 넣으면 1의 유니코드 값 - 0의 유니코드 값을 뺀 수가 나오기때문에 자기 자신의 숫자가 나온다
//            sum = sum + Integer.valueOf(String.valueOf(str.charAt(i))); // → 2번째 방법
            sum = sum + Character.getNumericValue(str.charAt(i)); //  → 3번째 방법(문자를 숫자그대로 바꾸는 것)
        }
        System.out.println(str.charAt(0));
        System.out.println(String.valueOf(str.charAt(0)));
        System.out.println(Integer.valueOf(str.charAt(0)));

        System.out.println("합계는 " + sum); // 15
    }
}
