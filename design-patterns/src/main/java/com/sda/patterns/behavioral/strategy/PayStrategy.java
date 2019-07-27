package com.sda.patterns.behavioral.strategy;

public interface PayStrategy {
    public boolean pay(int paymentAmount);
    public void collectPaymentDetails();
}
