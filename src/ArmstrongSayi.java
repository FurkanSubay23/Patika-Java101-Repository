import java.util.Scanner;
public class ArmstrongSayi {
    public static void main(String[] args) {
        //ArmStrong Sayi Bulma
        int sayi,k=0,total,sanal,sayac=0;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Bir sayi gir");
            sayi = scan.nextInt();
            sanal = sayi;
        }while (sayi <=0);      // Sayi alindi.

        while (sanal !=0){
            sayac = (sanal % 10);
            k+=sayac;
            sanal = sanal / 10;
            System.out.print(" "+sayac);
        }
        System.out.println();
        System.out.println(k);


    }
}
