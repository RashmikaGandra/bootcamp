package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VolumeTest {
    @Test
    void shouldReturnTrueIfGallonAndLitreAreEqual() {
        final Volume oneGallon = Volume.create(1, VolumeUnit.GALLON);
        final Volume oneLitre = Volume.create(3.78, VolumeUnit.LITRE);

        assertEquals(oneGallon, oneLitre);
    }

    @Test
    void shouldAddVolumesOfDifferentTypeAndReturnLengthOfLitreType() {
        final Volume oneGallon = Volume.create(1, VolumeUnit.GALLON);
        final Volume oneLitre = Volume.create(1, VolumeUnit.LITRE);
        final Volume sum = Volume.create(4.78, VolumeUnit.LITRE);

        assertEquals(sum, oneGallon.add(oneLitre));
    }
}
