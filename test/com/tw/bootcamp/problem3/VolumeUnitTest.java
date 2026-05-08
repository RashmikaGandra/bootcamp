package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VolumeUnitTest {
    @Test
    void shouldReturnTheVolumeUnitLiters() {
        VolumeUnit litre = VolumeUnit.LITRE;
        assertEquals(litre, VolumeUnit.LITRE);
    }

    @Test
    void shouldReturnTheVolumeUnitGallon() {
        VolumeUnit gallon = VolumeUnit.GALLON;
        assertEquals(gallon, VolumeUnit.GALLON);
    }
}
