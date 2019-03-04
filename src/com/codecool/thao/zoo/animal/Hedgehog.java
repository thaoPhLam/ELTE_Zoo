package com.codecool.thao.zoo.animal;

public class Hedgehog extends Animal {
    public Hedgehog(String name, int weight) {
        super(name, weight);
        this.weightLimit = 5;
    }

    @Override
    public void eatMeat() {
        this.weight -= 1;
    }

    @Override
    public void eatVeggie() {

    }

    @Override
    public void eatFruit() {
        this.weight += 2;
    }
}
