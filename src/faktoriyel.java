import java.util.Scanner;
public class faktoriyel {
    public static void main(String[] args) {
        // sayi girsin. sayiya kadar olanlari,for dongusu ile çarpıp o sayiya esitle.
        Scanner scan = new Scanner(System.in);
        int n= 1,r=1,kombinasyon,a=1;
        System.out.println("n yi gir");
        int k= scan.nextInt();
        for (int i=1; i<=k;i++){
            n*=i;
        }
        System.out.println("r yi gir");
        int m= scan.nextInt();
        for (int i=1; i<=m;i++){
            r*=i;
        }
        for (int i=1; i<=(k-m);i++){
            a*=i;
        }
        kombinasyon =(n/(r*a));
        System.out.println(kombinasyon);

    }
}
