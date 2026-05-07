package com.tw.bootcamp.problem1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SquareTest {
    @Test
    void shouldReturnAreaOfSquare() {
        final Square square = new Square(5);
        final double area = square.calculateArea();

        assertEquals(25, area, 0.0);

    }

    @Test
    void shouldReturnPerimeterOfSquare() {
        final Square square = new Square(5);
        final double perimeter = square.calculatePerimeter();

        assertEquals(20, perimeter, 0.0);

    }
}
