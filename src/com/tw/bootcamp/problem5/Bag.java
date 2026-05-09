package com.tw.bootcamp.problem5;

import java.util.HashMap;
import java.util.Map;

public class Bag {
    private final int CAPACITY;
    private int totalBallsInBag;
    private final Map<Ball, Integer> bag;

    public Bag() {
        CAPACITY = 12;
        bag = new HashMap<>();
        this.totalBallsInBag = 0;
    }

    public boolean addBall(Ball ball) {
        if (isMaxReached(ball)) return false;
        bag.compute(ball, (key, value) -> value == null ? 1 : value + 1);
        totalBallsInBag++;
        return true;
    }

    private boolean isMaxReached(Ball ball) {
        if (totalBallsInBag == CAPACITY) return true;
        final int ballCount = getBallCount(ball);

        return switch (ball) {
            case GREEN -> ballCount == 3;
            case RED -> ballCount == getBallCount(Ball.GREEN) * 2;
            case YELLOW -> totalBallsInBag < 1 || ballCount * 100 / totalBallsInBag >= 40;
            default -> false;
        };
    }


    private Integer getBallCount(Ball ball) {
        final Integer ballCount = bag.get(ball);
        return ballCount == null ? 0 : ballCount;
    }

    public String getSummary() {
        return String.format("""
                Blue : %d
                Red : %d
                Green : %d
                Yellow : %d
                
                Total : %d
                """, getBallCount(Ball.BLUE), getBallCount(Ball.RED), getBallCount(Ball.GREEN), getBallCount(Ball.YELLOW), totalBallsInBag);
    }
}
