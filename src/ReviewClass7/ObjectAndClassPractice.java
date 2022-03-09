package ReviewClass7;

public class ObjectAndClassPractice {
    String empName="Tarik";
    int empID=12345;
    String group;
    void employeeDetails(){
        System.out.println("This method shows the details of the employee");
    }
    void employeeGroup(){
        System.out.println("This method shows the group of the employee");
    }

    public static void main(String[] args) {
        ObjectAndClassPractice obj=new ObjectAndClassPractice();
        obj.employeeGroup();
        obj.employeeDetails();
    }
}
