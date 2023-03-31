package Arrays;

public class numberPalindrome {
    /*
    Given a positive integer, write a function that returns true if
    the given number is a palindrome, else false. For example, 12321
    is a palindrome, but 1451 is not a palindrome.
     */
    public static void main(String[] args) {
        System.out.println(isPalindrome(2012));
    }
    static boolean isPalindrome(int number){
        int temp = number;
        int result = 0;

        while(temp > 0 ){
            int remainder = temp % 10;
            result = (result* 10) + remainder;
            temp /= 10;
        }
        return result == number;
    }
}
