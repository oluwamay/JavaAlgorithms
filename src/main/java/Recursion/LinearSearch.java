package Recursion;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 8, 2, 1, 8, 9};

        System.out.println(findAllIndex(arr, 8, 0, new ArrayList<>()));
    }
    //Finds Index
    static int search(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }else if(arr[index] == target){
            return index;
        }
        return search(arr, target, index+1);
    }
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> result ){
        if(index == arr.length){
            return result;
        }else if(arr[index] == target){
            result.add(index);
        }
        return findAllIndex(arr, target, index+1, result);

    }

    static boolean find(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || find(arr, target, index+1);
    }
}
