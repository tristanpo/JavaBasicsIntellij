package com.syntax.Class31;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<String,String> students=new Hashtable<>();
        students.put("1","Moreed");
        students.put("2","Emilia");
        students.put("3","Medine");
        students.put("4","Yazgul");
        students.put("5","Guldan");

        Set<Map.Entry<String,String>> entrySet=students.entrySet();
        for (Map.Entry<String,String> entry:entrySet){
            System.out.println(entry);
        }
    }
}
