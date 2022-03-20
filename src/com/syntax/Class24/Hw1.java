package com.syntax.Class24;
class Computer{
    void bootUp(){
        System.out.println("Computer is booting up");
    }
    void signIn(){
        System.out.println("Signing in");
    }
}
class Apple extends Computer{
    @Override
    void bootUp() {
        System.out.println("Apple Computer is booting up");
    }

    @Override
    void signIn() {
        System.out.println("Signing in to Apple");
    }
    void iMusic(){
        System.out.println("Open iMusic");
    }
}
class Lenovo extends Computer{
    @Override
    void bootUp() {
        System.out.println("Lenovo Computer is booting up");
    }

    @Override
    void signIn() {
        System.out.println("Signing in to lenovo");
    }
    void lenovoSpec(){
        System.out.println("Open Lenovo specific program");
    }
}
class HP extends Computer{
    @Override
    void bootUp() {
        System.out.println("HP Computer is booting up");
    }

    @Override
    void signIn() {
        System.out.println("Signing in to HP");
    }
}
class Dell extends Computer{
    @Override
    void bootUp() {
        System.out.println("Dell Computer is booting up");
    }

    @Override
    void signIn() {
        System.out.println("Signing in to Dell");
    }
}
public class Hw1 {
    public static void main(String[] args) {
        Computer[] computers={new Apple(),new Lenovo(),new HP(),new Dell() };
        for(Computer c:computers){
          c.bootUp();
          c.signIn();
        }
    }
}
