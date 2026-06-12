package greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CoinChangeGreedyTest {
    @Test
    void minCoinsShouldUseLargestCoinsFirstForCanonicalCoinSet() {
        assertEquals(8, CoinChangeGreedy.minCoins(new int[]{1, 5, 10, 50, 100}, 376));
    }

    @Test
    void minCoinsShouldWorkWhenCoinValuesAreUnsorted() {
        assertEquals(8, CoinChangeGreedy.minCoins(new int[]{10, 1, 100, 5, 50}, 376));
    }

    @Test
    void minCoinsShouldReturnZeroForAmountZero() {
        assertEquals(0, CoinChangeGreedy.minCoins(new int[]{1, 5, 10}, 0));
    }

    @Test
    void minCoinsShouldReturnMinusOneWhenAmountCannotBeMade() {
        assertEquals(-1, CoinChangeGreedy.minCoins(new int[]{5, 10}, 3));
    }

    @Test
    void minCoinsShouldHandleDuplicateCoinValues() {
        assertEquals(2, CoinChangeGreedy.minCoins(new int[]{1, 1, 5}, 6));
    }

    @Test
    void minCoinsShouldRejectInvalidInputs() {
        assertThrows(IllegalArgumentException.class, () -> CoinChangeGreedy.minCoins(null, 1));
        assertThrows(IllegalArgumentException.class, () -> CoinChangeGreedy.minCoins(new int[]{1}, -1));
        assertThrows(IllegalArgumentException.class, () -> CoinChangeGreedy.minCoins(new int[]{0, 1}, 1));
        assertThrows(IllegalArgumentException.class, () -> CoinChangeGreedy.minCoins(new int[]{-1, 1}, 1));
    }
}
