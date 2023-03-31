package Recursion;

public class Basics {
    public static void main(String[] args) {
        System.out.println( productOfDigits(1404));
   // print(5);
    }
    static void print(int n){
        //Print numbers from n  to 1
        if(n == 0){

            return;
        }
        System.out.println(n);
        print(n-1);
        System.out.println(n);

    }
    static void printToN(int n){
    //print from 1 till number N
        if(n == 1){
            System.out.println(n);
            return;
        }

        printToN(n-1);
        System.out.println(n);


    }
    static long Factorial(int n){
        if(n <= 1){
            return 1;
        }
        return n * Factorial(n-1);
    }
    static  int sumOfDigits(int N){
        if(N < 10){
            return N;
        }
        return sumOfDigits(N/10) + N % 10;

    }
    static  int productOfDigits(int N){
        if(N < 10){
            return N;
        }
        return productOfDigits(N/10) * (N % 10);

    }

}
