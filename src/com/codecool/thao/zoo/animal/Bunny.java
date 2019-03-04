package com.codecool.thao.zoo.animal;

public class Bunny extends Animal {
    public Bunny(String name, int weight) {
        super(name, weight);
        this.weightLimit = 4;
    }

    @Override
    public void eatMeat() {
        this.weight -= 1;
    }

    @Override
    public void eatVeggie() {
        this.weight += 2;
    }

    @Override
    public void eatFruit() {
        this.weight += 1;
    }
}
