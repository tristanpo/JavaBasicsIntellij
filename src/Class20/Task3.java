package Class20;

import class16.Task;

public class Task3 {
    /*
    Write a java class that have 4 constructors with 4 different access leveles
    of constructors(private,public,default,protected) and create 4
    objects of the class: 1 - inside the same calss; 2 - from outside the class;
    3 - from different class inside different package and observe result
     */
    private Task3() {
        System.out.println("private");
    }

    Task3(double a) {
        System.out.println("Default");
    }

    protected Task3(String a) {
        System.out.println("protected");
    }

    public Task3(boolean a) {
        System.out.println("public");
    }

    public static void main(String[] args) {
        new Task3();
        new Task3("Haha");
        new Task3(10.2);
        new Task3(false);
    }
}