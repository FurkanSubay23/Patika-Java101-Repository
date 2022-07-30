package Array;

import java.util.Arrays;

public class HelperArray {

    static void print(int[] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

    static void prinln(int[] arr, int bas, int son, int deger) {
        for (int i = bas; i < son; i++) {
           arr[i]=deger;

        }
        System.out.println(Arrays.toString(arr));
    }



}
