package Donguler;

import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi gir");
        int sayi = scan.nextInt();
        for (int i = sayi; i >= 0; i--) {   // girilen sayidan 0 a kadar git.
            for (int j = sayi - i; j > 0; j--) {    // girilen sayidan i yi çıkar ve j 0 olana kadar boşluk bırak
                System.out.print(" ");
            }
            for (int k = (2 * i) + 1; k > 0; k--) { // boşlukdan sonra i nin 2 katının 1 fazlasından 0 akadar * bırak.
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
