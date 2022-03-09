package Class21;

public class SuperKeywordDemo {
    public static void main(String[] args) {
        Child child=new Child();
        child.printColor();
    }
}
class GrandParent{
    String color="Blue";
    void printInfo(){
        System.out.println("I am grandparent");
    }
}
class Parent{
    String color="Black";
    void printInfo(){
        System.out.println("I am parent");
    }
}
class Child extends Parent{
    String color="Red";
    void printInfo(){
        System.out.println("I am child");
    }

    void print(){
        printInfo();
        super.printInfo();
    }
    void printColor(){
        String color="Green";
        //refers to local variable
        System.out.println(color);
        //refers to instance variable
        System.out.println(this.color);
        //refers to parent variable
        System.out.println(super.color);
    }
}