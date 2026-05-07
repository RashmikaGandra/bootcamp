package com.tw.bootcamp.problem1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {
    @Test
    void shouldReturnAreaOfRectangle() {
        final Rectangle rectangle = new Rectangle(10, 5);
        final double area = rectangle.area();

        assertEquals(50, area);
    }
}
