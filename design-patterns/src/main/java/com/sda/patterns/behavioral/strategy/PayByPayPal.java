package com.sda.patterns.behavioral.strategy;

public class PayByPayPal implements PayStrategy {

    @Override
    public boolean pay(int paymentAmount) {
        return false;
    }

    @Override
    public void collectPaymentDetails() {

    }
}
