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

    private double toBase(Length length) {
        return length.unit.toBase(length.value);
    }

    public Length add(Length length) {
        final double totalInBase = toBase(length) + toBase(this);
        final double total = length.unit.fromBase(totalInBase);
        return Length.create(total, unit);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Length length)) return false;
        return Double.compare(toBase(this), toBase(length)) <= 1;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }
}
