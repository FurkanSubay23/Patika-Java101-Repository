package Donguler;

public class Asal {
    public static void main(String[] args) {
        // System.out.println("2");
        for (int i = 4; i <= 100; i++) {    // 4 ile 100 arası dedıgı ıcın basa o sayıları getiren for dongusu
            boolean var = false;
            for (int j = 2; j < i; j++) {   // sonra o gelen sayıyı bolunuyor mu diye o sayıya kadarkı sayıları bolduruyoruz
                if (i % j == 0) {
                    var = true;
                    break;
                }
            }
            if (var == false) {     // eger bolunmemişse asal sayıdır dıyıp yazdırıyoruz.
                System.out.println(i);
            }
        }
    }
}

