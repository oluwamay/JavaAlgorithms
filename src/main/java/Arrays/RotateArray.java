package Arrays;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {-1,-100, 3, 99};
        rotate(arr, 2);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotate(int[] nums, int k) {
        int len = nums.length;
        for(int i = len - 1; i >= len-k; i--){
            int num = nums[nums.length-1];
            for(int j = len-2; j >= 0; j--){
                nums[j+1] = nums[j];
                nums[j] = num;
            }
        }
    }
}
