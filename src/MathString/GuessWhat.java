package MathString;

import java.util.Scanner;

public class GuessWhat {

    boolean isNumber = true;
    int kacinci = 0, number, right, value;
    Number numberımsı=new Number();


    void print() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome the sayi tahmini\n\n////////////");
        System.out.println();
        System.out.print("Kac tane hakkin olsun: ");
        this.right = scanner.nextInt();
        System.out.print("Kac ile kac arasinda olsun: ");
        this.value = scanner.nextInt();

        while (this.isNumber && this.kacinci < this.numberımsı.hak(right)) {
            System.out.println("Sayiyi tahmin et: ");
            this.number = scanner.nextInt();
            this.kacinci++;

            if (number == this.numberımsı.random(this.value)) {
                System.out.println("Tebrikler sayiyi buldun "+this.numberımsı.random(this.value));
                this.isNumber = false;
            } else if (this.kacinci == (this.numberımsı.hak(this.right))) {
                System.out.println("Hakkin bitti");
                System.out.println("Cevap: "+this.numberımsı.random(this.value));
            }

        }


    }


}



