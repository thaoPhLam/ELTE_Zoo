package com.codecool.thao.zoo.animal;

public class Bear extends Animal {
    public Bear(String name, int weight) {
        super(name, weight);
        this.weightLimit = 10;
    }

    @Override
    public void eatMeat() {
        this.weight += 1;
    }

    @Override
    public void eatVeggie() {
        this.weight -= 1;
    }

    @Override
    public void eatFruit() {
        this.weight += 1;
    }
}
