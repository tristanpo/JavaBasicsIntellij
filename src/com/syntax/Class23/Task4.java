package com.syntax.Class23;
class Degree{
    void getPrerequisite(){
        System.out.println("To get a degree you need high school diploma");
    }
}
class Bachelors extends Degree{

}
class Masters extends Degree {
    @Override
    void getPrerequisite() {
        System.out.println("To get a Masters you need Bachelors");
    }
}
public class Task4 {
    public static void main(String[] args) {
        Masters master=new Masters();
        master.getPrerequisite();
    }
}
