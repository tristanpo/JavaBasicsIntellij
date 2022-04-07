package com.syntax.Class27;

import java.util.ArrayList;

public class InClassTask {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Tristan");
        names.add("Dmitriy");
        names.add("Maha");
        System.out.println(names.contains("Tristan"));
        System.out.println(names.isEmpty());
        System.out.println(names.size());
        System.out.println(names);

    }
}
