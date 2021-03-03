package com.github.altrunner;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MinElementCalculatorTest {

    private MinElementCalculator testable = new MinElementCalculator();

    @Test
    void singleElementArrayShouldBeProcessed() {
        assertThat(testable.findMinElement(1)).isEqualTo(1);
    }

    @Test
    void negativeElementInTheMiddleOfArrayShouldBeFound() {
        assertThat(testable.findMinElement(0, 1, -4, 5, 0, 1)).isEqualTo(-4);
    }
}