package Array;

import java.util.Arrays;

public class ArrayAgain {
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] array = new int[list.length];
        int value = 1;
        for (int i = 0; i < list.length; i++) {
            int sayac = 1;
            for (int j = 0; j < list.length; j++) {
                if (i != j && list[i] == list[j]) {
                    sayac++;
                    if (isFind(array, list[i])) {
                        array[i] = list[i];
                    }
                }

            }
            System.out.println(list[i] + " sayisi " + sayac + " kere tekrar edildi.");

        }
    }

    static boolean isFind(int[] list, int value) {
        for (int item : list) {
            if (item == value)
                return false;
        }
        return true;
    }
}
