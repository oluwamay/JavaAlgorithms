package BitwiseOperators;

public class NumberSystemConversion {
    /*
    1. Convert decimal to any base:
        Keep dividing decimal by base and store the remainder.
    2. Convert any base to decimal:
        Multiply and add the power of base with digits
     */
    public static void main(String[] args) {
        System.out.println(isOdd(349));
    }
    static boolean isOdd(int num){
        return (num & 1) == 1;
    }
}
