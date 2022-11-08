package Method;

import java.util.Scanner;

public class AsalRecrusive {

    static void asalRecrusive(int a, int i) {
        if (a == i) {
            System.out.println(a + " number is asal");
            return;
        } else if (a % i == 0) {
            System.out.println(a + " number is  not asal");
            return;         // Method bitiriyor. Methodun breaki gibi.
        }
        asalRecrusive(a, i + 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        boolean var = true;
        while (var) {   // var boolen true ise dönguye gır denılıyor
            System.out.println("Enter the number: ");
            int a = input.nextInt();
            asalRecrusive(a, 2);    //Methodu cagırıyoruz.
            System.out.println("Dou you want to continue: ");
            String cnt = scan.nextLine();
            if (cnt.equals("no"))
                var = false;
        }
    }
}
