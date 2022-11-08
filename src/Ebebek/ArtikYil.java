package Ebebek;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int year;

        Scanner inp = new Scanner(System.in);

        System.out.println("Yıl Giriniz :");
        year = inp.nextInt();

        if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {  // Yılın 4 e bölumunden kalan 0 VE, 100 e bölumunden kalan 0 değil YADA
            System.out.println(year + " bir artık yıldır!");                // 400 e tam bolunuyorsa işlem yapılsın diyoruz.
        } else {
            System.out.println(year + " bir artık yıl değildir");
        }
    }
}
