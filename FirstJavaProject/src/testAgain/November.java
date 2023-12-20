package testAgain;

import java.util.Scanner;

public class November {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("give your number of classes held");
        int nbClassHeld= sc.nextInt();

        Scanner sc1= new Scanner(System.in);
        System.out.println("give your number of classes attended ");
        int nbClassAttend= sc1.nextInt();

        int perClass= nbClassHeld*100/nbClassAttend;
        if (perClass<75){
            System.out.println("Is not allowed");
        }
        else System.out.println("Is allowed");
    }
}
