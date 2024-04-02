package ch17_20240402;

// 컬렉션 프레임워크
// 대표적으로 List, Set, Map, Stack, Queue가 있음
// List는 이전에 해본 ArrayList를 말하는 것임
// Stack, Queue는 특별한 경우에만 사용하는 것
// List, Set, Map은 어떤것인지만 알아두기만 해도 되는 수준
// 무엇인지, 어디에쓰는지, 왜 쓰는지만 확인하고 필요할때 찾아보면 된다고 함
// → 특징과 차이점 중심으로
// 인터페이스와 클래스가 섞여있음

// List : 배열과 가장유사 (주의: 배열은 아님!!!)
// → 배열은 객체로 인정받고 클래스로 인정 x(서로 다른 독립된 위치를 각각 기억할 필요 x)
// List는 인터페이스라서 객체화 불가 (대신 구현체 존재)
// → List<String> a = new (ArrayList, Vector, LinkedList중 하나 택)
// ArrayList : 검색에 용이, 읽는것에 집중된 유형은 이거임, List의 대부분은 이걸 사용한다고 함

// Vector : ArrayList와 같은것?
// 쓰레드 : 쓰레드를 생성해서 일을 시키면 CPU를 나눠서 사용함
// 벡터는 멀티쓰레드 환경에서 안전하다(벡터는 멀티쓰레드 환경을 고려한것)
// → 멀티쓰레드를 지원함

// LinkedList : Linked → 뒷녀석이 바로 붙어있는것이 아니다???
// 장점 : 생성과 삭제가 빠름(특히 삭제)
// 단점 : 읽는 속도가 느림(사람이 인지할만한 속도는 아님)
//Link와 Queue의 성질 둘 다 가지고 있음 

// Set : 비유하자면 보자기처럼 생김
// 특징 : 1. 들어간 순서와 상관없음 → 인덱스가 없음
//       2. 중복허용을 하지 않음 → 항상 유일한 값만 존재
//       3. 기준을 만들어 줄 수 있음(*HashSet의 특징일수도 있음)
// 최근에 했던 Review작성 시 중복된 ID값 있으면 입력 못하게 하는 등의 방식에 사용
// 종류 : HashSet, LinkedHashSet, TreeSet
// HashSet : 오버라이딩을 통해서 우리의 입맛대로 규칙을 만들 수 있음
// 넣은순서와 읽는순서가 다름(순서 x)
// LinkedHashSet : 안에 '순서'를 내장하고 있는 HashSet
// TreeSet : 안에 검색가능한 구조로 이루어져있어 검색하기에 용이함
// → 내부에 트리구조로 이루어져 있음
// 들어가면서 자체적으로 크기를 비교하여 저장됨(정렬과 검색이 큰 특징임 → 일반 HashSet과는 비교할 수 없을정도)



// Map<K, V> : 하나만 제외하고 Set과 매우 유사함
// 특징 : 1. 반드시 자료구조가 쌍으로 이루어져있어야함
//       2. Key값이 인덱스의 역할을 함(Key는 중복 x / Value는 중복가능)
//          → Key자리에 String을 쓰는 경우가 많음
// HashMap, LinkedHashMap, HashTable
// HashMap : 가장 일반적인 Map
// LinkedHashMap : 다 연결되어서 저장되어있음
// HashTable : 멀티쓰레드를 지원함(별로 쓸 일 없음)
// TreeMap : 키 값을 중심으로 검색과 정렬하는 것

// Stack : LIFO(Last In Fist Out)
// → 나중에 들어온 것을 먼저 처리하고 처음 온 것을 나중에 처리(후입선출)

// Queue : FIFO(First In First Out)
// → 처음에 들어온 것을 먼저 처리하고 나중에 온 것을 나중에 처리(선입선출)
// 이벤트의 경우 여기에 해당됨(순서대로 처리해야되기 때문)
// 성질상 List의 일종으로도 볼 수 있음 → 구조가 섞여있음
// LinkedList를 구현체로 사용함



// Stack과 Queue는 정말 특별한 경우가 아니면 쓰이지 않음

// List는 인터페이스이기때문에 구현화가 필요

// 구현체 구분하는거 4월 첫째주 시험에나옴
// List 기본은 ArrayList, Set의 기본은 HashSet

// 프로그래밍의 오랜 관습
// 범위를 정할때 시작은 포함시키고 끝은 포함하지 않는 버릇이 있음

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Java240402 {
    // 연습문제 1
//    public static void main(String[] args) {
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(1);
//        list1.add(2);
//        list1.add(3);
//        System.out.println(list1);
//        List<Integer> list2 = Arrays.asList(1, 2);
////        list2.add(3);
//        System.out.println(list2);
//        // → Arrays.asList의 경우에는 원소를 추가하는 메소드는 가지고 있기 않기때문에
//        // add 사용 시 오류가 발생하는 것
//    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
    }
}
