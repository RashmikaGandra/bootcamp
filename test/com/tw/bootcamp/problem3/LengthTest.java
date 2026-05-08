package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LengthTest {
    @Test
    void shouldReturnTrueIfFeetAndInchAreEqual() {
        final Length feet = Length.create(1, LengthUnit.FEET);
        final Length inch = Length.create(12, LengthUnit.INCH);
        assertTrue(feet.equals(inch));
    }

    @Test
    void shouldReturnTrueIfInchAndCmAreEqual() {
        final Length inch = Length.create(2, LengthUnit.INCH);
        final Length cm = Length.create(5, LengthUnit.CM);
        assertTrue(inch.equals(cm));
    }

    @Test
    void shouldReturnTrueIfCmAndMmAreEqual() {
        final Length mm = Length.create(10, LengthUnit.MM);
        final Length cm = Length.create(1, LengthUnit.CM);
        assertTrue(mm.equals(cm));
    }
}
