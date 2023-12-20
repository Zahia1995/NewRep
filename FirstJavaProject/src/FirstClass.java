public class FirstClass {
    public static void main(String[] args) {
        System.out.println("Hello world");

        System.out.println(2 * 5);

        double myDouble = 9.78d;
        int myInt = (int) myDouble; // Manual casting: double to int
        int age;
        System.out.println(myDouble);   // Outputs 9.78
        System.out.println(myInt);
        checkAge(20);
    }

            public static void checkAge(int age) {
                if (age < 18) {
                    System.out.println("you are not allowed to access");
                } else {
                    System.out.println("you can access ");
                }
            }


}


