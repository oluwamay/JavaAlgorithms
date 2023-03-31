package Arrays;

import java.util.*;
public class TwoSumLeetcode {
    //https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/?envType=study-plan&id=algorithm-i
    public static void main(String[] args) {
        int[] nums = {2,3,4};
        System.out.println(Arrays.toString(twoSum(nums, 6)));
    }
    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        for(int i = 0; i < numbers.length-1; i++){
            for(int j = i + 1; j < numbers.length; j++){
                if(numbers[i] + numbers[j] == target){
                    result[0] = i + 1;
                    result[1] = j + 1;
                }
            }
        }
        return result;
    }
    //Optimized
        public static int[] twoSum2(int[] numbers, int target) {
            int fig = 0; int compare = numbers.length-1;

            while(numbers[fig]+numbers[compare] != target){
                if(numbers[fig] + numbers[compare] > target){compare--;}
                else{fig++;}
            }
            return new int[]{fig+1, compare+1};
        }
}
