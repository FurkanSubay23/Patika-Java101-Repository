package BoxGame;

public class Fighter {
    String name;
    int health;
    int weight;
    int damage;
    int dodge;

    Fighter(String name, int health, int weight, int damage, int dodge) {
        this.name = name;
        this.health = health;
        this.weight = weight;
        this.damage = damage;
        this.dodge = dodge;

    }

    int hit(Fighter foe) {
        if ((foe.health - this.damage) < 0) {
            return 0;
        }
        if (foe.dodge()) {                    // Burada foe.dodge diyerek this.dodge nın foeye ait olduğunu belli ediyoruz.
            System.out.println(foe.name + " isimli boxer, " + this.name + " isimli kisinin vurusunu engelledi.");
            return foe.health;
        }
        System.out.println(this.name + " isimli boxer " + this.damage + " hasar vurdu!");
        return (foe.health - this.damage);

    }

    boolean dodge() {
        double randomNumber = Math.random() * 100;
        int number = (int) randomNumber;
        if (this.dodge >= number) {
            return true;
        }
        return false;
    }

}

