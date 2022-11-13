package com.example.demo.items;

public class PaperDecorator extends ItemDecorator {
    private Item item;

    @Override
    public double getPrice() {
        return 13 + item.getPrice();
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }
}
