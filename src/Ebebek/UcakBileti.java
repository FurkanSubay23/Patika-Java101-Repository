package Ebebek;

import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {

        double km, price, pricePerKM;
        int type, old;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen kaç km gideceğinizi yazınız: ");
        km = input.nextDouble();

        pricePerKM = km * 0.10;

        System.out.print("Lütfen sadece gidiş için 1'i, Gidiş-Dönüş için 2'yi seçin: ");
        type = input.nextInt();

        System.out.print("Lütfen Yaşınızı giriniz:");
        old = input.nextInt();

        if (type == 1) {    //if customer select type 1

            if ((old >= 0) && (old < 12)) {              //if old bigger than 0 AND smaller than 12
                price = pricePerKM * 0.5;
                System.out.print("Ödeyeceğiniz Tutar: " + price + "TL");
            } else if ((old >= 12) && (old <= 24)) {    //if old bigger than 12 AND smaller than 24
                price = pricePerKM * 0.9;
                System.out.print("Ödeyeceğiniz Tutar: " + price + "TL");

            } else if (old >= 65) {                     //if old bigger than 65
                price = pricePerKM * 0.7;
                System.out.print("Ödeyeceğiniz Tutar: " + price + "TL");
            } else {
                System.out.print("Hatalı İşlem Yapıldı! Lütfen Tekrar Deneyiniz.");
            }

        } else if (type == 2) { //if customer choose type 2

            if ((old >= 0) && (old < 12)) {     //if old bigger than 0 AND smaller than 12
                price = (2 * pricePerKM) * 0.5 * 0.8;
                System.out.print("Ödeyeceğiniz Tutar: " + price + "TL");

            } else if ((old >= 12) && (old <= 24)) {    //if old bigger than 12 AND smaller than 24
                price = (2 * pricePerKM) * 0.9 * 0.8;
                System.out.print("Ödeyeceğiniz Tutar: " + price + "TL");

            } else if (old >= 65) {                     //if old bigger than 64
                price = (2 * pricePerKM) * 0.7 * 0.8;
                System.out.print("Ödeyeceğiniz Tutar: " + price + "TL");
            } else {
                System.out.print("Hatalı İşlem Yapıldı! Lütfen Tekrar Deneyiniz.");
            }

        } else {
            System.out.print("Hatalı işlem yapıldı! Lütfen tekrar deneyiniz.");
        }

    }
}
