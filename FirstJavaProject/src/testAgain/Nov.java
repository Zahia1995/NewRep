package testAgain;

import java.util.Scanner;

public class Nov {
    public static void main(String[] args) {
        int salary, bonus, year;
        Scanner sc= new Scanner(System.in);
        System.out.println("give your salary");
        salary= sc.nextInt();

        Scanner sc1= new Scanner(System.in);
        System.out.println("give your year ");
        year= sc1.nextInt();

        if (year > 5) {
            bonus= salary * 5/100;
            System.out.println("the bonus is "+bonus);
        }
        else
            System.out.println("No bonus");

    }
}

