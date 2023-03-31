package CollectionsAlgo;

import java.util.HashMap;
import java.util.Map;

public class Heteromorphs {
    public static void main(String[] args) {
    //Given a string, it should only have k number of duplicate values
        // i.e if k = 1 then only one charACTER SHOULD BE DUPLICATED
        //return a boolean value
        String sample = "aaaabbbccdefgh";

       System.out.println(tolerant(sample, 3));

    }
    public static boolean  tolerant(String s, int k){
        HashMap<Character, Integer> mapp = new HashMap();


        for(int i=0; i< s.length(); i++){
            if(!mapp.containsKey(s.charAt(i))){
                mapp.put(s.charAt(i), 1);
            }else{
                mapp.put(s.charAt(i), (mapp.get(s.charAt(i))+1));
            }
        }

        int duplicateCount = 0;

        for(Map.Entry<Character, Integer> entry: mapp.entrySet()){
            if(entry.getValue() > 1){

                duplicateCount += 1;
            }
        }

        return k == duplicateCount;
    }
}
