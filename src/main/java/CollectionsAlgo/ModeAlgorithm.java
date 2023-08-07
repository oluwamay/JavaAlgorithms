package CollectionsAlgo;

import java.util.*;

public class ModeAlgorithm {
    /**
     * Simple Mode
     * Have the function SimpleMode(arr) take the array of numbers stored
     * in arr and return the number that appears most frequently (the mode).
     * For example: if arr contains [10, 4, 5, 2, 4] the output should be 4.
     * If there is more than one mode return the one that appeared in the array
     * first (ie. [5, 10, 10, 6, 5] should return 5 because it appeared first).
     * If there is no mode return -1. The array will not be empty.
     * Examples
     * Input: new int[] {5,5,2,2,1}
     * Output: 5
     * Input: new int[] {3,4,1,6,10}
     * Output: -1
     */
    public static void main(String[] args) {
        int[] array = {6, 5, 10, 3};
        System.out.println(simpleMode(array));
    }

    static int simpleMode(int[] arr) {
        HashMap<Integer, Integer> dataMap = new HashMap<>();

        int mode = -1;
        int maxFrequency = 1;

        //Put all numbers and frequency in a map
        for(int i = 0; i < arr.length; i++){
             dataMap.put(arr[i], dataMap.getOrDefault(arr[i], 0)+1);
            if(dataMap.get(arr[i]) > maxFrequency){
                maxFrequency = dataMap.get(arr[i]);
                mode = arr[i];
            }
         }

        return mode;
    }

}
