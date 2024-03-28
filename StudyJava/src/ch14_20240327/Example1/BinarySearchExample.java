package ch14_20240327.Example1;

public class BinarySearchExample {
    public static void binarySearch(int arr[], int first, int last, int key){ // 이 코드가 성립하려면 배열이 정렬되어 있어야함
        int mid = (first + last)/2; // (last - first)/2 + last;
        while( first <= last ){
            if ( arr[mid] < key ){
                first = mid + 1;
            }else if ( arr[mid] == key ){
                System.out.println("Element is found at index: " + mid);
                break;
            }else{
                last = mid - 1;
            }
            mid = (first + last)/2;

        }
        if ( first > last ){
            System.out.println("Element is not found!");
        }
    }
    public static void main(String args[]){
        int arr[] = {10,20,30,40,50};
        int key = 10;
        int last=arr.length-1;
        binarySearch(arr,0,last,key);
    }
}
