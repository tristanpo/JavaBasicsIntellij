package com.syntax.Class28;

import java.util.HashSet;
import java.util.Set;

class Students{
    String name;
    int studentID;

    public Students(String name, int studentID){
        this.name=name;
        this.studentID=studentID;
    }
}
public class HW5 {
    public static void main(String[] args) {
        Set<Students> students=new HashSet<>();

        students.add(new Students("Tristan",12345));
        students.add(new Students("Dmitriy",23456));
        students.add(new Students("Maha",34567));
        students.add(new Students("Lily",45678));
        students.add(new Students("Moreed",56789));

        for(Students s:students){
            System.out.println("Student name: "+s.name);
        }
    }
}
