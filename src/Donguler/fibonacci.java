package Donguler;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int n1 = 1, n2 = 0, result = 0;
        System.out.println("sayi gir");
        Scanner scan = new Scanner(System.in);
        int sayi = scan.nextInt();
        System.out.print("0");
        for (int i = 0; i < sayi; i++) {    //0 dan başla sayıya kadar git.
            result = n1 + n2;               // sonucu önceki 2 sayı ile topla
            n2 = n1;                        //kucuk sayıyı buyuk sayıya esıtle
            n1 = result;                    //Buyuk sayıyı sonuca esıtle.
            System.out.print("," + n1);
        }
    }
}
