package com.tw.bootcamp.problem5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BagTest {
    @Test
    void shouldAddBallToBagIfBagIsNotFull() {
        final Bag bag = new Bag();
        assertTrue(bag.addBall());
    }

    @Test
    void shouldNotAddBallToBagIfBagIsFull() {
        final Bag bag = new Bag();

        for (int i = 0; i < 12; i++) {
            bag.addBall();
        }

        assertFalse(bag.addBall());
    }
}
