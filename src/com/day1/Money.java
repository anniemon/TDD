package com.day1;

class Money {
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
        return new Dollar(amount, "USD");
    }
    static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }

    Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    public String toString() {
        return amount + " " + currency;
    }
}
