package com.tw.bootcamp.problem4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LotTest {
    @Test
    void shouldCreateALotWithDefaultArea() {
        final Lot lot = new Lot(10);
        assertEquals(new Lot(10), lot);
    }

    @Test
    void shouldAddACarIntoLot() {
        final Lot lot = new Lot(10);
        final Car car = new Car("C1");
        assertTrue(lot.park(car));
    }
}
