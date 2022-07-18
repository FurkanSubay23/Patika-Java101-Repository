import java.util.Scanner;
public class UsluSayi {
    public static void main(String[] args) {
        int n,k,total=1;
        Scanner scan=new Scanner(System.in);
        System.out.println("Tabani gir");
        n= scan.nextInt();
        System.out.println("Ussu gir");
        k= scan.nextInt();
        for (int i=1; i<=k; i++){
            total*=n;
        }
        System.out.println(total);
    }

}
