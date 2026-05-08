package com.tw.bootcamp.problem3;

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

    public boolean isEqual(Volume volume) {
        return Double.compare(toBase(this), toBase(volume)) <= 1;
    }

    private double toBase(Volume volume) {
        return volume.value * volume.unit.conversionFactor;
    }
}
