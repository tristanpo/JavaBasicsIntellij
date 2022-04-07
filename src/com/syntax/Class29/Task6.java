package com.syntax.Class29;

import java.util.ArrayList;

import java.util.Iterator;
;

public class Task6 {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(5);
        nums.add(14);
        nums.add(9);
        nums.add(5);
        int sum=0;
        for(Integer i: nums){
            sum +=i;

        }
        System.out.println(sum);


    }
}