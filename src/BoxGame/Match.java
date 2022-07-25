package BoxGame;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run() {
        if ((f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight)){
            if (isFirst()){
                System.out.println("----------NEW ROUND----------");
                this.f2.health = this.f1.hit(this.f2);
                System.out.println(this.f2.name + " isimli kisinin " + this.f2.health + " cani kaldi");
            }
            else  {
                System.out.println("----------NEW ROUND----------");
                this.f1.health = this.f2.hit(this.f1);
                System.out.println(this.f1.name + " isimli kisinin " + this.f1.health + " cani kaldi");
            }
        }
    }

    void run1() {
        if ((f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight)) {
            if (isFirst()){                                                                                             // İlk vuruş için random üretiliyor.
                System.out.println("----------NEW ROUND----------");
                this.f2.health = this.f1.hit(this.f2);
                System.out.println(this.f2.name + " isimli kisinin " + this.f2.health + " cani kaldi");
            }
            else if (isFirst()==false){
                System.out.println("----------NEW ROUND----------");
                this.f1.health = this.f2.hit(this.f1);
                System.out.println(this.f1.name + " isimli kisinin " + this.f1.health + " cani kaldi");
            }
            while (isHealth()) {
                System.out.println("----------NEW ROUND----------");
                this.f2.health = this.f1.hit(this.f2);
                if (isWin()) {
                    break;
                }
                System.out.println(this.f2.name + " isimli kisinin " + this.f2.health + " cani kaldi");
                this.f1.health = this.f2.hit(this.f1);
                if (isWin()) {
                    break;
                }
                System.out.println(this.f1.name + " isimli kisinin " + this.f1.health + " cani kaldi");
            }
        }
    }

    boolean isHealth() {
        if ((this.f1.health > 0) && (this.f2.health > 0)) {
            return true;
        }
        if (this.f1.health > 0) {
            return false;
        }
        if (this.f2.health > 0) {
            return false;
        }
        return true;
    }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " isimli boxer WINNNN!!!!!!!!!!");
            return true;
        }
        if (this.f2.health == 0) {
            System.out.println(this.f1.name + " isimli boxer WINNNN!!!!!!!!!!!");
            return true;
        }
        return false;
    }

    boolean isFirst() {
        double first = Math.random() * 100;
        int isFirst = (int) first;
        return isFirst > 50;                // random sayi 50 den kücükse true döndür.



    }


}
