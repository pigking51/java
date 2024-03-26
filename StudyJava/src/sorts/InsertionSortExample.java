package sorts;

public class InsertionSortExample {

    // Insertion 정렬의 알고리즘을 이해하고
    // 어떤 정렬상태가 주어졌을때 가장 빨리 정렬을 마무리할지 생각해봅시다!! = Best Case → 숫자가 낮은순서대로 배치되었을때
    // 반대로 어떤 정렬 상태가 주어졌을때 가장 오래 걸릴까?? = Worst Case → 숫자가 높은순서대로 배치되었을때
    // 큰 차이는 없지만 셀렉션은 해당하지 않더라도 확인하는 과정이 있지만 해당 sort는 조건에 해당할때만 확인하게됨
    public static void insertionSort(int array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i] > key ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
        }
    }

    public static void main(String a[]){
        int[] arr1 = {9,14,3,2,43,11,58,22};
        System.out.println("Before Insertion Sort");
        for(int i:arr1){
            System.out.print(i+" ");
        }
        System.out.println();

        insertionSort(arr1);//sorting array using insertion sort

        System.out.println("After Insertion Sort");
        for(int i:arr1){
            System.out.print(i+" ");
        }
    }
}
