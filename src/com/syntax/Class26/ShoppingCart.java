package com.syntax.Class26;

public class ShoppingCart {
   private double originalPrice;
   private double discount=.15;
void setDiscount(double disvount){
    if(discount>0&&discount<=.15){
        this.discount=discount;
    }else{
        System.out.println("Can't have that much discount");
    }
}
public double getDiscount(){
    return discount;
}
    void calculatePrice(){
        double price=originalPrice-(originalPrice*.15);
        System.out.println(price);
    }
}
