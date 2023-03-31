package Recursion;

public class RevNum {
    public static void main(String[] args) {
        System.out.println(reverse(234));
    }
    static int reverse(int n) {
        int digits = (int) (Math.log10(n) + 1);
        return revHelp(n, digits);
    }

    private static int revHelp(int n, int digits) {
        if(n < 10){
            return n;
        }
        int rem = n % 10;
        return rem * (int)Math.pow(10, digits-1) + revHelp(n/10, digits-1);
    }


}
