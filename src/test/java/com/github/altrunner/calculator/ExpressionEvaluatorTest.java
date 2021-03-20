package com.github.altrunner.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class ExpressionEvaluatorTest {

    private final ExpressionEvaluator testable = new ExpressionEvaluator();

    @Test
    void shouldAddPositiveIntegers() {
        assertThat(testable.evaluate("1+ 1")).isEqualTo(2);
        assertThat(testable.evaluate("  2+3")).isEqualTo(5);
        assertThat(testable.evaluate(" 22 +43")).isEqualTo(65);
    }

    @Test
    void shouldSubtractPositiveIntegers() {
        assertThat(testable.evaluate("7 - 3")).isEqualTo(4);
        assertThat(testable.evaluate("75-3  ")).isEqualTo(72);
        assertThat(testable.evaluate(" 0   -3")).isEqualTo(-3);
    }
}