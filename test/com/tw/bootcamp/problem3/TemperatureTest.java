package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureTest {
    @Test
    void shouldReturnTrueIfFAndCAreEqual() {
        final Temperature celsius = Temperature.create(100, TemperatureUnit.C);
        final Temperature fahrenheit = Temperature.create(212, TemperatureUnit.F);
        assertEquals(celsius, fahrenheit);
    }
}
