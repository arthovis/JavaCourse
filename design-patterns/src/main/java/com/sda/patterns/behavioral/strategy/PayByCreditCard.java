package com.sda.patterns.behavioral.strategy;

public class PayByCreditCard implements PayStrategy {
    @Override
    public boolean pay(int paymentAmount) {
        return false;
    }

    @Override
    public void collectPaymentDetails() {

    }
}
