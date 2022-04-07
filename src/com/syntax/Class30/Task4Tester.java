package com.syntax.Class30;

import java.util.Map;
import java.util.TreeMap;

public class Task4Tester {
    public static void main(String[] args) {
        TreeMap<String,Person> personTreeMap=new TreeMap<>();
        personTreeMap.put("a",new Person("Safiul","Alam",42,150000));
        personTreeMap.put("b",new Person("Guldan","A",16,140000));
        personTreeMap.put("c",new Person("Mr","A",22,170000));
        personTreeMap.put("d",new Person("Nassir","Ariyam",27,180000));

        for(Map.Entry<String,Person> p:personTreeMap.entrySet()){
            System.out.println(p);
        }

    }
}
