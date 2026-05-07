package com.tw.bootcamp.problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ChanceTest {
    @Test
    void shouldThrowExceptionIfChanceIsLessThan0() {
        final IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> Chance.create(-3));
        assertEquals("Chance should be between 0 and 1!",illegalArgumentException.getMessage());
    }

    @Test
    void shouldThrowExceptionIfChanceIsGreaterThan1() {
        final IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> Chance.create(3));
        assertEquals("Chance should be between 0 and 1!",illegalArgumentException.getMessage());

    }

    @Test
    void shouldGiveChanceForGettingTail() {
        final Chance chanceOfGettingTail = Chance.create(0.25);
        assertEquals(Chance.create(0.25), chanceOfGettingTail);
    }

    @Test
    void shouldReturnChanceForNotGettingTail() {
        final Chance chanceForNotGettingTail = Chance.create(0.23);
        assertEquals(Chance.create(0.23), chanceForNotGettingTail);
    }

    @Test
    void shouldReturnChanceOfGettingTailWithTwoCoins() {
        final Chance chanceForGettingTailWith2Coins = Chance.create(0.24);
        assertEquals(Chance.create(0.24), chanceForGettingTailWith2Coins);
    }

}
