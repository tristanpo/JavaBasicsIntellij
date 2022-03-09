package class17;

public class palindromeOrNot {
    public static void main(String[] args) {
        //how would you chck if a string is a palindrome or not?
        //example1: aba---> true aba
        //example2: abbc----> false cbba
        palindromeOrNot task=new palindromeOrNot();
        System.out.println(task.isPalindrome("aba"));
        System.out.println(task.isPalindrome("Abbc"));


    }
    boolean isPalindrome(String inputStr){
        String reversedStr=reverseString(inputStr);
        return reversedStr.equals(inputStr);
    }
    String reverseString(String inputString){

        StringBuilder stringBuilder=new StringBuilder(inputString);
        stringBuilder.reverse();
        return stringBuilder.toString();

    }
}
