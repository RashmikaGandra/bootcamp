package com.tw.bootcamp.problem4;

import java.util.Objects;

public class ParkingLot {
    private int capacity;

    private ParkingLot(int capacity) {
        this.capacity = capacity;
    }

    public static ParkingLot create(int capacity) throws IllegalLotCapacity {
        if (capacity < 0) throw new IllegalLotCapacity();
        return new ParkingLot(capacity);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ParkingLot parkingLot)) return false;
        return capacity == parkingLot.capacity;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(capacity);
    }

    public boolean park() {
        if (isFull()) return false;
        capacity --;
        return true;
    }

    public boolean isFull() {
        return capacity == 0;
    }
}
