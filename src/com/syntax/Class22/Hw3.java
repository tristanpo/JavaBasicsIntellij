package com.syntax.Class22;

public class Hw3 {
    private void method1(String name, int age, double weight){
        System.out.println(name+" "+age+" "+weight);
    }
    private void method1(String name, double weight,int age){
        System.out.println(name+" "+age+" "+weight);
    }
    private void method1(double weight,int age,String name){
        System.out.println(name+" "+age+" "+weight);
    }
    public static void main(String[] args) {
        new Hw3().method1("Tristan",21,91.1);
        new Hw3().method1("Poseley",89.9,32);
        new Hw3().method1(85.5,56,"David");
    }
}
