package com.syntax.Class31;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        HashMap<String,Integer> employee=new HashMap<>();
        employee.put("Samina",150000);
        employee.put("Sayed",154000);
        employee.put("Nazgul",160000);
        employee.put("Mujeeb",170000);
        //declare a variable that holds the name of the employee  who holds the max:
        String name=null;
        Integer salary=0;

        for(Map.Entry<String,Integer> entry:employee.entrySet()){
            if(entry.getValue()>salary){
                salary=entry.getValue();
                name=entry.getKey();
            }
        }
        System.out.println(name+" = $"+salary);
    }
}

