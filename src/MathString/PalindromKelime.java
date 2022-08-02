package MathString;

import java.util.Scanner;

public class PalindromKelime {

    static void kelime(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);

        }
        System.out.println("Kelimenin tersten yazilisi: " + reverse);
        if (!reverse.equals(str)) {
            System.out.println("Kelime palindrom degil");
        } else {
            System.out.println("Kelime palindromdur.");
        }

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir string gir: ");
        String kelime = scanner.nextLine();
        kelime(kelime);

    }


}
