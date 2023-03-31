package Arrays;

public class PrimeNumber {
  /*
  Given two numbers  a and b as interval range, the task
  is to find the prime numbers in between this interval.
   */
  public static void main(String[] args) {
    primeNumberRange(1, 30);
  }
  static void primeNumberRange(int n1, int n2){
      for (int i = n1; i <= n2; i++) {
          if(primeNum(i)){
              System.out.println(i);
          }
      }
  }
  static boolean primeNum(int n){
     if(n < 2){
         return false;
     }
     for(int i = 2; i <= Math.sqrt(n); i++){
         if(n % i == 0){
             return false;
         }
     }
     return true;
  }
}
