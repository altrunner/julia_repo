package com.github.altrunner.zoo;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.emptyList;

public class Zoo {

    private final String address;
    private final List<Animal> animals;

    /**
     * Create an empty Zoo.
     */
    public Zoo() {
        this(emptyList());
    }

    public Zoo(List<Animal> animals) {
        this(animals, "default address");
    }

    /**
     * Create a Zoo with provided animals.
     *
     * @param animals that will live in this zoo
     */
    public Zoo(List<Animal> animals, String address) {
        this.animals = animals;
        this.address = address;
    }

    /**
     * I will ask all animals in the zoo to say something and will return all their voices collected into a list.
     *
     * @return voices of all animals in the zoo
     */
    public List<String> talkToMe() {
        List<String> voices = new ArrayList<>();
        for (Animal animal : animals) {
            voices.add(animal.say());
        }
        return voices;
    }
}
