public class LoopClass {
    public static void main(String[] args) {
       /* for(int i=1; i<=10; i++){
            System.out.println("the number is"+i);
            i++;
        } */

       /* for (int i=10; i>1; i--){
            System.out.println(i);
        }*/
        int sumofi= 0;
        for (int i=1; i<= 1000; i++){
            if (i%2!=0){
                sumofi= sumofi +i;
            }

        }
        System.out.println(sumofi);

    }
}
