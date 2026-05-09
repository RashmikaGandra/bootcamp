package com.tw.bootcamp.problem5;

public class Bag {
    private final int capacity = 12;
    private int totalBallsInBag = 0;

    public boolean addBall(Ball ball) {
        if(isFull()) return false;
        totalBallsInBag++;
        return true;
    }

    private boolean isFull() {
        return totalBallsInBag == capacity;
    }
}
