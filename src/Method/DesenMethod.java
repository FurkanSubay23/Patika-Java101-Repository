package Method;
import java.util.Scanner;

public class DesenMethod {

    static void desen(int a) {
        int b = a;
        System.out.print(b);
        while (b > 0) {
            b = b - 5;
            System.out.print(" " + b);
        }
        while (b != a) {
            b = b + 5;
            System.out.print(" " + b);
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = input.nextInt();
        desen(number);

    }
}
