package com.codecool.thao.zoo.animal;

import com.codecool.thao.zoo.Food;

public abstract class Animal {
    protected String name;
    protected int weight;
    protected int weightLimit;
    protected boolean alive = true;

    public Animal(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public boolean isAlive() {
        return alive;
    }

    public void checkWeight() {
        if (this.weight == 0 || this.weight >= this.weightLimit) {
            die();
        }
    }

    private void die() {
        this.alive = false;
        System.out.println(name + " died!");
    }

    public void eatFood(Food food) {
        if (food.equals(Food.MEAT)) {
            eatMeat();
        } else if (food.equals(Food.VEGGIE)) {
            eatVeggie();
        } else if (food.equals(Food.FRUIT)) {
            eatFruit();
        }
    }

    public abstract void eatMeat();
    public abstract void eatVeggie();
    public abstract void eatFruit();

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", alive=" + alive +
                '}';
    }
}
