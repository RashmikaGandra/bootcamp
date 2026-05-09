package com.tw.bootcamp.problem5;

import java.util.HashMap;
import java.util.Map;

public class Bag {
    private final int capacity = 12;
    private int totalBallsInBag = 0;
    private final Map<Ball, Integer> bag = new HashMap<>();

    public boolean addBall(Ball ball) {
        if(isMaxReached(ball)) return false;
        bag.compute(ball,(key,value) -> value == null ? 1 : value+1);
        totalBallsInBag++;
        return true;
    }

    private boolean isMaxReached(Ball ball) {
        if(totalBallsInBag == capacity) return true;
        final Integer ballCount = bag.get(ball);

        return switch (ball){
            case GREEN ->  ballCount != null && ballCount == 3;
            default -> false;
        };
    }
}
