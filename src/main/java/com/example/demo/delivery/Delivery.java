package com.example.demo.delivery;
import com.example.demo.items.Item;
import java.util.List;

public interface Delivery {
    void deliver(List<Item> items);
}