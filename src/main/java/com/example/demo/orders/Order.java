package com.example.demo.orders;

import com.example.demo.delivery.Delivery;
import com.example.demo.items.Item;
import com.example.demo.payments.Payment;

import java.util.LinkedList;

public class Order {
    private LinkedList<Item> items ;
    private Payment payment;
    private Delivery delivery;

    public void setPaymentStrategy(Payment payment) {
        this.payment = payment;
        System.out.printf("Payment was done with " + payment.getClass().getSimpleName());
    }

    public void getDeliveryStrategy(Delivery delivery) {
        this.delivery = delivery;
        System.out.printf("Your items were delivered by  " + delivery.getClass().getSimpleName());
    }

    public double calculateTotalPrice(){
        double totalPrice = 0;
        for (Item item: items){
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }
}
