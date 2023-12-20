public class Exer21 {
    public static void main(String[] args) {
  /*      float mScore= 89;
        float eScore= 50;
        if (mScore>=90 && eScore>=90) {
            System.out.println("student is very good");

        }
        else if (mScore>= 90 && eScore < 90 ) {
            System.out.println("Student is good");
        }
        else if (mScore<90) {
            System.out.println("Student is okay");
        }
*/

        int sum = 0;
        for (int i = 0; i < 999; i++) {

            if (i % 2 == 0) {
                sum = sum + i;
                System.out.println(sum);

                if (sum >= 1000) {
                    System.out.println(i);
                    break;
                }
            }


        }
    }}
