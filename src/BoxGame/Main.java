package BoxGame;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Furkan", 100, 120, 13, 63);
        Fighter f2 = new Fighter("Faruk", 100, 110, 11, 53);

        Match match = new Match(f1, f2, 110, 130);
        match.run1();


    }
}
