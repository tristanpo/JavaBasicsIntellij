package class16;

import java.util.Arrays;

public class Task4EXTRA {
    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder("Sunday is great");
        System.out.println(stringBuilder.reverse());

        String s="Sunday";
        StringBuilder str=new StringBuilder(s);
        str.reverse();
        s=str.toString();
        System.out.println(s);

        String newStr="";
        String s2=stringBuilder.toString();
        String [] strArr=s2.split(" ");
        System.out.println(Arrays.toString(strArr));



    }
}
