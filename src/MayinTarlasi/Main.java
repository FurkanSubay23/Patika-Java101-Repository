package MayinTarlasi;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Mayin tarlasinin Satir degerini giriniz!");
        int row= scanner.nextInt();
        System.out.println("Mayin Tarlasi sutun degerinin giriniz");
        int column= scanner.nextInt();

        MineSweeper mineSweeper = new MineSweeper(row, column);
        mineSweeper.print();


    }
}
