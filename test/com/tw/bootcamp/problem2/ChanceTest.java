package com.tw.bootcamp.problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ChanceTest {
    @Test
    void shouldThrowExceptionIfChanceIsLessThan0() {
        final InvalidProbabilityCreationException invalidProbabilityException = assertThrows(InvalidProbabilityCreationException.class, () -> Chance.create(-3));
        assertEquals("Chance should be between 0 and 1!", invalidProbabilityException.getMessage());
    }

    @Test
    void shouldThrowExceptionIfChanceIsGreaterThan1() {
        final InvalidProbabilityCreationException invalidProbabilityException = assertThrows(InvalidProbabilityCreationException.class, () -> Chance.create(3));
        assertEquals("Chance should be between 0 and 1!", invalidProbabilityException.getMessage());

    }

    @Test
    void shouldGiveChanceForGettingTail() throws InvalidProbabilityCreationException {
        final Chance chanceOfGettingTail = Chance.create(0.5);
        assertEquals(Chance.create(0.5), chanceOfGettingTail);
    }

    @Test
    void shouldReturnChanceForNotGettingTail() throws InvalidProbabilityCreationException {
        final Chance chanceForNotGettingTail = Chance.create(0.25);
        assertEquals(Chance.create(0.75), chanceForNotGettingTail.not());
    }

    @Test
    void shouldReturnChanceOfGettingTailWithTwoCoins() throws InvalidProbabilityCreationException {
        final Chance chanceForGettingTailWith2Coins = Chance.create(0.24);
        assertEquals(Chance.create(0.24), chanceForGettingTailWith2Coins);
    }

    @Test
    void shouldReturnTheChanceOfGetting3OnDice() throws InvalidProbabilityCreationException {
        final Chance chanceOfGetting3OnDice = Chance.create(0.16);
        assertEquals(Chance.create(0.16), chanceOfGetting3OnDice);
    }

    @Test
    void shouldReturnChanceOfGettingAtLeastOneTailWith2Coins() throws InvalidProbabilityCreationException {
        final Chance chanceOfGettingTailOnFirstCoin = Chance.create(0.5);
        final Chance chanceOfGettingTailOnSecondCoin = Chance.create(0.5);
        assertEquals(Chance.create(0.75), chanceOfGettingTailOnFirstCoin.or(chanceOfGettingTailOnSecondCoin));
    }

    @Test
    void shouldReturnChanceOfGettingTailOnBothCoins() throws InvalidProbabilityCreationException {
        final Chance chanceOfGettingTailOnFirstCoin = Chance.create(0.5);
        final Chance chanceOfGettingTailOnSecondCoin = Chance.create(0.5);
        assertEquals(Chance.create(0.25), chanceOfGettingTailOnFirstCoin.and(chanceOfGettingTailOnSecondCoin));
    }
}
