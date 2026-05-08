package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LengthUnitTest {
    @Test
    void shouldReturnTheLengthUnitFeet() {
        LengthUnit feet = LengthUnit.FEET;
        assertEquals(feet, LengthUnit.FEET);
        assertEquals(304.8, feet.conversionFactor);
    }

    @Test
    void shouldReturnTheLengthUnitInch() {
        LengthUnit inch= LengthUnit.INCH;
        assertEquals(inch, LengthUnit.INCH);
        assertEquals(25.4, inch.conversionFactor);
    }

    @Test
    void shouldReturnTheLengthUnitCM() {
        LengthUnit cm= LengthUnit.CM;
        assertEquals(cm, LengthUnit.CM);
        assertEquals(10, cm.conversionFactor);
    }

    @Test
    void shouldReturnTheLengthUnitMM() {
        LengthUnit mm= LengthUnit.MM;
        assertEquals(mm, LengthUnit.MM);
        assertEquals(1, mm.conversionFactor);
    }
}
