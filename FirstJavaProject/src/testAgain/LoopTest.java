package testAgain;

public class LoopTest {
    public static void main(String[] args) {
        int sum=0;
        int i=1;
        for (i=1; i<=100; i++){

            sum= sum+i;
            if (sum>2000)
                break;


        }
        System.out.println(i);
        System.out.println(sum);

    }
}
