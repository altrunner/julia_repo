package com.github.altrunner.zoo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Zoo {

    private final List<Animal> animals;

    /**
     * Create an empty Zoo.
     */
    public Zoo() {
        this(Collections.emptyList());
    }

    /**
     * Create a Zoo with provided animals.
     *
     * @param animals that will live in this zoo
     */
    public Zoo(List<Animal> animals) {
        this.animals = animals;
    }

    /**
     * I will ask all animals in the zoo to say something an will return all their voices collected into a list.
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
