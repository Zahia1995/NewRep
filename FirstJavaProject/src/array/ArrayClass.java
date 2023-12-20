package array;

public class ArrayClass {
    public static void main(String[] args) {

        int[] numbers = new int[5];

        numbers[0] = 9;
        numbers[1] = 10;
        numbers[2] = 11;
        numbers[3] = 12;
        numbers[4] = 13;



       /* int sum=0;
       for (int i=0; i<numbers.length; i++){
           sum=sum+numbers[i];
       }
        System.out.println(sum); */
     //addSum(numbers);
       int max=numbers[0];
        for (int i=0; i<numbers.length; i++){
            if (numbers[i] > max) {
                max=numbers[i];

            }

        }
        System.out.println(max);
    }

  /*  public static void addSum (int [] nums){
        int sum=0;
        for (int i=0; i<nums.length; i++){
            sum=sum+nums[i];
        }
        System.out.println(sum); */
    }

