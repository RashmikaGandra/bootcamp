package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FeetTest {
    @Test
    void shouldCreateFeet() {
        final Feet oneFeet = Feet.create(1);
        assertEquals(Feet.create(1), oneFeet);
    }

    @Test
    void shouldConvertToBaseValue() {
        final Feet oneFeet = Feet.create(1);
        assertEquals(Inch.create(12),oneFeet.toBase());
    }
}
