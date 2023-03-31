package Recursion;

public class NumberOfZeros {
    public static void main(String[] args) {
        System.out.println(countZeroes(4050));
    }
   static int countZeroes(int num) {
       return counter(num, 0);
   }

    private static int counter(int num, int count) {
        if(num == 0){
            return count;
        }
        int rem = num % 10;
        if(rem == 0){
            return counter(num/10, count+1);
        }else{
            return counter(num/10, count);
        }
    }

}
