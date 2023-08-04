package StringBuffer;

import java.util.Random;

public class Introduction {

    public static void main(String[] args) {

        //Constructor 1
        StringBuffer buffer = new StringBuffer();
        buffer.append("weMakeDevs").toString();
        System.out.println(buffer);

        //Constructor 2
        StringBuffer sb = new StringBuffer("Mayo");

        //constructor 3
        StringBuffer stringBuffer = new StringBuffer(30);

        sb.append(" raul");
        sb.insert(3, " Rahul ");
        buffer.replace(2,5, "Deep");

        //check initial capacity
//        System.out.println(sb.capacity());

        System.out.println(generateRandomString(30));

//        System.out.println(sb.toString());
//        System.out.println(buffer.toString());


        /**
         * String Buffer
         * It is a mutable sequence of characters. Strings are immutable
         * if you make changes to a string you are actually creating a new object
         * Advantages include: Mutability(Change to the object without creating a new one)
         * It is thread safe unlike stringBuilder.
         *
         */

    }
    static String generateRandomString(int size){
        StringBuffer sb = new StringBuffer(size);

        Random random = new Random();

        for(int i = 0; i <size; i++){
            int randomCharacter = 65 + (int)(random.nextFloat()  * 57);
            sb.append((char)(randomCharacter));
        }
        return sb.toString();
    }
}
