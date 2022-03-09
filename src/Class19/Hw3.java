package Class19;

public class Hw3 {
    private String name;
    private String address;

    Hw3(String name, String address){
        this.name=name;
        this.address=address;
    }
    void displayInfo(){
        System.out.println("Student name is "+name+" and his address " +
                "is "+address);
    }
}
