package Method;
import java.util.Scanner;
public class Exponantial {
    static int result = 1;      // Burada tanımlıyoruz sonucu method içinde degil. Cunku for döngüsü gibi oluyor ve result her başa döndugunde 1 ile başlıyor.
    static int exp(int a, int b){

        if (b == 0){
            return 1;
        }
            result*=a;
           exp(a,b-1);
           return result;

    }

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a,b;
        System.out.println("Enter the number: ");
        a = scan.nextInt();
        System.out.println("Enter the exponantial: ");
        b = scan.nextInt();
        System.out.println(exp(a,b));
    }
}
