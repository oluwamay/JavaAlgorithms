package BitwiseOperators;

public class UniqueNumber {
    public static void main(String[] args) {
        //In an array with duplicate elements find the unique one
        //Use the operation XOR
        int[] arr = {2, 3, 2, 3, 6, 7, 8, 7, 8};
        System.out.println(findUnique(arr));
    }
    static int findUnique(int[] nums){
        int unique = 0;
        for(int n : nums){
            unique ^= n;
        }
        return unique;
    }
}
