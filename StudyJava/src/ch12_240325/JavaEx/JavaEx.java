package ch12_240325.JavaEx;

import java.util.Arrays;

public class JavaEx extends Students{
    // 첫번째 미션
    // 아래 코드가 실행될 수 있도록 Students 클래스를 완성하시오.
    // 힌트 : 세터메서드를 만들어야함. toString()은 오버라이딩 필요
    public static void main (String[] args) {
        Students students0 = new Students();
        students0.setName("Steve");
        students0.setDepartment("Physics");
        students0.setStudentId(10001);
        String[] arr1 = new String[]{students0.name+", "+students0.department+", "+students0.studentId};
//        System.out.println(students0.toString()); // steve, Physics, 10001\

        System.out.println(Arrays.toString(arr1));
//        System.out.println(Sum().toString);
        createStudentsInfo();
    }


//    public String Sum(){
//        return super.name + super.department + super.studentId;
//    }

    // 두번째
    // 아래 메서드를 완성하시오
    // 주어진 배열을 이용하여 Students타입의 배열을 만들고 for문으로 출력해야함
    public static void createStudentsInfo(){
        String[] names = {"Steve", "Tom", "Laura", "Susie"};
        String[] departments = {"Physics", "Computer", "English", "Law"};
        int[] studentIds = {10001, 10002, 10003, 10004};
        String[] Students = new String[4];

        for(int i = 0; i < Students.length; i++){
            Students[i]= names[i]+", "+departments[i]+", "+studentIds[i];
            System.out.println("["+Students[i]+"]");
        }
        System.out.println(Students[3]);

    }
}
