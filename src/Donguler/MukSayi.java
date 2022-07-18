import java.util.Scanner;
public class MukSayi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sayac = 0;
        System.out.println("bir sayi gir");
        int sayi = input.nextInt();
        for (int i=1; i<sayi; i++){
            if (sayi % i ==0){
                sayac+=i;
            }
        }
        if (sayac == sayi){
            System.out.println(sayi + " Muko sayisidir.");
        }
        else {
            System.out.println(sayi +" Muko degildir.");
        }

    }
}
