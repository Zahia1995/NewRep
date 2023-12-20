public class SecondClass {
    public static void main(String[] args) {
        int num1 = 9;
        int num2 = 10;
        int num3 = 22;
        int num4 = num1 + num3 + 2;
        System.out.println(num4);
        /*if (num1 > num2) {
            System.out.println(num1 + " is larger");
        } else {
            System.out.println(num2 + " is larger");
        }
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is larger");
        }
        else if (num2 > num1 && num2 > num3){
            System.out.println(num2+ " is larger");
        }
        else {
            System.out.println(num3+ " is larger");
        }*/
        int grade=84;
        if (grade>=90 && grade<=100) {
            System.out.println("Student got A");
        }
        else if (grade>=80 && grade <=89) {
            System.out.println("Student got B");
        }
        else if (grade>=70 && grade <=79) {
            System.out.println("Student got C");

        }
        else {
            System.out.println("Student got D");
        }
    }
}
