package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureUnitTest {
    @Test
    void shouldReturnTheTemperatureUnitCelsius() {
        TemperatureUnit celsius = TemperatureUnit.C;
        assertEquals(celsius, TemperatureUnit.C);
    }

    @Test
    void shouldReturnTheTemperatureUnitFahrenheit() {
        TemperatureUnit fahrenheit = TemperatureUnit.F;
        assertEquals(fahrenheit, TemperatureUnit.F);
    }
}
