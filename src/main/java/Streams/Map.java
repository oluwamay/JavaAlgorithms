package Streams;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;



public class Map {
    public static void main(String[] args) {
        List<String> vehicles = Arrays.asList("bus", "car", "bicycle", "flight", "train");
        vehicles.stream()
                .map(veh -> veh.toUpperCase())
                .filter(veh -> veh.length() < 4)
                .forEach(System.out::println);

        vehicles.stream().mapToInt(veh -> veh.length()).forEach(veh -> System.out.println(veh));
        List<Integer> numbersList = Arrays.asList(4, 5, 7, 8, 9);
        List<Integer> mulList = numbersList.stream().map(num -> num * 3)
                .filter(n -> n >20).collect(Collectors.toList());
        System.out.println(mulList);
    }
}
