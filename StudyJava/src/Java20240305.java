public class Java20240305 {

    public static void main(String[] args){
        // break = 제어문의 중괄호를 탈출시키는 키워드(자기를 감싸고있는 거)
        for (int i = 0; i < 10; i++){
            System.out.println(i);
            if(i > 5) {
                break;
            }
        }
        System.out.println();
        // 이중 for문에서의 break 사용법
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
//                System.out.println(i + ", " + j); // 여기에서 출력하면 j에 3찍혀나옴
                if(j == 3){
//                    i = 99999999; // 여기에 매우 큰 수(제일 바깥의 조건식 한계 혹은 그 이상)를 세팅해서 바깥 for문 탈출
                    // 교재에서는 100으로 설정한 이유 → 가독성 측면 고려한 것(누가봐도 조건 이상인거 확인됨)
                    break;
                }
                System.out.println(i + ", " + j);
            }
        }
        System.out.println();
        // 바깥 for문까지 탈출하는 다른 방법
        out: // out이라는 단어는 의미없는 단어임(변수처럼 이름짓는것 → 다른 단어로 대체해도 됨)
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                if(j == 3){
                    break out; // out이라는 단어는 의미없는 단어임(변수처럼 이름짓는것 → 다른 단어로 대체해도 됨)
                }
                System.out.println(i + ", " + j);
            }
        }
        System.out.println();
        // continue 사용법
        for (int i = 0; i < 10; i++){
            if(i % 2 == 1){ // 홀수의 경우 아래 출력문을 실행하지 않음
                continue;
            }
            System.out.println(i);
        }
        System.out.println();
        // 이중 for문에서의 continue
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 5; j++){
                if (j == 3){
                    continue;
                }
                System.out.println(i + ", " + j);
            }
        }
    }
}
