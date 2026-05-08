package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VolumeUnitTest {
    @Test
    void shouldReturnTheVolumeUnitLiters() {
        VolumeUnit litre = VolumeUnit.LITRE;
        assertEquals(litre, VolumeUnit.LITRE);
        assertEquals(1, litre.conversionFactor);
    }
    @Test
    void shouldReturnTheVolumeUnitGallon() {
        VolumeUnit gallon = VolumeUnit.GALLON;
        assertEquals(gallon, VolumeUnit.GALLON);
        assertEquals(3.78, gallon.conversionFactor);
    }
}
