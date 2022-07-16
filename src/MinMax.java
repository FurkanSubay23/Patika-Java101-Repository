import java.util.Scanner;
public class MinMax {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE,n1;     // min ve max değerlerine yüksek tutuyoruzki, min max ı bulalım.
        System.out.println("bir sayi giriniz");
        int sayi= input.nextInt();
        for (int i=1; i<=sayi; i++){
            System.out.println(i + ". Sayiyi giriniz");
            n1=input.nextInt();
            if (max<n1){
                max = n1;
            }
            if (min > n1) {
                min = n1;
            }
        }
        System.out.println("max sayisi: "+ max + "\n min sayisi: "+min);
    }
}
