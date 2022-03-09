package ReviewClass7;

public class Practice3 {

    String studentName;
    String course;
    int studentId;
    int grades;

    void displayStudentRecord(){
        System.out.println("The studet name is: "+ studentName+" and the course student enrolled for is "+ course);
        System.out.println("The student id is:" +studentId+ " and the grades student achieved are "+ grades);
    }

    public static void main(String[] args) {

        Practice3 p1= new Practice3();
        p1.studentName="Rogo";
        p1.course="SDET";
        p1.studentId=123;
        p1.grades=65;
        p1.displayStudentRecord();

        System.out.println("----------------------------------------------------");

        //creatig the second object of calss to assign second set of values
        Practice3 p2= new Practice3();
        p2.studentName="yazina";
        p2.course="science";
        p2.studentId=456;
        p2.grades=91;

        p2.displayStudentRecord();
    }
}
