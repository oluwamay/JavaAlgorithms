package CollectionsAlgo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MyMap {
    public static void main(String[] args) {
        Map<Integer, Integer> res = new HashMap<>();
        res.put(1, 234);
        res.put(2, 645);
        res.put(3, 74);
        res.put(4, 98);

        Set s = res.entrySet();
        Iterator it = s.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //System.out.println(res.entrySet());
    }
}
