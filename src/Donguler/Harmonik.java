import java.util.Scanner;
public class Harmonik {
    public static void main(String[] args) {
        int sayi;
           double toplam = 0.0;
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi gir");
        sayi= scan.nextInt();
        for (int i=1; i<=sayi; i++){
            toplam = toplam + (1.0 / i);        // 1/i denilince sana int olarak döndürdüğü için oraya 1.0 yazıyorsun kı sana tam bölüm versin.
            System.out.println(toplam);
        }
        System.out.println(toplam);

    }
}
