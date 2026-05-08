package com.tw.bootcamp.problem3;

public enum VolumeUnit {
    LITRE(1),
    GALLON(3.78);

    public final double conversionFactor;

    VolumeUnit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }
}
