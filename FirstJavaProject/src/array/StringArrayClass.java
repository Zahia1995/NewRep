package array;

public class StringArrayClass {

    public static void main(String[] args) {
        String[] countries = new String[5];
        String[] names = {"Zahia", "Asma", "ait"};
        String name = "Asma";
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name)) {
                System.out.println(names[i]);
            }

        }
    }
}
