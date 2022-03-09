package Class19;

public class Hw1 {
    String constName;
    String typeofAccess;
    String restrictionLevel;
    private Hw1(){
        System.out.println("I am a private access constructor and I am the most restricted");
    }
    public Hw1(String constName){
        this.constName=constName;
        System.out.println("I am public access constructor");
    }
    Hw1(String constName, String typeofAccess){
        this.constName=constName;
        this.typeofAccess=typeofAccess;
        System.out.println("I am default access constructor");
    }
    protected Hw1(String constName,String typeofAccess,String restrictionLevel){
        this.constName=constName;
        this.typeofAccess=typeofAccess;
        this.restrictionLevel=restrictionLevel;
        System.out.println("I am protected access constructor");
    }

    public static void main(String[] args) {
        new Hw1();
        new Hw1("Hw1");
        new Hw1("Hw1","default");
        new Hw1("Hw1","protected"+"protected between packages");
    }
}


