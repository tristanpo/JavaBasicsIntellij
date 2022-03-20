package com.syntax.Class22;

public class Programming {
    Programming(){
        System.out.println("I love programming languages");

    }
    Programming(String s){
        System.out.println("I love"+s);
    }
    public static void main(String[] args) {
        new Programming();
        new Programming("Java");
    }
}
