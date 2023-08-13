package org.app;

//PROG THAT REMOVES DUPLICATES FROM AN ARRAY
import java.util.*;
public class Main{
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5,7,7,8};
        Set<Integer> newSet = new HashSet<>();
        int size = arr.length;
        for(int i =0; i < size; i++){
            newSet.add(arr[i]);
        }
        for(int element : newSet) {

            System.out.println(element);
        }
    }
}
