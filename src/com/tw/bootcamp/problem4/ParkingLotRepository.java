package com.tw.bootcamp.problem4;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ParkingLotRepository {
    private final Map<Integer, ParkingLot> parkingLots = new HashMap<>();
    private int currentLotId = 0;

    public int createLot(int capacity) throws IllegalLotCapacity {
        final ParkingLot parkingLot = ParkingLot.create(capacity);
        parkingLots.putIfAbsent(++currentLotId, parkingLot);
        return currentLotId;
    }

    public boolean park() {
        final Optional<ParkingLot> parkingLotWithSpace = findParkingLotWithSpace();
        return parkingLotWithSpace.map(ParkingLot::park).orElse(false);
    }

    private Optional<ParkingLot> findParkingLotWithSpace() {
        return parkingLots.values().stream().filter(parkingLot -> !parkingLot.isFull()).findFirst();
    }

    public boolean isFull() {
        return findParkingLotWithSpace().isEmpty();
    }
}
