package com.syntax.Class22;

public class Hw2 {
    static void method(String name, int age, double weight){
        System.out.println(name+" "+age+" "+weight);
    }
    static void method(String name, double weight,int age){
        System.out.println(name+" "+age+" "+weight);
    }
    static void method(double weight,int age,String name){
        System.out.println(name+" "+age+" "+weight);
    }
    public static void main(String[] args) {
        method(12.2,12,"Poseley");
        method("Tristan",21,91.1);
        method("David",34.5,45);
    }
}
