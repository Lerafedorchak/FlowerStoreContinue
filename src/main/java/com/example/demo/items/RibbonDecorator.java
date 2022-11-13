package com.example.demo.items;

public class RibbonDecorator extends ItemDecorator {
    private Item item;

    @Override
    public double getPrice() {
        return 40 + item.getPrice();
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }
}
