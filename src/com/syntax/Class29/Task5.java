package com.syntax.Class29;

import java.util.LinkedList;

public class Task5 {
    public static void main(String[] args) {
        LinkedList<Card> cards=new LinkedList<>();
        cards.add(new MasterCard("Debit"));
        cards.add(new Visa("Credit"));
        for(Card c:cards){
            c.calculateInterest();
        }
    }

}
abstract class Card{
    String cardType;
    Card(String cardType){
        this.cardType=cardType;
    }
    abstract void calculateInterest();
    void print(){
        System.out.println(cardType);
    }
}
class MasterCard extends Card{
    MasterCard(String cardType) {
        super(cardType);
    }

    @Override
    void calculateInterest() {
        System.out.println("interest is 15%");
    }
}
class Visa extends Card{

    Visa(String cardType) {
        super(cardType);
    }

    @Override
    void calculateInterest() {
        System.out.println("interest is 10%");
    }
}