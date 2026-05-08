package com.tw.bootcamp.problem4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Lot {
    private final int capacity;
    private final List<Car> lot = new ArrayList<>();

    private Lot(int capacity) {
        this.capacity = capacity;
    }

    public static Lot create(int capacity) throws IllegalLotCapacity {
        if (capacity < 0) throw new IllegalLotCapacity();
        return new Lot(capacity);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Lot lot)) return false;
        return capacity == lot.capacity;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(capacity);
    }

    public boolean park(Car car) {
        if (isFull()) return false;
        return lot.add(car);
    }

    public boolean isFull() {
        return lot.size() == capacity;
    }
}
