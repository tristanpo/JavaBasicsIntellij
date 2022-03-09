package class17;

import java.sql.SQLOutput;

public class StringReversal {

    public static void main(String[] args) {
String s="Sunday is great";
StringReversal task=new StringReversal();

String [] strArray=s.split(" ");

for (int i=0; i<strArray.length;i++){

    System.out.print(task.reverseString(strArray[i])+" ");
}


    }
    String reverseString(String inputString){

        StringBuilder stringBuilder=new StringBuilder(inputString);
        stringBuilder.reverse();
        return stringBuilder.toString();
        //First we write a stringbuilder class to reverse the string then write a foreloop
    }
}
