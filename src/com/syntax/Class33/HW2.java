package com.syntax.Class33;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        try{
            ageException(13);
        }catch(RuntimeException e){
            e.printStackTrace();
        }
    }
    public static void ageException(int age) throws RuntimeException{
        if(age<16){
            throw new RuntimeException("You are not old enough");
        }else{
            System.out.println("You are old enough");
        }



    }
}
