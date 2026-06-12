package search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LowerBoundTest {
    @Test
    void lowerBoundShouldFindFirstGreaterOrEqualPosition() {
        assertEquals(2, LowerBound.lowerBound(new int[]{1, 3, 5, 7}, 4));
        assertEquals(2, LowerBound.lowerBound(new int[]{1, 3, 5, 7}, 5));
    }

    @Test
    void lowerBoundShouldReturnFirstDuplicatePosition() {
        assertEquals(1, LowerBound.lowerBound(new int[]{1, 2, 2, 2, 4}, 2));
    }

    @Test
    void lowerBoundShouldHandleTargetsOutsideRange() {
        assertEquals(0, LowerBound.lowerBound(new int[]{3, 5, 7}, 1));
        assertEquals(3, LowerBound.lowerBound(new int[]{3, 5, 7}, 9));
    }

    @Test
    void lowerBoundShouldHandleEmptyAndSingleElementArrays() {
        assertEquals(0, LowerBound.lowerBound(new int[0], 10));
        assertEquals(0, LowerBound.lowerBound(new int[]{10}, 10));
        assertEquals(1, LowerBound.lowerBound(new int[]{10}, 11));
    }

    @Test
    void lowerBoundShouldRejectNullArray() {
        assertThrows(IllegalArgumentException.class, () -> LowerBound.lowerBound(null, 1));
    }
}
