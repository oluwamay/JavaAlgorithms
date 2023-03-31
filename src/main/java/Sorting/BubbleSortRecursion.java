package Sorting;

public class BubbleSortRecursion {
    public static void main(String[] args) {

    }
    static void bubbleSort(int[] arr, int first, int next){
        if(first == arr.length){
            return;
        }
        if(arr[first] > arr[next]){
            int temp = arr[next];
            arr[next] = arr[first];
            arr[first] = temp;
            bubbleSort(arr, first, next+1);
        }else{
            bubbleSort(arr, first+1, first+2);
        }
    }
}
