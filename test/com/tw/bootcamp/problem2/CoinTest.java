package com.tw.bootcamp.problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CoinTest {
    @Test
    void shouldReturnChancesOfGettingTails() {
        final double chance = Coin.chanceOfGettingTail();
        assertEquals(0.5, chance, 0.0);
    }
}
