package com.tw.bootcamp.problem4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LotTest {
    @Test
    void shouldCreateALotWithGivenCapacity() throws IllegalLotCapacity {
        final Lot lot = Lot.create(10);
        assertEquals(Lot.create(10), lot);
    }

    @Test
    void shouldThrowExceptionIfCapacityIsNegative() {
        assertThrows(IllegalLotCapacity.class, () -> Lot.create(-1));
    }

    @Test
    void shouldAddACarToLot() throws IllegalLotCapacity {
        final Lot lot = Lot.create(10);
        final Car car = new Car("C1");
        assertTrue(lot.park(car));
    }

    @Test
    void shouldNotAddACarToLotIfLotIsFull() throws IllegalLotCapacity {
        final Lot lot = Lot.create(0);
        final Car car = new Car("C1");
        assertFalse(lot.park(car));
    }

    @Test
    void shouldReturnTrueIfLotIsFull() throws IllegalLotCapacity {
        final Lot lot = Lot.create(10);
        assertFalse(lot.isFull());
    }
}
