package com.tw.bootcamp.problem2;

import java.util.Objects;

public class Chance {
    private final double value;

    private Chance(double value) {
        this.value = value;
    }

    public static Chance create(double value) throws IllegalArgumentException {
        if (value < 0 || value > 1) throw new IllegalArgumentException("Chance should be between 0 and 1!");
        return new Chance(value);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Chance chance)) return false;
        return Double.compare(value, chance.value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
