package com.example.demo.delivery;

import com.example.demo.items.Item;

import java.util.List;

public class PostDeliveryStrategy implements Delivery {
    @Override
    public void deliver(List<Item> items) {
        // post
    }
}
