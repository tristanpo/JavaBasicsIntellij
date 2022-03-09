package Class20;

public class MathTeacher extends Teacher2 {
    boolean canTeachTrig=true;
    void teachCalculus(){
        System.out.println("Teaching calculus");
    }

    public static void main(String[] args) {
        MathTeacher teacher=new MathTeacher();
        teacher.name="teyfur";
    }
}
