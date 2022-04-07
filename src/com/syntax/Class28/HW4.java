package com.syntax.Class28;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class HW4 {
    public static void main(String[] args) {
        LinkedHashSet<String> cities=new LinkedHashSet<>();
        cities.add("Highlands Ranch");
        cities.add("Littleton");
        cities.add("Aspen");
        cities.add("Colorado Springs");
        cities.add("Fort Collins");
        cities.add("Castle Rock");

        Iterator<String> iterator=cities.iterator();
        while(iterator.hasNext()){
            if(iterator.next().startsWith("A")) {
                iterator.remove();
            }
        }
        System.out.println(cities);
    }
}
