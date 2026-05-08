package com.tw.bootcamp.problem3;

public enum LengthUnit {
    FEET(304.8),
    INCH(25.4),
    CM(10),
    MM(1);

    public final double conversionFactor;

    LengthUnit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }
}
