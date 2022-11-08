package Donguler;

import java.util.Scanner;

public class MukSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        System.out.println("bir sayi gir");
        int sayi = input.nextInt();
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {    //girilen sayının i'ye bölumunden kalan 0 ise sayaca i'yi ekle.
                counter += i;
            }
        }
        if (counter == sayi) {  // sayac girilen sayıya esıt ise mukemmel sayıdır.
            System.out.println(sayi + " Muko sayisidir.");
        } else {
            System.out.println(sayi + " Muko degildir.");   //Değilse mukemmel sayı degıldır.
        }

    }
}
