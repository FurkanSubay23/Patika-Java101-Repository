package Array;

import java.util.Arrays;
import java.util.Scanner;

public class PratikHarmonik {
    static void harmonik(double[] list) {
        Scanner scan = new Scanner(System.in);
        double deger;
        double harmonik = 1, toplam;
        for (int i = 0; i < list.length; i++) {
            System.out.print(i + ". elemani gir: ");
            deger = scan.nextInt();
            list[i] = deger;
            harmonik = harmonik + (1 / list[i]);
        }

        toplam = (list.length) / harmonik;
        System.out.println(harmonik);
        System.out.println("Diziniz: " + Arrays.toString(list));
        System.out.println("Harmonik Ortalama Hesaplamasi: " + toplam);
    }

    static void minMax(double[] list) {
        Scanner scan = new Scanner(System.in);
        double kucuk = Double.MIN_VALUE, buyuk = Double.MAX_VALUE;
        System.out.println("Deger gir: ");
        double value = scan.nextDouble();
        for (double item : list) {
            if (item < value) {
                if (item > kucuk) {
                    kucuk = item;
                }
            } else {
                if (item < buyuk) {
                    buyuk = item;
                }
            }
        }
        System.out.println("Girilen sayidan kucuk ve en yakin sayi: " + kucuk);
        System.out.println("Girilen sayidan buyuk ve en yakin sayi: " + buyuk);
    }

    static void cokBoyut() {
        String[][] list = new String[7][4];

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {

                if (i == 0 || i == 3 || i == 6) {
                    list[i][j] = " * ";
                } else if (j == 0 || j == 3) {
                    list[i][j] = " * ";
                } else {
                    list[i][j] = "   ";
                }
            }
        }
        for (String[] row : list) {
            for (String column : row) {
                System.out.print(column);
            }
            System.out.println();
        }
    }

    static boolean isFind(double[] list, double value) {        // Tekrar eden değer var mı diye kontrol ettiğimiz method.
        for (double item : list) {
            if (item == value) {
                return false;
            }
        }
        return true;
    }

    static void tekrar(double[] list) {
        double[] arr = new double[list.length];
        int sıralama = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < i; j++) {
                if (list[j] == list[i]) {
                    if (isFind(arr, list[i]))
                        arr[sıralama] = list[i];
                    sıralama++;
                    break;
                }
                }
            }
        for (double item:arr){
            if (item!=0){
                System.out.print(item+" , ");
            }
        }
        }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Diziniz kac elemanli olsun");
        int a = scan.nextInt();
        double[] list=new double[a];
        double[] list1 = {321, 34, 56, 987, 65, 56, 234, 234, 54, 765, 34, 87, 21, 37, 876, 765, 34};
        harmonik(list);
        System.out.println("///////////////////////////////////////////////////");
        minMax(list);
        System.out.println("///////////////////////////////////////////////////");
        cokBoyut();
        System.out.println("///////////////////////////////////////////////////");
        tekrar(list1);

    }
}
