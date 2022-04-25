package com.syntax.Class33;

import com.syntax.Class23.Dog;

public class NullPointerDemo {
    public static void main(String[] args) {
        String str=null;
        //we get the null-pointer exception when a method is called on an object which is not
        //initialized
        //str.length();
        Dog dog=null;
        //dog.toString();
        int [] arr=new int[-5];
    }
}
