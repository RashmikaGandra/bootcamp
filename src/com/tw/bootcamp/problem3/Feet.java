package com.tw.bootcamp.problem3;

import java.util.Objects;

public class Feet {
    private final double feet;

    private Feet(double feet) {
        this.feet = feet;
    }

    public static Feet create(double feet) {
        return new Feet(feet);
    }

    public Inch toBase() {
        return Inch.create(feet * 12);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Feet feet1)) return false;
        return Double.compare(feet, feet1.feet) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(feet);
    }
}
