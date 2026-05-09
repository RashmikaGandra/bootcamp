package com.tw.bootcamp.problem4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ParkingLotRepositoryTest {
    @Test
    void shouldCreateParkingLotsWithCapacity() throws IllegalLotCapacity {
        final ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        final int lotId =  parkingLotRepository.createLot(10);
        assertEquals(1, lotId);
    }

    @Test
    void shouldReturnTrueIfParkingIsDone() throws IllegalLotCapacity {
        final ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        parkingLotRepository.createLot(10);
        assertTrue(parkingLotRepository.park());
    }

    @Test
    void shouldReturnFalseIfParkingIsNotDone() throws IllegalLotCapacity {
        final ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        parkingLotRepository.createLot(0);
        assertFalse(parkingLotRepository.park());
    }

    @Test
    void shouldReturnTrueIfAllParkingLotAreFull() throws IllegalLotCapacity {
        final ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        parkingLotRepository.createLot(0);
        assertTrue(parkingLotRepository.isFull());
    }

    @Test
    void shouldReturnFalseIfAllParkingLotAreNotFull() throws IllegalLotCapacity {
        final ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        parkingLotRepository.createLot(1);
        assertFalse(parkingLotRepository.isFull());
    }
}
