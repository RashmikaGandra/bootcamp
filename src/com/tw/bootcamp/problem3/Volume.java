package com.tw.bootcamp.problem3;

import java.util.Objects;

public class Volume {
    private final double value;
    private final VolumeUnit unit;

    private Volume(double value, VolumeUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    public static Volume create(double value, VolumeUnit unit) {
        return new Volume(value, unit);
    }

    private double toBase(Volume volume) {
        return volume.unit.toBase(volume.value);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Volume volume)) return false;
        return Double.compare(toBase(this), toBase(volume)) <= 1;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }
}
