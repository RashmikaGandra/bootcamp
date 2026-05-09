package com.tw.bootcamp.problem5;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

public class BagTest {
    @Test
    void shouldAddBallToBagIfBagIsNotFull() {
        final Bag bag = new Bag();
        assertTrue(bag.addBall(Ball.BLUE));
    }

    @Test
    void shouldNotAddBallToBagIfBagIsFull() {
        final Bag bag = new Bag();
        IntStream.range(0,12).forEach((i) -> bag.addBall(Ball.BLUE));
        assertFalse(bag.addBall(Ball.GREEN));
    }

    @Test
    void shouldNotContainMoreThan3GreenBall() {
        final Bag bag = new Bag();
        IntStream.range(0,4).forEach((i) -> bag.addBall(Ball.GREEN));
        assertFalse(bag.addBall(Ball.GREEN));
    }
}
