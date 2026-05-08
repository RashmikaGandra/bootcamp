package com.tw.bootcamp.problem4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    void shouldCreateACarWithId() {
        final Car c1 = new Car("C1");
        assertEquals(new Car("C1"), c1);
    }
}