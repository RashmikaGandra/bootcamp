package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InchTest {
    @Test
    void shouldReturnTheInchBack() {
        final Inch inches = Inch.create(12);
        assertEquals(Inch.create(12), inches);
    }

    @Test
    void shouldReturnBaseValue() {
        final Inch inches = Inch.create(12);
        assertEquals(Inch.create(12), inches.toBase());
    }
}
