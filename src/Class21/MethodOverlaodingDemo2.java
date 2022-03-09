package Class21;

public class MethodOverlaodingDemo2 {

     void printInfo(String name, int age, double weight){
         System.out.println("M1");
        System.out.println(name+" "+age+" "+weight);
    }
    void printInfo(int age,String name,double weight) {
        System.out.println("M2");
        System.out.println(name + " " + age + " " + weight);
    }
    void printInfo(int age,double weight,String name) {
        System.out.println("M3");
        System.out.println(name + " " + age + " " + weight);
    }
    void printInfo(double weight,int age,String name) {
        System.out.println("M4");
        System.out.println(name + " " + age + " " + weight);
    }

    public static void main(String[] args) {
        MethodOverlaodingDemo2 methodOverlaodingDemo=new MethodOverlaodingDemo2();
        methodOverlaodingDemo.printInfo("Zulfiya",16,28);
    }
}
