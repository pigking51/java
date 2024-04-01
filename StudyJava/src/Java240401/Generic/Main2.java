package Java240401.Generic;

import javax.xml.crypto.dsig.keyinfo.KeyValue;

class keyValue<K,V> { // k, v흔히 이렇게 나타내는 것 뿐이지 다르게 써도 상관 없긴함(for문의 i, k... 같은거)
   private K key;
   private V value;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
public class Main2 {

    public static void main(String[] args) {
    keyValue<String, Integer> kv1 = new keyValue<>();
    kv1.setKey("사과");
    kv1.setValue(1000);
    System.out.println(kv1.getKey() + ", " + kv1.getValue());
    
    // 두번째 제네릭을 사용하지 않더라고 Void타입을 지정해줘야 함
    keyValue<String, Void> kv3 = new keyValue<>(); // 이중 제네릭으로 정해놓고 하나의 제네릭을 생성하면 오류뜸
        // → 그렇기에 형태를 유지하기 위한 <String, Void>로 표현함
    kv3.setKey("키값만 사용");
    System.out.println("key: " + kv3.getKey());
    
    
    }

}
