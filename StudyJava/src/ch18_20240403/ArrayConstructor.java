package ch18_20240403;

interface AC {
    int[] methodAC(int length);
}
public class ArrayConstructor {
    public static void main(String[] args) {
        // 함수형 인터페이스 메소드가 입력된 갯수만큼의 정수 배열을 리턴하는 경우
        AC a0 = new AC() { // 익명 이너클래스
            @Override
            public int[] methodAC(int length) {
                return new int[length];
            }
        };
        AC a1 = (int length) -> { return new int[length];}; // 이 경우는 그냥 이 이상 생략하지 않는것이 좋아보인다고함
        AC a3 = (int length) -> new int[length]; // 리턴과 중괄호 생략가능
        AC a2 = int[]::new;

        int[] array1 = a2.methodAC(10);
        System.out.println(array1.length);
        int[] array2 = a2.methodAC(20);
        System.out.println(array2.length);
    }
}
