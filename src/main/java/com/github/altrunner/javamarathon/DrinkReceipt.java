package com.github.altrunner.javamarathon;

public interface DrinkReceipt {

    public String getName();
    public DrinkReceipt addComponent(String componentName, int componentCount);
}
