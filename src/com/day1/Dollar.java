package com.day1;

public class Dollar extends Money {
    Money times(int multiplier){
        return new Dollar(amount * multiplier);
    }
    Dollar(int amount) {
        this.amount = amount;
    }


}
