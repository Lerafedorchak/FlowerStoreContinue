package com.example.demo.items;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlowerBucket extends Item {
    private final List<Item> bucket = new ArrayList<>();

    public boolean searchFlower(Item flower) {
        return bucket.contains(flower);
    }

    public void addFlowers(Item[] flowers) {
        bucket.addAll(Arrays.asList(flowers));
    }

    @Override
    public double getPrice() {
        double price = 0;
        for (Item flower : bucket) {
            price += flower.getPrice();
        }
        return price;
    }
}
