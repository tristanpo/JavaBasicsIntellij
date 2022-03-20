package ReviewClass8;

public class Class1 {
    public void printSmallerDigit(int x,int y){
        if(x<y){
            System.out.println(x+" is smaller one");
        }else if(y<x){
            System.out.println(y+" is smaller one");
        }else{
            System.out.println("Both values are equal");
        }
    }

    public static void main(String[] args) {
        Class1 obj=new Class1();
        obj.printSmallerDigit(3,5);
        obj.printSmallerDigit(5,8);
    }
}
