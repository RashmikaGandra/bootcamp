package com.tw.bootcamp.problem4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ParkingLotTest {
    @Test
    void shouldCreateALotWithGivenCapacity() throws IllegalLotCapacity {
        final ParkingLot parkingLot = ParkingLot.create(10);
        assertEquals(ParkingLot.create(10), parkingLot);
    }

    @Test
    void shouldThrowExceptionIfCapacityIsNegative() {
        assertThrows(IllegalLotCapacity.class, () -> ParkingLot.create(-1));
    }

    @Test
    void shouldAddACarToLot() throws IllegalLotCapacity {
        final ParkingLot parkingLot = ParkingLot.create(10);
        assertTrue(parkingLot.park());
    }

    @Test
    void shouldNotAddACarToLotIfLotIsFull() throws IllegalLotCapacity {
        final ParkingLot parkingLot = ParkingLot.create(0);
        assertFalse(parkingLot.park());
    }

    @Test
    void shouldReturnTrueIfLotIsFull() throws IllegalLotCapacity {
        final ParkingLot parkingLot = ParkingLot.create(10);
        assertFalse(parkingLot.isFull());
    }
}
