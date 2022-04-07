package ReviewClass9;

public class Doctor {

  /*  // instance variables - declared inside the class but outside of any method,
// constructor or block
    String firstName, lastName, speciality;

    // static variable - declared inside the class but outside of any method,
// constructor or block
// using static keyword
    static String hospital = “Jorge Washington”;

    // Costructor - initializing instance variables
    Doctor(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;
    }

    // We can have multiple constructor by overloading them
    Doctor(String firstName, String lastName, String speciality) {

        this(firstName, lastName);
        this.speciality = speciality;
    }

    //non static methods can access static and non static members
    void printInfo() {
        this.hello();//we do not need to put this (compiler adds it)
        System.out.println(“Doctor ” + firstName + ” ” + lastName + ” is a ” + speciality+” at “+hospital);
    }

    // static methods can access only static members
    static void work() {
        System.out.println(“All doctors work at ” + hospital);
    }

    void hello() {
        System.out.println(“Hello”);
    }

    /*
     * static method cannot access non static members
     *
     * static void printInfo() {
     * System.out.println(“Doctor “+firstName+” “+lastName+ ” is a “+speciality); }
     */

}

