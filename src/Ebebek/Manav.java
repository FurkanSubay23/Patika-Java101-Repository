package Ebebek;

import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        Double armutKilo=2.14,elmaKilo=3.67,domatesKilo=1.11,muzKilo=0.95,patlicanKilo=5.00;
        double armutMiktar,elmaMiktari,domatesMiktar,muzMiktar,patlicanMiktar;
        Scanner inp=new Scanner(System.in);
        System.out.print("Armut KG:");
        armutMiktar=inp.nextDouble();
        System.out.print("Elma KG:");
        elmaMiktari=inp.nextDouble();
        System.out.print("Domates KG:");
        domatesMiktar=inp.nextDouble();
        System.out.print("Muz KG:");
        muzMiktar=inp.nextDouble();
        System.out.print("Patlican KG:");
        patlicanMiktar=inp.nextDouble();
        double toplamTutar=(armutKilo*armutMiktar)+(elmaKilo+elmaMiktari)+
                (domatesKilo+domatesMiktar)+(muzKilo+muzMiktar)+(patlicanKilo+patlicanMiktar);
        System.out.print("TOPLAM :"+toplamTutar);

    }
}
