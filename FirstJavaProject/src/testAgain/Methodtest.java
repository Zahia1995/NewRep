package testAgain;

public class Methodtest {
    public static void main(String[] args) {

        //findRectangleArea(5.6,6.9);
       boolean isTrue= findSquare ( 20.0,  29.0);
        System.out.println(isTrue);
    }
  /*   public static void findRectangleArea (double length, double width){
        double area= length*width;
         System.out.println("Area is :"+area);

     } */

   /* public static double findRectangleArea (double length, double width){
        double area= length*width;
        System.out.println("Area is :"+area);
        return area;

    }*/

   /* public static boolean findSquare (double length, double width){

        if (length==width)
            return true;
        else
            return false;

    } */

    public static boolean findSquare (double length, double width){

        return length==width;
    }


        }
