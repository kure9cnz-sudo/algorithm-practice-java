package search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class UpperBoundTest {
    @Test
    void upperBoundShouldFindFirstGreaterPosition() {
        assertEquals(3, UpperBound.upperBound(new int[]{1, 3, 5, 7}, 5));
        assertEquals(2, UpperBound.upperBound(new int[]{1, 3, 5, 7}, 4));
    }

    @Test
    void upperBoundShouldSkipAllDuplicates() {
        assertEquals(4, UpperBound.upperBound(new int[]{1, 2, 2, 2, 4}, 2));
    }

    @Test
    void upperBoundShouldHandleTargetsOutsideRange() {
        assertEquals(0, UpperBound.upperBound(new int[]{3, 5, 7}, 1));
        assertEquals(3, UpperBound.upperBound(new int[]{3, 5, 7}, 9));
    }

    @Test
    void upperBoundShouldHandleEmptyAndSingleElementArrays() {
        assertEquals(0, UpperBound.upperBound(new int[0], 10));
        assertEquals(1, UpperBound.upperBound(new int[]{10}, 10));
        assertEquals(0, UpperBound.upperBound(new int[]{10}, 9));
    }

    @Test
    void upperBoundShouldRejectNullArray() {
        assertThrows(IllegalArgumentException.class, () -> UpperBound.upperBound(null, 1));
    }
}
