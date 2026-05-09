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
        IntStream.range(0, 12).forEach((i) -> bag.addBall(Ball.BLUE));
        assertFalse(bag.addBall(Ball.GREEN));
    }

    @Test
    void shouldNotContainMoreThan3GreenBall() {
        final Bag bag = new Bag();
        IntStream.range(0, 3).forEach((i) -> bag.addBall(Ball.GREEN));
        assertFalse(bag.addBall(Ball.GREEN));
    }

    @Test
    void shouldAddRedBallIfTheCountIsLessThanDoubleOfGreen() {
        final Bag bag = new Bag();
        bag.addBall(Ball.GREEN);
        assertTrue(bag.addBall(Ball.RED));
    }

    @Test
    void shouldNotAddRedBallIfTheCountIsMoreThanDoubleOfGreen() {
        final Bag bag = new Bag();
        bag.addBall(Ball.GREEN);
        IntStream.range(0, 2).forEach((i) -> bag.addBall(Ball.RED));
        assertFalse(bag.addBall(Ball.RED));
    }

    @Test
    void shouldNotAddYellowBallIfTotalBallsAreLessThan1() {
        final Bag bag = new Bag();
        assertFalse(bag.addBall(Ball.YELLOW));
    }

    @Test
    void shouldAddYellowIfTheCountIsNot40PercentOfTotal() {
        final Bag bag = new Bag();
        IntStream.range(0, 2).forEach((i) -> bag.addBall(Ball.GREEN));
        bag.addBall(Ball.YELLOW);
        assertTrue(bag.addBall(Ball.YELLOW));
    }

    @Test
    void shouldNotAddYellowIfTheCountIs40PercentOfTotal() {
        final Bag bag = new Bag();
        IntStream.range(0,6).forEach((i) -> bag.addBall(Ball.BLUE));
        IntStream.range(0,4).forEach((i) -> bag.addBall(Ball.YELLOW));
        assertFalse(bag.addBall(Ball.YELLOW));
    }

    @Test
    void shouldReturnSummaryOfContentsOfBag() {
        final Bag bag = new Bag();
        IntStream.range(0,6).forEach((i) -> bag.addBall(Ball.BLUE));
        IntStream.range(0,3).forEach((i) -> bag.addBall(Ball.GREEN));
        bag.addBall(Ball.YELLOW);
        final String summary = bag.getSummary();
        assertEquals("""
                Blue : 6
                Red : 0
                Green : 3
                Yellow : 1
                
                Total : 10
                """,summary);
    }
}
