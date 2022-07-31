package Array;

public class Transpoze {
    public static void main(String[] args) {
        int[][] list = {
                {1, 2, 3,},
                {4, 5, 6}
        };
        int[][] transposeMatrix = new int[list[0].length][list.length];             // Bunu yaparak transpoze matrisin satır uzunluğu, listin sütüna, sutun uzunlugu satır uzunluguna eşitliyoruz.
      //  int[][] transpoze = new int[list.length][];
        System.out.println("Normal Array");
        for (int[] row : list) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
        System.out.println("///////////////////////////////////////////////////////////////////");
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                transposeMatrix[j][i] = list[i][j];
            }
        }
        System.out.println("Transpoze Array");
        for (int[] row : transposeMatrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

    }

}

