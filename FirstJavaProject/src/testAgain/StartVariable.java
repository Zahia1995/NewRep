package testAgain;

public class StartVariable {
    public static void main(String[] args) {
      /*  double num1=23.6;
        double num2=63.7;
        double num3= 666.85;

        if (num1+num2> num3) {
            System.out.println("num3 is not greater than num1+ num2");
        }
        else
            System.out.println("num3 is greater than num1+ num2"); */


        int month =6;

        switch (month){
            case 1: {
                System.out.println("Month is january");
                break;
            }

            case 2: {
                System.out.println("Month is february");
                break;
            }

            case 12: {
                System.out.println("Month is December");
                break;
            }

            default: {
                System.out.println("no idea");
            }
        }


    }
}
