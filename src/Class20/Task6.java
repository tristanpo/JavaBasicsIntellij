package Class20;

public class Task6 {
    /*
    Write a Book class that will have instance variables and 2 constructors.
    while creating an object make sure:
    instance variables are being initialized
    both constructors are being execute
     */
    String bookName;
    double price;

    public Task6(){
        System.out.println("No argument constructor");
    }
  public Task6(String bookName,double price) {
        this();
        this.bookName=bookName;
        this.price=price;
      System.out.println("two argument constructor");
  }
}
