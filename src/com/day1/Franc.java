package com.day1;

public class Franc extends Money{
    Money times(int multiplier){
        return new Franc(amount * multiplier);
    }
    Franc(int amount) {
        this.amount = amount;
    }
}
