package Method;
import java.util.Scanner;

public class method {
    static int us(int a, int b){
        int result=1;
       for (int i=1; i<=b; i++){
           result*=a;
       }
        return result;
    }
    static int yazdir(int sayi1, int sayi2){
        int toplam = sayi1+sayi2;
        return toplam;
    }
    static String yaz(String inp){
        return inp;
    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Scanner input =new Scanner(System.in);
        int us1 = us(2,7);
        System.out.println(us1);
        System.out.println(us(5,7));
        System.out.println(yazdir(123,8923));
        System.out.println("gir");
        String abc =yaz("sanane");
        System.out.println(abc);
        System.out.println(yaz("banane"));
        System.out.println("Sayi gir");
        int sayi1= input.nextInt();
        System.out.println("diger sayi gir");
        int sayi2= input.nextInt();
        while (yazdir(sayi1,sayi2)<10){
            System.out.println("Sayi gir");
             sayi1= input.nextInt();
            System.out.println("diger sayi gir");
             sayi2= input.nextInt();
        }
        System.out.println(yazdir(sayi1,sayi2));

    }
}
