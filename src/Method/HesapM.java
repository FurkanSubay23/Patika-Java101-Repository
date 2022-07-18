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



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;
        System.out.println("WELCOME TO CALCULATOR");
        do {
            System.out.println("Select\n1 - Plus\n2 - Minus\n3 - Multiple\n4 - Divide\n5 - Exponantial Calculator\n6 - Factorial");
             select = input.nextInt();
            switch (select){
                case 1:
                    plus();         break;
                case 2:
                    minus();        break;
                case 3:
                    multiple();     break;
                case 4:
                    divide();       break;
                case 5:

            }
        }while (select != 0);
    }
}
