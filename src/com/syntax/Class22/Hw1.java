package com.syntax.Class22;

import java.sql.SQLOutput;

public class Hw1 {
    public static void areaRectangle(int length,int width){
        int area;
        area=length*width;
        System.out.println("The area of the rectangle is = "+area);
    }
    public static void areaSquare(int length,int width){
        int area;
        area=length*width;
        System.out.println("The area of the square is = "+area);
    }
    public static void volumeBox(int length,int width,int height){
        int volume;
        volume=length*width*height;
        System.out.println("The volume of the box is = "+volume);
    }
    public static void main(String[] args) {
        areaRectangle(5,10);
        areaSquare(5,5);
        volumeBox(5,5,5);
    }
}
