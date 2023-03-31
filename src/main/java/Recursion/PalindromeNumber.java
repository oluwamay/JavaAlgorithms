package Recursion;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(3212));
    }
    static boolean isPalindrome(int num){
        return reverse(num) == num;
    }
    static int reverse(int n){
        int digits = (int)(Math.log10(n)+1);
        return rev(n, digits);
    }
    static int rev(int n, int digits){
        if(n < 10){
            return n;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10, digits - 1)) + rev(n/10, digits-1);
    }
}
