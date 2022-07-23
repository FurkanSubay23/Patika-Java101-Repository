package Method;
import java.util.Scanner;
public class HesapM {
    static void plus(){
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". number :");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Result : " + result);
       }
       ///////////////////////
       static void minus(){
           Scanner scan = new Scanner(System.in);
           int result = 0,number = 0, i = 0,minus =0;
           System.out.println("Enter big number");
           int big = scan.nextInt();
           while (big>number && minus<=big){
               System.out.println("Enter number for minus");
               number = scan.nextInt();
               System.out.print(i++ +".number");
               minus+=number;
               if (minus>big){
                   break;
               }
               result = big - minus;
           }
           System.out.println("Result: "+result);
       }
       /////////////////////////////

         static void multiple(){
             Scanner scan = new Scanner(System.in);
             int number = 1, result = 1;
             while (number !=0){
                 System.out.print("Enter the number: ");
                     number= scan.nextInt();
                 if (number == 0){
                     System.out.println("Result: "+result);
                     break;
                 }
                     result *= number;

             }
    }
        //////////////////////////////////////
    static void divide(){
        Scanner scan = new Scanner(System.in);
        float big,div = 1.0f,multi = 1.0f,result = 1.0f;
        System.out.println("Enter the big number");
        big = scan.nextFloat();
        while (result >0 && big > multi){
            System.out.print("Enter the div");
            div = scan.nextFloat();
            if (div ==0) {
                System.out.println("0 invalid number for divide");
                break;
            }
            multi *=div;
            if (multi > big)
                break;
            result = big / multi;
        }
        System.out.println("Result: "+result);
    }
    /////////////////////////////////////////

    static void exponantial(){
    Scanner scan = new Scanner(System.in);
    int us = 1, number,usDeger;
        System.out.print("Bir sayi gir: ");
        number = scan.nextInt();
        System.out.println();
        System.out.print("Us degerini gir");
        usDeger = scan.nextInt();
        for (int i = 1; i<=usDeger; i++){
            us*=number;
        }
        System.out.println("Girdiginiz sayinin degeri: "+us);

    }
    //////////////////////////////////////////

    static void factorial(){        // Recrusive methodu ile yapım!!!
        Scanner input = new Scanner(System.in);
        int fact = 1;
        System.out.println("which one number do you want factorial: ");
        int number = input.nextInt();
      for (int i=1; i<=number; i++){
          fact*=i;
      }
        System.out.println("factorial of the number you entered: "+fact);


    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;
        System.out.println("WELCOME TO CALCULATOR");
        do {
            System.out.println("Select\n1 - Plus\n2 - Minus\n3 - Multiple\n4 - Divide\n5 - Exponantial Calculator\n6 - Factorial");
             select = input.nextInt();
            switch (select){
                case 0:
                    System.out.println("Good Bye");
                case 1:
                    plus();         break;
                case 2:
                    minus();        break;
                case 3:
                    multiple();     break;
                case 4:
                    divide();       break;
                case 5:
                    exponantial();  break;
                case 6:
                    factorial();    break;
                default:
                    System.out.println("Try Again");

            }
        }while (select != 0);
    }
}
