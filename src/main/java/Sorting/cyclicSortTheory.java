package Sorting;


import java.util.Arrays;

public class cyclicSortTheory {
    public static void main(String[] args) {
      int[] a = {3, 5, 2, 1, 4};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
    static void sort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                int temp = arr[correctIndex];
                arr[correctIndex] = arr[i];
                arr[i] = temp;
            }else{
                i++;
            }
        }
    }
}
