package com.syntax.Class28;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HW3 {
    public static void main(String[] args) {
        Set<String> countries=new TreeSet<>();
        countries.add("USA");
        countries.add("Italy");
        countries.add("Russia");
        countries.add("Germany");

        Iterator it= countries.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        for(String c:countries){
            System.out.println(c);
        }
    }
}
