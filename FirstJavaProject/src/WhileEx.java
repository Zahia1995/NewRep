public class WhileEx {
    public static void main(String[] args) {
      /*  int i=0;

        System.out.println(i);


        while (i<5) {
            System.out.println(i);
            i++;
        }

        do{
            System.out.println(i);
            i++;
        } while (i<5);*/

        int i=1990;
        int lyear=0;
        while (i<=2023){

            if (i%4==0){
                lyear= lyear+1;
                break;
            }
            i++;
        }
        System.out.println(i);




    }


}
