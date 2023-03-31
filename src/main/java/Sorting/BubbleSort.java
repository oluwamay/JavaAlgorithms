package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
      int[] arr = {-4, -1, 0, 3, 10};
        System.out.println(Arrays.toString(sortedSquares(arr)));
    }
    public static int[] sortedSquares(int[] nums) {
        int[] sqr = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            sqr[i] = nums[i] * nums[i];
        }

        //sort the array using selection sort, find the minimum element and swapp
        for(int k = 0; k < sqr.length; k++){
            int mini = minIndex(sqr, k);
            int temp = sqr[mini];
            sqr[mini] = sqr[k];
            sqr[k] = temp;
        }
        return sqr;
    }
    static int minIndex(int[] nums, int start){
        int min = nums[start];
        int minInd = start;
        for(int j = start; j < nums.length; j++){
            if(nums[j]< min){
                min = nums[j];
                minInd = j;
            }
        }
        return minInd;
    }
}
