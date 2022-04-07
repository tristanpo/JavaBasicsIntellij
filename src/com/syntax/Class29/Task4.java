package com.syntax.Class29;

import java.util.HashSet;
import java.util.Set;

public class Task4 {
    public static void main(String[] args) {
        Set<Student> students=new HashSet<>();
        students.add(new Student("Maha","123"));
        students.add(new Student("Habib","12345"));
        students.add(new Student("Asel","123456"));

        for (Student s:students){
            s.printName();
        }
    }
}

class Student{
    String name;
    String studentId;
    Student (String name, String studentId){
        this.name=name;
        this.studentId=studentId;
    }
    void printName(){
        System.out.println(name);
    }
}