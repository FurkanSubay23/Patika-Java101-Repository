package Ebebek;

import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        Double pearKg =2.14, appleKg =3.67, tomatoKg =1.11, bananaKg =0.95, aubergineKg =5.00;
        double pearValue, appleValue, tomatoValue, bananaValue, aubergineValue;
        Scanner inp=new Scanner(System.in);
        System.out.print("Armut KG:");
        pearValue =inp.nextDouble();
        System.out.print("Elma KG:");
        appleValue =inp.nextDouble();
        System.out.print("Domates KG:");
        tomatoValue =inp.nextDouble();
        System.out.print("Muz KG:");
        bananaValue =inp.nextDouble();
        System.out.print("Patlican KG:");
        aubergineValue =inp.nextDouble();
        double result =(pearKg * pearValue)+(appleKg + appleValue)+
                (tomatoKg + tomatoValue)+(bananaKg + bananaValue)+(aubergineKg + aubergineValue);
        System.out.print("TOPLAM :"+ result);

    }
}
