package ch18_20240403;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface Condition{
    boolean test(String str);
}
public class LambDaExample2 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("grape");
        strings.add("orange");
        strings.add("kiwi");

        // 길이가 5 이상인 문자열을 필터링하는 기능
        System.out.println("길이가 5 이상인 문자열 : ");
//        FilterAndPrint(strings, (str) -> { return str.length() > 5;});
        FilterAndPrint(strings, (str) -> str.length() > 5);
        // 문자열이 'a'로 시작하는 아이템을 필터링하는 기능
        System.out.println("a로 시작하는 문자열 : ");
        FilterAndPrint(strings, (str) -> str.startsWith("a")); // 이거 기억 못했던 것 → 복습할때 제대로 이해하기
        System.out.println();
        FilterAndPrint(strings, (str) -> str.endsWith("e"));
    }
    public static void FilterAndPrint(List<String> items, Condition condition){
        // 일반적인 for loop 사용 예시
        for(String item : items){
            if(condition.test(item)){
                System.out.println(item);
            }
        }
        // 함수형 프로그래밍으로 반복문을 처리하는 예시 → 결과는 위와 동일
        items.stream().filter(condition::test).forEach(System.out::println);
    }
}
