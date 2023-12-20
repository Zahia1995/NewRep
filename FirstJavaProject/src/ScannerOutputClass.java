import java.util.Scanner;
public class ScannerOutputClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter your number1 :");
        int number1= scanner.nextInt();


        Scanner scanner1 = new Scanner(System.in);
        System.out.println("enter your number2 :");
        int number2= scanner.nextInt();

        Scanner scanner2 = new Scanner(System.in);

        /*3System.out.println("enter your number3 :");
        int number3= scanner.nextInt();


        if (number1 > number2 && number1 > number3) {
            System.out.println(number1 + " is larger");
        }
        else if (number2 > number1 && number2 > number3){
            System.out.println(number2+ " is larger");
        }
        else {
            System.out.println(number3+ " is larger");
        }*/

        if (number1< 25 && number2>15){
            System.out.println("we are good");
        }
        else if (number1 > 30 && number2<50){
            System.out.println("we are ok");
        }

    }
}
