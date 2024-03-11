import java.util.Arrays;

public class Java20240311 {
//
//    public static void main(String[] args)  {  // (String[] args) → 매개변수(파라미터라고 함)
//        // 접근 제어자 종류 4가지
//        // 1. public - 어디에 있는 녀석이던지 다 사용가능(주로 많이 쓰임)
//        // 2. protected - 대규모 개발이 이루어질때 사용한다고 함
//        // 3. default(제어자 안쓰면 얘 적용됨)
//        // → 같은 폴더 내에만 사용가능(하위폴더는 관계없음) - 2, 3번의 차이는 상속여부의 차이임
//        // 4. private - 비공개(같은 파일 안에서만 사용가능 / 클래스, 메소드 자체에서는 거의 사용 안한다고 함)
//
//    }

//   참조 자료형 매개변숫값의 변화

        public static void main(String[] args) {
            int[] array = new int[] {1, 2, 3};
            modifyData(array);
            printArray(array);
        }
        public static void modifyData(int[] a){
            a[0] = 4;
            a[1] = 5;
            a[2] = 6;
        }
        public static void printArray(int[] a){
            System.out.println(Arrays.toString(a));
        }

//    int result = plus(3, 5);
//    // → 1. 여기서 먼저 실행되고
//    // plus(~) → 3. 여기에 입력됨
//
//    public int plus(int x, int y){
//        return x+y;
//        // → 2. 여기서 계산된 다음
//    }





}
