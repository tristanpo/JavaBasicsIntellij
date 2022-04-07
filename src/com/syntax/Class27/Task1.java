package com.syntax.Class27;

public class Task1 {
    /*
    Create on Interface 'Shape' with undefined methods as calculateArea and calculatePerimeter. Create 2
    classes Circle and square that implements functionality defined in the Shape interface. Test your code.
     */
    public static void main(String[] args) {
        Square square=new Square();
        square.calculatePerimeter(10);
        //((Square)shape).test();

    }
}
interface Shape{
    void calculateArea(double input);
    void calculatePerimeter(double input);
}
class Circle implements Shape{
    @Override
    public void calculateArea(double input) {
        double area=Math.PI*Math.pow(input,2);
        System.out.println(area);
    }

    @Override
    public void calculatePerimeter(double input) {
        System.out.println(2*Math.PI*input);
    }
}

class Square implements Shape{
    @Override
    public void calculateArea(double input) {
        double area=input*input;
        System.out.println(area);
    }

    @Override
    public void calculatePerimeter(double input) {
    double perimeter=4*input;
    }
}
