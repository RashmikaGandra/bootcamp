package com.tw.bootcamp.problem3;

import java.util.Objects;

public class Temperature {
    private final double value;
    private final TemperatureUnit unit;

    private Temperature(double value, TemperatureUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    public static Temperature create(double value, TemperatureUnit unit) {
        return new Temperature(value, unit);
    }

    private double toCelsius(Temperature temp) {
        return (temp.value - 32)* 5/9;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Temperature temp)) return false;
        return Math.abs(Double.compare(value, toCelsius(temp))) == 0.0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }
}
