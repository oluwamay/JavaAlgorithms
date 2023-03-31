package Searching;

public class InsertPosition {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        System.out.println(searchInsert(arr, 4));
    }
        public static int searchInsert(int[] nums, int target) {
            int s = 0;
            int e = nums.length-1;
            while(s < e){
                int mid = (s+e)/2;
                if(nums[mid] == target){
                    return mid;
                }else if(nums[mid] > target){
                    e = mid-1;
                }else{
                    s = mid + 1;
                }
            }
            if(nums[s] < target){
                return s + 1;
            }else{
                return s;
            }
        }

}
