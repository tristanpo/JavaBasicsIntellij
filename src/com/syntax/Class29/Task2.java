package com.syntax.Class29;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        //ArrayList allows duplicates
        List<String> arrayList=new ArrayList<>();

        arrayList.add("John");
        arrayList.add("Jane");
        arrayList.add("James");
        arrayList.add("Jasmine");
        arrayList.add("Jane");
        arrayList.add("James");
        LinkedHashSet linkedHashSet=new LinkedHashSet(arrayList);
        arrayList.clear();
        arrayList.addAll(linkedHashSet);
        System.out.println(arrayList);
//to remove duplicates we can convert ArrayList to HashSet(doesn't allow duplicate values)
        //  HashSet<String> s=new HashSet<>(arrayList);
        // System.out.println(s);
    }
}


