package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LengthTest {
    @Test
    void shouldReturnTrueIfFeetAndInchAreEqual() {
        final Length feet = Length.create(1, LengthUnit.FEET);
        final Length inch = Length.create(12, LengthUnit.INCH);
        assertEquals(feet, inch);
    }

    @Test
    void shouldReturnTrueIfInchAndCmAreEqual() {
        final Length inch = Length.create(2, LengthUnit.INCH);
        final Length cm = Length.create(5, LengthUnit.CM);
        assertEquals(inch, cm);
    }

    @Test
    void shouldReturnTrueIfCmAndMmAreEqual() {
        final Length mm = Length.create(10, LengthUnit.MM);
        final Length cm = Length.create(1, LengthUnit.CM);
        assertEquals(mm, cm);
    }

    @Test
    void shouldAddLengthOfSameTypeAndReturnLengthOfInchType() {
        final Length twoInch = Length.create(2, LengthUnit.INCH);
        final Length fourInch = Length.create(4, LengthUnit.INCH);

        assertEquals(fourInch, twoInch.add(twoInch));
    }

    @Test
    void shouldAddLengthOfDifferentTypeAndReturnLengthOfInchType() {
        final Length twoInch = Length.create(2, LengthUnit.INCH);
        final Length twoAndHalfCm = Length.create(2.5, LengthUnit.CM);
        final Length threeInch = Length.create(3, LengthUnit.INCH);

        assertEquals(threeInch, twoInch.add(twoAndHalfCm));
    }
}
