package com.syntax.class25;

public interface Human {
    //public static final redundant because by defualt all the variables are
    //public static final
    //public static final int legs=2;
    int legs=2;
   // public abstract void walk();
    void walk();
    static void printLegs(){
        System.out.println(legs);
    }
    public default void noNeedToWorry(){
        System.out.println("default method are there to functional programming");
    }
}
interface LivingBeing{
    static void printLegs(){
        System.out.println("Not sure");
    }
}
class Maha implements Human,LivingBeing {

    @Override
    public void walk() {
        System.out.println("I can walk");
    }
}

