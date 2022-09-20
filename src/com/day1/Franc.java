package com.day1;

public class Franc extends Money{
    Money times(int multiplier){
        return Money.franc(amount*multiplier);
    }
    Franc(int amount, String currency) {
        super(amount, currency);
    }
}
