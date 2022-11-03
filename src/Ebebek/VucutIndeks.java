package Ebebek;

import java.util.Scanner;

public class VucutIndeks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Boyunuzu (metre cinsinde) giriniz :");
        double boy = scanner.nextDouble();
        System.out.println("Kilonuzu giriniz :");
        int kilo =  scanner.nextInt();
        double vki = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz : " + vki);
    }
}
