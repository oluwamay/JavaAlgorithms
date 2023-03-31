package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseNumber {
    public static void main(String[] args) {

        System.out.println(reverse(45678909));

    }
    static int reverse(int num){

        List<Integer> res = new ArrayList<>();

        while(num > 0){
            int rem = num % 10;
            res.add(rem);
            num /= 10;
        }
        Collections.sort(res);
        int result = 0;
        for(int i = res.size()-1; i >=0; i--){
            result = (result * 10) + res.get(i);
        }
        return result;
    }
}
