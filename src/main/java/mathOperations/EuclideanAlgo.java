package mathOperations;

import java.util.Arrays;
public class EuclideanAlgo {
    /**
     * https://leetcode.com/problems/find-greatest-common-divisor-of-array/submissions/914990925/
     *
     */
    public static void main(String[] args) {

    }
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length-1];

        while(min != 0){
            int temp = min;
            min = max % min;
            max = temp;
        }
        return max;
    }
}
