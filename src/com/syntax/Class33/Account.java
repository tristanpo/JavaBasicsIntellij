package com.syntax.Class33;

public class Account {
    double balance;

    public void setBalance(double balance) throws InsufficientBalance {
        if(balance<=0){
            throw new InsufficientBalance("can't set negative balance");

        }else {
            this.balance=balance;
        }
    }
}

