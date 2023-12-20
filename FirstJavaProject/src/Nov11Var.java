

import java.util.Scanner;

public class Nov11Var {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter your number1 :");
        int number1= scanner.nextInt();

        if (number1 % 2== 0) {
            System.out.println("it is an even number");
        }
        else {
            System.out.println("it is an odd number");
        }
    }
}

