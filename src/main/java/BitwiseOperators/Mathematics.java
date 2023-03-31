package BitwiseOperators;

public class Mathematics {
    public static void main(String[] args) {
//        System.out.println(Math.pow(50, 2));
//        System.out.println(Math.abs(-1236));
//        System.out.println(Math.sqrt(36));
        System.out.println(greater(7, 8, 4));


    }
    public static boolean greater(int num1, int num2, int num3){
//        if(num1 > num2){
//            return true;
//        }else{
//            return false;
//        }
       return num1 > num2 && num1 > num3;
    }
}
