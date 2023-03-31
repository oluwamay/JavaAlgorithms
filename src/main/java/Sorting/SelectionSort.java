package Sorting;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
    int[] arr = {21,3,14,1,5, 56};
    select(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void select(int[] nums){
    for(int i = 0; i < nums.length; i++){
        int min = minElement(nums, i);
        int temp = nums[min];
        nums[min] = nums[i];
        nums[i] = temp;
    }

    }

    static int minElement(int[] nums, int start) {
       int min = nums[start];
       int index = start;
        for (int i = start; i < nums.length; i++) {
            if(nums[i] < min){
               min = nums[i];
               index = i;
            }
        }
        return index;
    }
}
