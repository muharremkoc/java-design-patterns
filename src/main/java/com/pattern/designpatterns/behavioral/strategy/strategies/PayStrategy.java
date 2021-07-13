package com.pattern.designpatterns.behavioral.strategy.strategies;

public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
