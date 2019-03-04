package com.codecool.thao.zoo.app;

import com.codecool.thao.zoo.Food;
import com.codecool.thao.zoo.Zoo;
import com.codecool.thao.zoo.animal.Bear;
import com.codecool.thao.zoo.animal.Bunny;
import com.codecool.thao.zoo.animal.Hedgehog;
import com.codecool.thao.zoo.animal.Wolf;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        zoo.adoptAnimal(new Wolf("Akela", 3));
        zoo.adoptAnimal(new Bear("Balu", 4));
        zoo.adoptAnimal(new Bunny("Tapsi", 2));
        zoo.adoptAnimal(new Bear("Brumi", 6));
        zoo.adoptAnimal(new Hedgehog("Durum", 4));

        zoo.feedAnimal(Food.MEAT);
        zoo.feedAnimal(Food.VEGGIE);
        zoo.feedAnimal(Food.MEAT);
        zoo.feedAnimal(Food.FRUIT);
        zoo.feedAnimal(Food.MEAT);
    }
}
