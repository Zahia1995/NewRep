public class MethodClass {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 6;
        int sum = num1 + num2;
        System.out.println(sum);
        sumMethod();
        addTwoNumbersWithParm(9, 88);
        multThreeNum(2, 4, 5);
        largerValue(4, 6, 8);

    }

    public static void sumMethod() {
        int num1 = 3;
        int num2 = 6;
        int sum = num1 + num2;
        System.out.println(sum);
    }

    public static void addTwoNumbersWithParm(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println(sum);

    }

    public static void multThreeNum(int numb1, int numb2, int numb3) {
        int multp = numb1 * numb2 * numb3;
        System.out.println(multp);
    }

    public static void largerValue(int numb1, int numb2, int numb3) {
        if (numb1 > numb2 && numb1 > numb3) {
            System.out.println("the largest number is " + numb1);
        } else if (numb2 > numb1 && numb2 > numb3) {
            System.out.println("the largest number is " + numb2);
        } else
            System.out.println("the largest number is " + numb3);
    }

    public static boolean aGreaterB(int numb1, int numb2) {
        boolean result;
        if (numb1 > numb2)
            return true;
        else
            return false;


    }
}
