package com.syntax.Class28;

import java.util.ArrayList;
import java.util.Iterator;
abstract class Insurance{
    String insuranceName;
    abstract String getQuote();
    abstract String cancelInsurance();

}
class Car extends Insurance {
    String carModel;

    public Car(String carModel) {
        this.carModel = carModel;
    }

    @Override
    String getQuote() {
        return "get quote method inside car class";
    }

    @Override
    String cancelInsurance() {
        return "cancel insurance method inside car class";
    }
}
    class Pet extends Insurance{
        String petType;
        public Pet(String petType){
            this.petType=petType;
        }

        @Override
        String getQuote() {
            return"get quote method inside Pet class";
        }

        @Override
        String cancelInsurance() {
            return"cancel insurance method inside Pet class";
        }
    }
class Health extends Insurance{
    @Override
    String getQuote() {
        return"get quote method inside health class";
    }

    @Override
    String cancelInsurance() {
        return"cancel insurance method inside health class";
    }
}
public class HW1 {
    public static void main(String[] args) {
    Car car =new Car("BMW");
    Pet pet=new Pet("Dog");
    Health health=new Health();

    ArrayList<String> classes=new ArrayList<>();
    classes.add(car.getQuote());
    classes.add(car.cancelInsurance());
    classes.add(pet.getQuote());
    classes.add(pet.cancelInsurance());
    classes.add(health.getQuote());
    classes.add(health.cancelInsurance());

    for(int i=0; i< classes.size();i++){
        System.out.println(classes.get(i));
    }
    for(String c:classes){
        System.out.println(c);
    }
    Iterator it=classes.iterator();
    while(it.hasNext()){
        System.out.println(it.next());
    }

    }

}


