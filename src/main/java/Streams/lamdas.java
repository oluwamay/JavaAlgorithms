package Streams;

import java.util.Comparator;

public class lamdas {
    public static void main(String[] args) {

      myFunc fnc = text ->{return text+" "+text;};

        System.out.println(fnc.print("Holy is the lord"));
    }
}
