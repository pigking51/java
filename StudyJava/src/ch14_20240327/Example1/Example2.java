package ch14_20240327.Example1;

public class Example2 {
    public static void main(String[] args) {

        // 문제 2. int 타입의 변수 num이 있을 때 각 자리의 합을 더한 결과를 출력하는 코드를 완성하세요.
        // num이 12345 이면 , ‘1+2+3+4+5’ 15 의 결과인 를 출력
        int num = 12345;
        int sum = 0;
        String a = String.valueOf(num);
        char[] b = a.toCharArray();
        int[] num2 = new int[5];

//        for(int i = 0; i < num2.length; i++){
////            num2[i] = Integer.parseInt(String.valueOf(b[i]));
//            num2[i] = Integer.valueOf(String.valueOf(b[i]));
//            sum = num2[i] + sum;
//        }

//        for(int i = 0; i < num2.length; i++){
//            sum = (a.charAt(i)- '0')+sum;
////            sum = Integer.valueOf(String.valueOf(b[i]))+sum;
////            sum = Integer.valueOf(String.valueOf(a.charAt(i)))+sum;
////              sum = Character.getNumericValue(a.charAt(i))+sum;
//        }

        while(num > 0){
            sum += num % 10;
            // 만약 16진수였으면 16으로 나눈값의 나머지
            // 2진수는 2로 나눈값의 나머지
            num = num / 10;
        }

        System.out.println("sum="+sum);
    }
}
