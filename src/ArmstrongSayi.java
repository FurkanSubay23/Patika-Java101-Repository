import java.util.Scanner;
public class ArmstrongSayi {
    public static void main(String[] args) {
        //ArmStrong Sayi Bulma
        int sayi,sanal,sayac=0,total,basamak = 1,usler = 0,k=1;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Bir sayi gir");
            sayi = scan.nextInt();               // Sayi alindi.
            sanal = sayi;
        }while (sayi <=0);

        while (sanal !=0){
            total = (sanal % 10);           //10 a bölümünden kalanı ekle.
            sanal = sanal / 10;             //Durmadan 10 a böl ve basamaklara ayır.
            System.out.print(" "+total);
            sayac++;
        }
        System.out.println();
        System.out.println(sayac+" Basamaklidir.");

        sanal = sayi;
        while (sanal !=0){
            basamak = (sanal % 10);
            sanal /=10;
            k=1;
            for (int i =1; i<=sayac; i++){
                k*=basamak;                     //Üslerini al.
            }
            System.out.println(k);              //Basamak üs alınmışını yazdır.
            usler += k;
        }
        System.out.println(usler);
        if (usler==sayi){
            System.out.println(sayi + " Sayisi Armstrong sayisidir");
        }
        else {
            System.out.println(sayi+" sayisi armstrong sayisi degildir.");
        }


    }
}
