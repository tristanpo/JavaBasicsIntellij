package com.syntax.Class26;

public class ShoppingCartTester {
    public static void main(String[] args) {
        ShoppingCart shoppingCart=new ShoppingCart();
        //shoppingCart.originalPrice=100;
        shoppingCart.setDiscount(.10);
        shoppingCart.calculatePrice();
    }
}
