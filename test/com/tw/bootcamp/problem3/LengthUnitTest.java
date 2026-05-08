package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LengthUnitTest {
    @Test
    void shouldReturnTheLengthUnitFeet() {
        LengthUnit feet = LengthUnit.FEET;
        assertEquals(feet, LengthUnit.FEET);
    }

    @Test
    void shouldReturnTheLengthUnitInch() {
        LengthUnit inch= LengthUnit.INCH;
        assertEquals(inch, LengthUnit.INCH);
    }

    @Test
    void shouldReturnTheLengthUnitCM() {
        LengthUnit cm= LengthUnit.CM;
        assertEquals(cm, LengthUnit.CM);
    }

    @Test
    void shouldReturnTheLengthUnitMM() {
        LengthUnit mm= LengthUnit.MM;
        assertEquals(mm, LengthUnit.MM);
    }
}
