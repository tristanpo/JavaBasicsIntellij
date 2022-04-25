package com.syntax.Class33;

import java.util.ArrayList;
import java.util.List;

public class HW1 {
    public static void main(String[] args) {
        listOfExceptions();
    }
public static void listOfExceptions(){
    List<Exception> list=new ArrayList<>();

    try{
        Exception obj1=new ArithmeticException();
        list.add(obj1);
    }
    catch(ArithmeticException e1){
      e1.printStackTrace();
    }

    try{
        Exception obj2=new NullPointerException();
        list.add(obj2);

    }
    catch(NullPointerException e2){
        e2.printStackTrace();
    }

    try{
        Exception obj3=new ArrayIndexOutOfBoundsException();
        list.add(obj3);
    }
    catch(ArrayIndexOutOfBoundsException e3){
        e3.printStackTrace();
    }

    try{
        Exception obj4=new NegativeArraySizeException();
        list.add(obj4);
    }
    catch(NegativeArraySizeException e4){
        e4.printStackTrace();
    }
    for(Exception element:list){
        System.out.println(element);
    }

}
}
