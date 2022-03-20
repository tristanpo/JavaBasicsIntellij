package com.syntax.Class23;

public class HW1 {
    public static void main(String[] args) {
      new Student().Learning();
      new SyntaxStudent().Learning();
      new CollegeStudent().Learning();
      new SchoolStudent().Learning();
      new SyntaxStudent().Replit();
      new CollegeStudent().behav();
      new Student().behav();
    }
    }
    class Student{
        void behav(){
            System.out.println("it is time for homework");
        }
        void Learning(){
            System.out.println("I am learning");
        }
    }

class SyntaxStudent extends Student{
    void behav(){
        System.out.println("it is time for java homework");
    }
    void Learning(){
        System.out.println("I am learning java");
    }
    void Replit(){
        System.out.println("I have to do replits");
    }
}
class CollegeStudent extends Student {
    void behav() {
        System.out.println("it is time for college homework");
    }

    void Learning() {
        System.out.println("I am learning college");
    }
}
    class SchoolStudent extends Student {
        void behav() {
            System.out.println("it is time for math homework");
        }
        void Learning(){
            System.out.println("I am learning math");
        }
    }


