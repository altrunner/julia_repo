package com.github.altrunner.javamarathon;

import java.util.Map;

public class Caffee implements DrinkReceipt, DrinkPreparation, Rating{

    String name;
    int rating;
    Map<String, Integer> ingredients;


    @Override
    public String getName() {
        return null;
    }

    @Override
    public DrinkReceipt addComponent(String componentName, int componentCount) {
        return null;
    }


    @Override
    public Map<String, Integer> makeDrink() {

        return Map.of("Water", 100, "Arabica", 20);
    }

    @Override
    public int getRating() {
        return 0;
    }
}
