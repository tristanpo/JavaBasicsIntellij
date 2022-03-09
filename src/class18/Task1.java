package class18;

public class Task1 {
    //create a method that will accept an array as parameters
    //and will return sum of all elements from that array
    //Method should be visible within same package and
    //accessible by creating an instance of the class

    int sumArray(int [] array){
        int sum=0;
        for(int num:array){
            sum+=num;
        }
        return sum;
    }


    }

