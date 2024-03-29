public class Java20240312 {
    public static void main(String[] args) {
        // 8장 중요사항 : 자동완성기능 꼭 사용할 것!!
        // import 하면서 * 붙일 때 *는 폴더를 제외하고 전부선택하는 것이기에
        // Java.폴더.* ← 이런 식으로 해야 됨
        // Java의 완벽한 라이벌 : 코틀린?

        // 9장 제어자(위로갈수록 사용범위가 넓어짐)
        // public - 공개(100% 허용)
        // protected - 상속(default 범위 포함)받은 클래스에게는 허용
        // → 프로젝트 레벨에서는 많이 씀
        // default - 같은 패키지(폴더까지)
        // private - 비공개(파일=클래스 만)
        // * Java에서 class레벨의 제어자 사용은 public과
        //  아무것도 적지 않은 default만 사용 가능함

        // extends : 상속
        // 상속 후

        // 절대원칙 : 파일명 동일, 대문자 시작, public 중 1개는
        // 무조건 있어야한다!!

        // static = 정적요소 ↔ dynamic 동적요소(메모리에 생성·삭제 반복) =/= 값이 계속 변한다!
        // ㄴ→ 메모리가 (시작 시)생성되면 끝(종료)까지 유지
        // 저장공간이 다름(정적 메모리영역 : 메타스페이스라고 통칭 , 동적 메모리 영역 : heap, stack)

    }
}
