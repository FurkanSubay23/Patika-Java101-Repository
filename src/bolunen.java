import java.util.Scanner;
public class bolunen {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int k= scan.nextInt();
        int a=0, b=0, c = 0;
        for (int i=0; i<=k; i++){
            System.out.println(i);

        }
        System.out.println("------------------------");
        System.out.println("3 e ve 5 e bolunen sayilar");
        for (int i =1; i<=k; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println(i);
                a+=i;
                b++;
            }
        }
        System.out.println("-----------------------");
        c = a /b;
        System.out.println(c);

    }
}

