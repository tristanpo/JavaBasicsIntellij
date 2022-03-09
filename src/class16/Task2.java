package class16;

public class Task2 {
    public static void main(String[] args) {
       //Create a string that should contain a combination of letters and special characters
        //Find out how many alphanumeric characters are in that string
        String s="1234!@#$%esdFAZSX123";
        System.out.println(s.length());
        System.out.println(s.replaceAll("[^A-Za-z0-9@#]", "").length());

    }
}
