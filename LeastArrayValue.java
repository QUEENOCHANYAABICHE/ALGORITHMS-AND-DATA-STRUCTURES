
package org.app;


//WRITE A PROG THAT FINDS THE SMAALLEST ELEMENT IN AN ARRAY USING LOOPS
import java.util.*;
public class Main{
    public static void main(String[] args){
        int[] arr = new int[] {1,2,3,4,5,6,7,8,9,1};
//MAKE THE FIRST ELEMENT A VARIABLE & COMPARE IT WITH OTHER ELEMENTS IN THE ARRAY USING A LOOP
        int first = arr[0];
        int size = arr.length - 1;
        for(int i = size  ; i <= size; i++) {
            if (arr[i] < first) {
                first = arr[i];
            }
        }
        System.out.println(first);
    }
}
