import java.util.Scanner;
public class TekSayiToplama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k,toplam=0;
        do {
            System.out.println("Bir sayi gir");
            k= scan.nextInt();
            toplam +=k;

        } while (k > 0);
        if (k % 2 !=0){
            System.out.println(toplam);
        }
    }
}
