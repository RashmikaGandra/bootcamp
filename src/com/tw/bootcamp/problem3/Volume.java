package com.tw.bootcamp.problem3;

import java.util.Objects;

public class Volume {
    private final double quantity;
    private final VolumeUnit unit;

    private Volume(double quantity, VolumeUnit unit) {
        this.quantity = quantity;
        this.unit = unit;
    }

    public static Volume create(double quantity, VolumeUnit unit) {
        return new Volume(quantity, unit);
    }

    private double toBase(Volume volume) {
        return volume.unit.toBase(volume.quantity);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Volume volume)) return false;
        return Math.abs(toBase(this) - toBase(volume)) <= 0.0001;
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantity, unit);
    }

    public Volume add(Volume volume) {
        final double totalInBase = toBase(volume) + toBase(this);
        final double total = volume.unit.toLitre(totalInBase);
        return Volume.create(total, VolumeUnit.LITRE);
    }
}
