package greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class IntervalSchedulingTest {
    @Test
    void maxNonOverlappingIntervalsShouldSolveTypicalCase() {
        int[][] intervals = {{1, 3}, {2, 4}, {3, 5}, {0, 7}, {5, 9}, {8, 10}};

        assertEquals(3, IntervalScheduling.maxNonOverlappingIntervals(intervals));
    }

    @Test
    void maxNonOverlappingIntervalsShouldAllowTouchingIntervals() {
        int[][] intervals = {{1, 2}, {2, 3}, {3, 4}};

        assertEquals(3, IntervalScheduling.maxNonOverlappingIntervals(intervals));
    }

    @Test
    void maxNonOverlappingIntervalsShouldReturnZeroForEmptyInput() {
        assertEquals(0, IntervalScheduling.maxNonOverlappingIntervals(new int[0][0]));
    }

    @Test
    void maxNonOverlappingIntervalsShouldHandleDuplicateIntervals() {
        int[][] intervals = {{1, 3}, {1, 3}, {1, 3}};

        assertEquals(1, IntervalScheduling.maxNonOverlappingIntervals(intervals));
    }

    @Test
    void maxNonOverlappingIntervalsShouldHandleZeroLengthIntervals() {
        int[][] intervals = {{1, 1}, {1, 2}, {2, 2}};

        assertEquals(3, IntervalScheduling.maxNonOverlappingIntervals(intervals));
    }

    @Test
    void maxNonOverlappingIntervalsShouldRejectInvalidInputs() {
        assertThrows(IllegalArgumentException.class, () -> IntervalScheduling.maxNonOverlappingIntervals(null));
        assertThrows(IllegalArgumentException.class, () -> IntervalScheduling.maxNonOverlappingIntervals(new int[][]{{1}}));
        assertThrows(IllegalArgumentException.class, () -> IntervalScheduling.maxNonOverlappingIntervals(new int[][]{{3, 1}}));
    }
}
