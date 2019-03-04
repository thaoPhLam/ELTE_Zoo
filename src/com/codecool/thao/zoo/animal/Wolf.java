package com.codecool.thao.zoo.animal;

public class Wolf extends Animal {
    public Wolf(String name, int weight) {
        super(name, weight);
        this.weightLimit = 6;
    }

    @Override
    public void eatMeat() {
        this.weight += 3;
    }

    @Override
    public void eatVeggie() {
        this.weight -= 1;
    }

    @Override
    public void eatFruit() {
        this.weight -= 1;
    }
}
