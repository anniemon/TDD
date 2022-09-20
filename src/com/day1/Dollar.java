package com.day1;

public class Dollar extends Money {
    Money times(int multiplier){
        return Money.dollar(amount * multiplier);
    }
    Dollar(int amount, String currency) {
        super(amount, currency);
    }
}
