package com.syntax.Class28;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        for (int i = 2; i <= 500; i += 2) {
            number.add(i);
        }

        number.removeIf(integer -> integer % 5 == 0);
        System.out.println(number);
    /*Iterator<Integer> iterator= number.iterator();
    while (iterator.hasNext()){
        if(iterator.next()%5==0){
            iterator.remove();
        }
    }*/
    }
}
