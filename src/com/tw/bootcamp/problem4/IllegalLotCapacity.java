package com.tw.bootcamp.problem4;

public class IllegalLotCapacity extends  Throwable{
    public IllegalLotCapacity() {
        super("Lot capacity cannot be negative!");
    }
}
