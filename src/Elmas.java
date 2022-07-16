import java.util.Scanner;

public class Elmas {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("bir sayi gir");
        int sayi=input.nextInt();

           for (int i=0; i<=sayi; i++){         //Kaç satır olduğunu belli eder.
               for (int j=sayi-i; j>0; j--){    //Kaç tane boşluk atmak ıcın girer. İlk başta boşluk olsada i ye bağlı olacağı için ilk for un altına yazılır.
                   System.out.print(" ");
               }

              for (int k=1; k<=(2*i+1);k++){    //Kaç tane * gelicek belli eder.İ ye bağlı attığımız ıcın onu kullanırız.
                  System.out.print("*");
              }
               System.out.println();
           }
           for (int i=sayi; i>=0; i--){         //Kaç satır olduğunu belli eder.Yukarıdakinin tam tersidir.
               System.out.print(" ");           //İlk başta 1 boşluk fazladan bıraktığımız ıcın bunu yaparız.
               for (int j=0; j<sayi-i; j++){    //Kaç tane boşluk atmak ıcın girer. İlk başta boşluk olsada i ye bağlı olacağı için ilk for un altına yazılır.Yukarının tam tersi.
                   System.out.print(" ");
               }
               for (int k=2*(i-1)+1; k>=1; k--) {    ////Kaç tane * gelicek belli eder.İ ye bağlı attığımız ıcın onu kullanırız.
                   System.out.print("*");
               }
               System.out.println();
           }
    }
}
