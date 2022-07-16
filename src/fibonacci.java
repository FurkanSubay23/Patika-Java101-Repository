import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        int n1=1,n2=0,toplam=0;
        System.out.println("sayi gir");
        Scanner scan=new Scanner(System.in);
        int sayi= scan.nextInt();
        System.out.print("0");
        for (int i=0; i<sayi; i++){
          toplam = n1 +n2;
          n2 =n1;
          n1=toplam;
            System.out.print(","+n1);
        }
    }
}
