package str;

public class StringClass {
    public static void main(String[] args) {
       /* String city= "New York";
        System.out.println(city.length());
        System.out.println(city.contains("york"));

        // comparison
        String city2= "New York";
        System.out.println((city.equals(city2))) ;
        // sequence number
        System.out.println(city.charAt(2));
        System.out.println(city.isEmpty());
        String name= "zahia";


        if (city.length() > name.length()) {
            System.out.println(" city is greater");

        }
        else
            System.out.println("name is greater");



        for (int i=0; i< name.length(); i++) {
            System.out.println(name.charAt(i));
        }
        */
       String country= "bangladesh";
        System.out.println(country.contains("l"));

      /*  boolean isPresent= false;
        for (int i=0; i< country.length(); i++) {
            if (country.charAt(i) == 'l' ) {
                isPresent = true;
            }

        } */

        System.out.println(country.indexOf('a'));
        int count=0;
        for (int i=0; i< country.length(); i++){
            if (country.charAt(i)== 'a'){
                count++;
            }
        }
        System.out.println(count);



    }
}
