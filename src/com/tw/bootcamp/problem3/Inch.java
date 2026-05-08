package com.tw.bootcamp.problem3;

import java.util.Objects;

public class Inch {
    private final double inch;

    private Inch(double inch) {
        this.inch = inch;
    }

    public static Inch create(double inch) {
        return new Inch(inch);
    }

    public Inch toBase(){
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Inch inch1)) return false;
        return Double.compare(inch, inch1.inch) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(inch);
    }
}
