package com.tw.bootcamp.problem3;

import java.util.Objects;

public class Length {
    private final double value;
    private final LengthUnit unit;

    private Length(double value, LengthUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    public static Length create(double value, LengthUnit unit) {
        return new Length(value, unit);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Length length)) return false;
        return Double.compare(value * unit.conversionFactor, length.value * length.unit.conversionFactor) <= 1;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }
}
