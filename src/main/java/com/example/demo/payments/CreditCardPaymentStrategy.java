package com.example.demo.payments;

public class CreditCardPaymentStrategy implements Payment {
    @Override
    public void pay(double price) {
        System.out.println("You payed " + toString(price)  + "$ with Credit Card!");
    }


    public String toString(double elem) {
        return String.valueOf(elem);
    }
}
