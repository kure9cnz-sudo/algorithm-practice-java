package hashtable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TwoSumTest {
    @Test
    void findIndicesShouldReturnPairForTypicalInput() {
        assertArrayEquals(new int[]{0, 1}, TwoSum.findIndices(new int[]{2, 7, 11, 15}, 9));
    }

    @Test
    void findIndicesShouldUseTwoDifferentIndicesForDuplicateValues() {
        assertArrayEquals(new int[]{0, 1}, TwoSum.findIndices(new int[]{3, 3}, 6));
    }

    @Test
    void findIndicesShouldHandleNegativeNumbers() {
        assertArrayEquals(new int[]{2, 4}, TwoSum.findIndices(new int[]{-1, -2, -3, -4, -5}, -8));
    }

    @Test
    void findIndicesShouldReturnEmptyArrayWhenNoPairExists() {
        assertEquals(0, TwoSum.findIndices(new int[]{1, 2, 3}, 100).length);
    }

    @Test
    void findIndicesShouldHandleEmptyAndSingleElementArrays() {
        assertTrue(TwoSum.findIndices(new int[0], 1).length == 0);
        assertTrue(TwoSum.findIndices(new int[]{1}, 1).length == 0);
    }

    @Test
    void findIndicesShouldRejectNullInput() {
        assertThrows(IllegalArgumentException.class, () -> TwoSum.findIndices(null, 1));
    }
}
