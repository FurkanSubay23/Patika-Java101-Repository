import java.util.Scanner;
public class ebok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ebob = 0, ekok = 1;
        System.out.println("Ilk sayi gir");
        int sayi1 = input.nextInt();
        System.out.println("sayi 2 gir");
        int sayi2 = input.nextInt();
        if (sayi1 > sayi2) {
            for (int i = 1; i < sayi1; i++) {
                if (sayi1 % i == 0 && sayi2 % i == 0) {     //Ebob için döngü.
                    ebob = i;
                    ekok = (sayi1 * sayi2) / ebob;
                }
            }
        }
                else {
                    for (int j = 1; j < sayi2; j++) {
                        if (sayi1 % j == 0 && sayi2 % j == 0) {
                            ebob = j;
                            ekok = (sayi1 * sayi2) / ebob;
                        }
                    }
                }
            System.out.println("ebob: "+ebob );
            System.out.println("ekok: "+ekok);


    }
}
