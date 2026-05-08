package com.tw.bootcamp.problem3;

public enum VolumeUnit {
    LITRE(1),
    GALLON(3.78);

    private final double conversionFactor;

    VolumeUnit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public double toBase(double quantity){
        return quantity * conversionFactor;
    }

    public double toLitre(double base) {
        return base / LITRE.conversionFactor;
    }
}
