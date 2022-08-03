package MayinTarlasi;

import java.util.Arrays;

public class MineSweeper {
    int row;
    int colomn;


    MineSweeper(int row, int colomn) {
        this.row = row;
        this.colomn = colomn;
    }

    // Yıldız Atma
    String[][] matris() {
        String[][] list = new String[this.row][this.colomn];
        int sayac=0;
        while (sayac<elemanSayisi()){
            double randomRow = Math.random() * this.row;
            double randomColomn = Math.random() * this.colomn;
            list[(int) randomRow][(int) randomColomn]="*";
            sayac++;
        }
       for (int i=0; i<list.length;i++){
           for (int j=0;j<list[i].length;j++){
               if (list[i][j]!="*"){
                   list[i][j]="-";
               }
           }
       }


        return list;
    }

    // Tire çekme


    int elemanSayisi() {
        int eleman = (this.row * this.colomn) / 4;
        return eleman;

    }
    void print(){
        for (String[]row:matris()){
            for (String colomn: row){
                System.out.print(colomn);
            }
            System.out.println();
        }

    }


}
