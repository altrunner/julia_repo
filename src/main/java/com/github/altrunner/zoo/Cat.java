package com.github.altrunner.zoo;

public class Cat implements Animal {

    private String color;

    public Cat() {
    }

    public Cat(String color) {
        this.color = color;
    }

    @Override
    public String say() {

        if (this.color != null){
            return this.color + " cat says Meow";
        }

        return "Meow";
    }
}
