public class Java240308 {
    public static void main(String[] args) {
        Students tom = new Students("Tom", 18, "Daejeon", "123456");
        Students steve = new Students("Steve", 25, "Seoul", "2545612");
        Students paul = new Students();
        paul.setName("Paul");
        paul.setAge(22);
        paul.setAddress("Incheon");

        tom.displayAll();
        System.out.println();
        steve.displayAll();
        System.out.println();
        paul.displayAll();
        System.out.println(tom.getPersonalNum());

        // 메소드 호출
        int[] numberList = {12, 34, 56, 32, 84, 99, 73, 69};
        int[] numberList2 = {123, 345, 235, 7894, 432};
        getSumAvg(numberList);
        getSumAvg(numberList2);

    }
     static void getSumAvg(int[] numberList) { // 같은 class 안에서 만드는거면 public없어도 됨
     // 7. 아래 배열의 종합과 평균을 구하시오

        int sum = 0;
        for(int i = 0; i < numberList.length; i++){
            sum = numberList[i] + sum;
        }
        int average = sum / numberList.length;
        System.out.println(sum + " " + average);
     // 우연히 발견한거
//        System.out.println(Arrays.stream(numberList).sum());
//        System.out.println(Arrays.stream(numberList).average());
     }
}
