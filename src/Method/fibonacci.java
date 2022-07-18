package Method;
import java.util.Scanner;
public class fibonacci {

    static int fibonacci(int sayi){
       if ( sayi == 1 || sayi == 2 ){
           return 1;
       }
       return fibonacci(sayi - 1) + fibonacci(sayi - 2);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(6));
    }
}
