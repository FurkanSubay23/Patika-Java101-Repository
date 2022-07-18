import java.util.Scanner;
public class ikininkatlari {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi girin");
        int a = scan.nextInt();
        System.out.println("4 un katlari ");
        for (int i =1; i<=a; i*=4){
            System.out.println(i);
        }
        System.out.println("5 in katlari");
        for (int i=1; i<=a; i*=5){
            System.out.println(i);
        }
    }
}
