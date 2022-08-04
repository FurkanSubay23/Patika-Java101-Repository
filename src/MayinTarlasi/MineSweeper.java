package MayinTarlasi;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class MineSweeper {
    int row;
    int colomn;
    int satırDeger, sutunDeger;
    String[][] list;
    String[][] fakeList;


    MineSweeper(int row, int colomn) {          // Constructor methodu!
        this.row = row;
        this.colomn = colomn;
        this.satırDeger = 0;
        this.sutunDeger = 0;
        this.list = new String[this.row][this.colomn];
        this.fakeList = new String[this.row][this.colomn];
    }

    // Yıldız Atma ve tire çekme
    void matris() {
        int sayac = 0;
        while (sayac < elemanSayisi()) {
            double randomRow = Math.random() * this.row;
            double randomColomn = Math.random() * this.colomn;
            this.list[(int) randomRow][(int) randomColomn] = "*";
            sayac++;
        }
        for (int i = 0; i < this.list.length; i++) {
            for (int j = 0; j < this.list[i].length; j++) {
                if (!Objects.equals(this.list[i][j], "*")) {
                    this.list[i][j] = "-";
                }
            }
        }
        for (int i = 0; i < this.fakeList.length; i++) {
            for (int j = 0; j < this.fakeList[i].length; j++) {
                this.fakeList[i][j] = "-";
            }
        }
    }

    int elemanSayisi() {
        int eleman = (this.row * this.colomn) / 4;
        return eleman;

    }

    boolean isMayin(int row, int colomn, String[][] list) {
        if (list[row][colomn].equals("*")) {
            return false;
        }

        return true;
    }

    void yazdir(String[][] list) {          // İlk matrisi yazdırma islemi.
        for (String[] row : list) {
            for (String colomn : row) {
                System.out.print(colomn);
            }
            System.out.println();
        }
    }


    void degerAlma() {
        Scanner scanner = new Scanner(System.in);
        boolean isDeger = true;

        int row = 0, colomn = 0;
        int sayac = 0;
        while (isDeger) {               // Satır ve sutun degerlerini almak ve hatalı mı diye kontrol etmek ıcın while dongusu.
            System.out.println("Satir degerini gir: ");
            this.satırDeger = scanner.nextInt();
            if (this.satırDeger < 0 || this.satırDeger > this.row) {
                System.out.println("Hatali giris yaptiniz:");
                continue;
            }
            System.out.println("Sutun degerini gir");
            this.sutunDeger = scanner.nextInt();
            if (this.sutunDeger < 0 || this.sutunDeger > this.colomn) {
                System.out.println("Hatali deger girdin: ");
                continue;
            }
            isDeger = false;
        }
    }

    void etraf() {
        int sayac = 0;

        for (int i = this.satırDeger - 1; i <= this.satırDeger + 1; i++) {
            for (int j = this.sutunDeger - 1; j <= this.sutunDeger + 1; j++) {
                if (Objects.equals(this.list[i][j], "*")) {
                    sayac++;
                    this.fakeList[this.satırDeger][this.sutunDeger] = String.valueOf(sayac);
                } else if (Objects.equals(this.list[i][j], "-")) {
                    this.fakeList[this.satırDeger][this.sutunDeger] = String.valueOf(sayac);
                }
            }
        }
    }


    void print() {
        matris();
        Scanner scanner = new Scanner(System.in);
        boolean isPatlama = true;
        String sayac = String.valueOf(0);
        yazdir(this.list);
        while (isPatlama) {
            System.out.println();
            degerAlma();
            System.out.println();
            if (!isMayin(this.satırDeger, this.sutunDeger, this.list)) {
                System.out.println("Game over");
                isPatlama = false;
            }
            if (isMayin(this.satırDeger, this.sutunDeger, this.list)) {
                //this.fakeList[this.satırDeger][this.sutunDeger] = String.valueOf(sayac);
                etraf();

            }
            yazdir(this.fakeList);
            System.out.println();
            yazdir(this.list);
        }


    }


}
