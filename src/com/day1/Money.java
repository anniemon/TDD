package com.day1;

interface Expression {}
class Money implements  Expression {
    protected int amount;

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && currency().equals(money.currency());
    }

    protected String currency;
    String currency() {
        return currency;
    }

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }
    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }
    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    public String toString() {
        return amount + " " + currency;
    }

    Expression plus(Money addend) {
        return new Money(amount + addend.amount, currency);
    }
}

class Bank {
    Money reduce(Expression source, String to) {
        return Money.dollar((10));
    }
}
