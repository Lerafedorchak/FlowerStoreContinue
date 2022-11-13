package com.example.demo.flower.store;

import com.example.demo.items.Item;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Setter
@Getter
@Entity
@Table(name = "flower")
@NoArgsConstructor
public class Flower extends Item {
    @Id
    @GeneratedValue
    private double sepalLength;
    @Enumerated(EnumType.STRING)
    private FlowerColor color;
    private double price;
    @Enumerated(EnumType.STRING)
    private FlowerType flowerType;

    public String getColor() {
        return color.toString();
    }
    @Override
    public double getPrice() {
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
}
