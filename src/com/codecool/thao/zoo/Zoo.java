package com.codecool.thao.zoo;

import com.codecool.thao.zoo.animal.Animal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals = new ArrayList<>();

    public void adoptAnimal(Animal animal) {
        animals.add(animal);
    }

    public void feedAnimal(Food food) {
        for (Animal animal : animals) {
            if (animal.isAlive()) {
                animal.eatFood(food);
                animal.checkWeight();
                System.out.println(animal);
            }
        }
        System.out.println();
    }
}
