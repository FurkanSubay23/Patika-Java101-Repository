import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        int bakiye = 150, islem, cek, yatir,toplam = 0;
        String id, password, idd, pasw, devam;
        System.out.println("Id nizi belirleyiniz");
        id = scan.nextLine();
        System.out.println("Password belirleyin");
        password = scan.nextLine();
        System.out.println("ATM ye hosgeldin");
        System.out.println("ID girin");
        idd = scan.nextLine();
        System.out.println("passwordunuzu girin");
        pasw = scan.nextLine();
        while (!id.equals(idd) || !password.equals(pasw)) {
            System.out.println("ID veya sifreniz yanlistir. Bir daha giriniz");
            System.out.println("ID");
            idd = scan.nextLine();
            System.out.println("passwordunuzu girin");
            pasw = scan.nextLine();
        }                                               // Switch case yapısını while içine yazmıyorurz ki sıkıntı olmasın.
        System.out.println("Bir islem seciniz");
        System.out.println("1 Bakiye sorgula\n2 para cek\n3 para yatir");
        islem = input.nextInt();
        while (islem < 1 || islem > 3) {
            System.out.println("Yanlis secim yapildi bir daha");
            System.out.println("Bir islem seciniz");
            System.out.println("1 Bakiye sorgula\n2 para cek\n3 para yatir");
            islem = input.nextInt();
        }
        switch (islem) {
            case 1:
                System.out.println(bakiye + " Tl niz vardir");
                break;
            case 2:
                System.out.println("Kac tl cekeceksiniz ?");
                cek = input.nextInt();
               bakiye -=cek;
                System.out.println("Kalan bakiyeniz: " + bakiye);
                break;
            case 3:
                System.out.println("Yatirmak istediginiz parayi giriniz");
                yatir = input.nextInt();
                bakiye+=yatir;
                System.out.println("Toplam paraniz: " + bakiye);
                break;
        }

        System.out.println("Baska bir islem yapmak istiyor musunuz ?");
        devam = scan.nextLine();
        while (devam.equals("evet")) {
            System.out.println("Bir islem seciniz");
            System.out.println("1 Bakiye sorgula\n2 para cek\n3 para yatir");
            islem = input.nextInt();
            while (islem < 1 || islem > 3) {
                System.out.println("Yanlis secim yapildi bir daha");
                System.out.println("Bir islem seciniz");
                System.out.println("1 Bakiye sorgula\n2 para cek\n3 para yatir");
                islem = input.nextInt();
            }
            switch (islem) {
                case 1:
                    System.out.println(bakiye + " Tl niz vardir");
                    break;
                case 2:
                    System.out.println("Kac tl cekeceksiniz ?");
                    cek = input.nextInt();
                    bakiye = bakiye - cek;
                    System.out.println("Kalan bakiyeniz: " + bakiye);
                    break;
                case 3:
                    System.out.println("Yatirmak istediginiz parayi giriniz");
                    yatir = input.nextInt();
                    bakiye = bakiye + yatir;
                    System.out.println("Toplam paraniz: " + bakiye);
                    break;
            }
            System.out.println("Baska bir islem yapmak istiyor musunuz ?");
            devam = scan.nextLine();

        }
    }



    }

