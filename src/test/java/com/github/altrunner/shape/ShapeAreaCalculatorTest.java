package com.github.altrunner.shape;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ShapeAreaCalculatorTest {

    @Test
    void triangleAreaTest() {

        Shape triangle = new Triangle(1.2, 2.2, 3);

        assertThat(Math.round(triangle.shapeAreaCalculate())).isEqualTo(1.13);

    }

    @Test
    void circleAreaTest() {

        Shape circle = new Circle(5.56);

        assertThat(Math.round(circle.shapeAreaCalculate())).isEqualTo(97.07);

    }

    @Test
    void rectangleAreaTest() {

        Shape rectangle = new Rectangle(6,9.17);

        assertThat(Math.round(rectangle.shapeAreaCalculate())).isEqualTo(55.02);

    }
}
