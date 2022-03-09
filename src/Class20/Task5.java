package Class20;

public class Task5 {
    /*
    Write a student class that have instance variables name and address.
    create a constructor that will initialize those variables.
    Print name and address of given  student using displayInfo method
     */
    String name;
    String address;

    public Task5(String name, String address) {
        this.name = name;
        this.address = address;
    }
    void displayInfo(){
        System.out.println(this.name+" "+this.address);
    }
}
