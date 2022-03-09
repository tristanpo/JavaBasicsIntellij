package Class19;

public class Horse {
    private String name;
    private int age;
    private double weight;
    //purpsoe of construcotr is to give initial values to the fields
    Horse(String horseName,int horseAge,double horseWeight){
        name=horseName;
        age=horseAge;
        weight=horseWeight;
    }
    //Constructors don't have return types like int,
    //String not even void
    //name of constructor should be the same as name of the class
    void printHorseName(){
        System.out.println("Name "+name);
    }
    void setName(String horseName){
        name=horseName;
    }
    //no argument/zero argument constructor
    //Horse(){}
    /*
    write some important lines of code that you want to execute
    when the object of a class is created for example
    you might want to fetch some info from internet or from your
    hard disk to give initial values to the fields
     */
}
