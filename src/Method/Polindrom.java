package Method;
import java.util.Scanner;

public class Polindrom {

    static boolean polindrom(int temp){
        int sayi1 = temp, lastNumber, reverseNumber = 0;
        while (sayi1 !=0){
            lastNumber = sayi1 % 10;
            reverseNumber = (reverseNumber * 10 ) + lastNumber;
            sayi1 /= 10;
        }
        if (reverseNumber == temp)
            return true;
        else
        return false;
    }

    public static void main(String[] args) {
        //Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.
       boolean var = polindrom(777);
        System.out.println(var);
    }
}
