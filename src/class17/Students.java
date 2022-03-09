package class17;

public class Students {
    String name;
    int ID;
    static int noOfStudents=3;

    public static void main(String[] args) {
        Students student=new Students();
        student.name="Tristan";
        student.ID=123;
        Students.noOfStudents=3;

        Students student2=new Students();
        student2.name="Dmitriy";
        student2.ID=456;
        Students.noOfStudents=3;

        Students student3=new Students();
        student3.name="Lily";
        student3.ID=789;
        Students.noOfStudents=3;

        System.out.println("Number of students = "+noOfStudents);



    }
}
