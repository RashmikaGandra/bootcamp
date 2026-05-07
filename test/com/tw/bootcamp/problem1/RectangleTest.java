package com.tw.bootcamp.problem1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {
    @Test
    void shouldReturnAreaOfRectangle() {
        final Rectangle rectangle = new Rectangle(10, 5);
        final double area = rectangle.calculateArea();

        assertEquals(50, area);
    }

    @Test
    void shouldReturnAreaForDoubleValues() {
        final Rectangle rectangle = new Rectangle(25.2, 34.5);
        final double area = rectangle.calculateArea();

        assertEquals(869.4,area, 0.0);

    }

    @Test
    void shouldReturnThePerimeterOfRectangle() {
        final Rectangle rectangle = new Rectangle(10.5, 5.5);
        final double perimeter = rectangle.calculatePerimeter();

        assertEquals(32, perimeter, 0.0);
    }
}
