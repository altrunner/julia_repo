package com.github.altrunner.collections;

import com.github.altrunner.collections.exceptions.StackEmptyException;
import com.github.altrunner.collections.exceptions.StackOverflowException;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
class StackTest {

    @Test
    void sunnyDayScenario() {
        Stack testable = new Stack(5);

        testable.push(0);
        testable.push(1);
        testable.push(2);
        testable.push(3);
        testable.push(4);

        assertThat(testable.pop()).isEqualTo(4);
        assertThat(testable.pop()).isEqualTo(3);
        assertThat(testable.pop()).isEqualTo(2);
        assertThat(testable.pop()).isEqualTo(1);
        assertThat(testable.pop()).isEqualTo(0);
    }

    @Test
    void pushMoreElementsThanStackDepthShouldFail() {
        Stack testable = new Stack(2);

        assertThatCode(() -> testable.push(0)).doesNotThrowAnyException();
        assertThatCode(() -> testable.push(1)).doesNotThrowAnyException();
        assertThatThrownBy(() -> testable.push(2)).isInstanceOf(StackOverflowException.class);
    }

    @Test
    void popFromEmptyStackShouldFail() {
        Stack testable = new Stack(5);

        assertThatThrownBy(testable::pop).isInstanceOf(StackEmptyException.class);
    }
}