package com.example.demo.items;

public class BasketDecorator extends ItemDecorator {
    private Item item;

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public double getPrice() {
        return 4 + item.getPrice();
    }
}
