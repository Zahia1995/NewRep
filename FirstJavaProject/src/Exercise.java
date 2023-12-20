public class Exercise {
    public static void main(String[] args) {

            /* Exercise 01
            Scanner scanner1= new Scanner(System.in);
              System.out.println("enter your number1");
              int number1 = scanner1.nextInt();

              Scanner scanner2= new Scanner(System.in);
              System.out.println("enter your number2");
              int number2 = scanner2.nextInt();

              if (number1>number2) {
               System.out.println(number1);
                    }
              else {
              System.out.println(number2);
                 }
           */

            /* Exercise 02
            int x=3;
            int y=5;
            int z=25;
            if (x>y && x>z) {
            System.out.println("number max:"+x);

            } else if (y>x && y>z) {
            System.out.println("number max:"+y);
            }
            else {
            System.out.println("number max:"+z);
            }

           */


            /* Exercise 03
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter your number");
            int x = scanner.nextInt();

            if (x>0) {
            System.out.println("number is positive");
            }
            else if (x<0) {
            System.out.println("number is negative");
            }
            else {
            System.out.println("number is null");
            }
            */

            /* Exercise 04
            int x=55;
            if (x%5 ==0 && x%11==0){
            System.out.println("the number is divisible by 5 and 11");
            }
            else {
            System.out.println("the number is not divisible by 5 and 11 ");
            }
            */


           /* Exercise 06
           int year = 2020;
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " is a leap year.");
            }
            else{
                System.out.println(year + " is not a leap year.");
             }*/



           /* Exercise 07
           char c = 'b';

                    if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
                        System.out.println(c + " is an alphabet.");}
                    else {
                        System.out.println(c + " is not an alphabet.");}
            */



       /* Exercise 08
       char ch = 'i';

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");
        */


        /* Exercise 09
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

    } */







         /* 10
         int age1, age2, age3;

            Scanner sc= new Scanner(System.in);
            System.out.println("give your age1");
            age1= sc.nextInt();

            Scanner sc1= new Scanner(System.in);
            System.out.println("give your age2 ");
            age2= sc1.nextInt();

            Scanner sc2= new Scanner(System.in);
            System.out.println("give your age3 ");
            age3= sc2.nextInt();

            if(age1>age2 && age1>age3){
                System.out.println("age1 is the oldest ");
            }
            else if (age2>age1 && age2>age3){
                System.out.println("age2 is the oldest");
            }
            else {
                System.out.println("age3 is the oldest");
            } */


        /* Exercise 11
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
      */
    }

    }
