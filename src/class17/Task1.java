package class17;

import class16.Task;

public class Task1 {
    String name;
    String id;
    static int numberOfStudents;

    public static void main(String[] args) {
        Task1 student1=new Task1();
        student1.name="Yazgul";
        student1.id="123";
        Task1.numberOfStudents++;

        Task1 student2=new Task1();
        student2.name="Tristan";
        student2.id="456";
        Task1.numberOfStudents++;

        System.out.println(Task1.numberOfStudents);
    }
}
