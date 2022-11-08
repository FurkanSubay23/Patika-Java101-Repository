package Method;

import java.util.Scanner;

public class DesenMethod {

    static void desen(int a) {
        int b = a;
        System.out.print(b);
        while (b > 0) { // b 0 dan buyuk ise b den 5 cıkar dıyoruz ve yazdırıyoruz
            b -= 5;
            System.out.print(" " + b);
        }
        while (b != a) {    // b a ya eşit degılse b ye 5 ekle diyoruz ve b yı yazdırıyoruz.
            b += 5;
            System.out.print(" " + b);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = input.nextInt();
        desen(number);  // girdigimiz sayıyı methodda yerine koyuyoruz.

    }
}
