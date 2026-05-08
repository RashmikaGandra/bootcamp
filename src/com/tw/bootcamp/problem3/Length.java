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

    public boolean isEqual(Length length) {
        return Double.compare(toBase(this), toBase(length)) <= 1;
    }

    private double toBase(Length length) {
        return length.value * length.unit.conversionFactor;
    }

}
