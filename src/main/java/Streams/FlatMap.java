package Streams;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {
        //A flat map will return a string of objects
        List<Integer> list1 = Arrays.asList(11, 34, 56, 3);
        List<Integer> list3 = Arrays.asList(1, 44,  6, 23);
        List<Integer> list2 = Arrays.asList(51, 34, 5, 7);
        List<List<Integer>> finList = Arrays.asList(list1, list2, list3);

       List<Integer> finalList = finList.stream().flatMap(x -> x.stream()).map(x-> x*5).collect(Collectors.toList());

        System.out.println(finalList);
    }
}
