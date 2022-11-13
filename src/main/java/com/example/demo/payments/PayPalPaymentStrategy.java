package com.example.demo.payments;

public class PayPalPaymentStrategy implements Payment {
    @Override
    public void pay(double price) {
        System.out.println("You payed " + toString(price)  + "$ with PayPal!");
    }

    private String toString(double price) {
        return String.valueOf(price);
    }
}
