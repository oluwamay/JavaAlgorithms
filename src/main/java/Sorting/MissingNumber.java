package Sorting;
//https://leetcode.com/problems/missing-number/
public class MissingNumber {
    public static void main(String[] args) {
    int[] nums = {3, 0, 1};
        System.out.println(missingNumber(nums));
    }
    static int missingNumber(int[] arr){
        //return the only number missing from the range
        int i = 0;

        while(i < arr.length){
            int correctIndex = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correctIndex] ){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }else{
                i++;
            }

        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j){
                return j;
            }
        }

        return arr.length;
    }
}
