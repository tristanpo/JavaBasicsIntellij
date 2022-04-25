package com.syntax.Class33;

public class HW3 {
    public static void main(String[] args) {
        try{
            UserNameExc("Tris");
        }
        catch (RuntimeException e){
            e.printStackTrace();
        }
    }
    public static void UserNameExc(String userName) throws RuntimeException{
        if(userName.length()<5){
            throw new RuntimeException("Username is not long enough");
        }

    }
}
