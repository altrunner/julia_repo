package com.github.altrunner.shape;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.data.Offset.offset;

public class ShapeAreaCalculatorTest {

    @Test
    void triangleAreaTest() {

        Shape triangle = new Triangle(1.2, 2.2, 3);

        assertThat(triangle.area()).isCloseTo(1.13, offset(0.002));

    }

    @Test
    void circleAreaTest() {

        Shape circle = new Circle(5.56);

        assertThat(circle.area()).isCloseTo(97.12, offset(0.01));

    }

    @Test
    void rectangleAreaTest() {

        Shape rectangle = new Rectangle(6,9.17);

        assertThat(rectangle.area()).isCloseTo(55.02, offset(0.01));

    }
}
