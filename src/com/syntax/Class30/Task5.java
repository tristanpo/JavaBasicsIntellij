package com.syntax.Class30;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Task5 {
    public static void main(String[] args) {
        LinkedHashSet<String> set=new LinkedHashSet<>();
        set.add("Am I ");
        set.add("doing this ");
        set.add("right?");
        Iterator<String> iterator=set.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next());
        }


        }

    }

