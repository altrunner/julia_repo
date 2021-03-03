package com.github.altrunner;

public class MinElementCalculator {

    /**
     * I will return the value of min element in the provided array
     * @param array to be processed
     * @return min element value
     */
    public int findMinElement(int... array) {

        int minElementValue = array[0];

        for (int i = 1; i < array.length; i++){
            if (minElementValue > array[i]){
                minElementValue = array[i];
            }
        }

        return minElementValue;
    }
}