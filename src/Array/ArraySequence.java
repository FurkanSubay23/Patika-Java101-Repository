package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = 0;
        System.out.println("Dizinin elemanlarini gir: ");
        int length = scanner.nextInt();
        int[] list = new int[length];
        for (int i = 0; i < list.length; i++) {
            double random = Math.random() * 100;
            value = (int) random;
            System.out.println("Dizinin " + i + ". elemani " + value);
            list[i] = value;
        }
        Arrays.sort(list);
        System.out.println("Dizinin kucukten buyuge siralanisi:");
        System.out.println(Arrays.toString(list));

    }
}
