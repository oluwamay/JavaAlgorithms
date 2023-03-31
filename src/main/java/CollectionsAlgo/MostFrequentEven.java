package CollectionsAlgo;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class MostFrequentEven {
    /**
     * https://leetcode.com/problems/most-frequent-even-element/submissions/914978082/
     * LeetCode
     */

    public static void main(String[] args) {

    }

        public static int mostFrequentEven(int[] nums) {
            Map<Integer, Integer> res = new HashMap<>();
            Arrays.sort(nums);
            for(int i = 0; i < nums.length; i++){
                if(nums[i] % 2 == 0){
                    //add only even numbers to the map
                    res.put(nums[i], res.getOrDefault(nums[i], 0)+1);
                }
            }
            int freq = 0;
            int result = -1;


            for(Map.Entry<Integer, Integer> entry: res.entrySet()){
                if(entry.getValue() > freq || (entry.getKey() < result && entry.getValue() >= freq)){
                    result = entry.getKey();
                    freq = entry.getValue();
                }
            }

            return result;
        }

}
