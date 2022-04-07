package com.syntax.Class28;

import java.util.Iterator;
import java.util.LinkedList;

abstract class Card {
    String cardType;

    abstract String cardType(String cardType);

    public String cardRewards() {
        return cardType + " is a rewards card";
    }

    public Card(String cardType) {
        this.cardType = cardType;
    }
}
    class Card1 extends Card{
        @Override
        String cardType(String cardType) {
            return"This is a "+cardType;
        }
        public Card1(String cardType){
            super(cardType);
        }
        class Card2 extends Card{
            @Override
            String cardType(String cardType) {
                return "This is a "+cardType;
            }
            public Card2(String cardType){
                super(cardType);
            }
        }
        class Card3 extends Card{
            @Override
            String cardType(String cardType) {
                return"This is a "+cardType;
            }
            public Card3(String cardType){
                super(cardType);
            }
        }
    }

public class HW2 {
    public static void main(String[] args) {
        Card1 card1=new Card1("Master Card");
        Card1 card2=new Card1("Visa Card");
        Card1 card3=new Card1("Discovery Card");

        LinkedList<String> cards=new LinkedList<>();
        cards.add(card1.cardType);
        cards.add(card1.cardRewards());
        cards.add(card2.cardType);
        cards.add(card2.cardRewards());
        cards.add(card3.cardType);
        cards.add(card3.cardRewards());

        for(int i=0; i<cards.size();i++){
            System.out.println(cards.get(i));
        }
        for(String c:cards){
            System.out.println(c);
        }
        Iterator iterator=cards.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
