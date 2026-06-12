package dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Knapsack01BasicTest {
    @Test
    void maxValueShouldSolveTypicalCase() {
        int[] weights = {2, 3, 4, 5};
        int[] values = {3, 4, 5, 6};

        assertEquals(7, Knapsack01Basic.maxValue(weights, values, 5));
    }

    @Test
    void maxValueShouldReturnZeroForCapacityZero() {
        assertEquals(0, Knapsack01Basic.maxValue(new int[]{1, 2}, new int[]{10, 20}, 0));
    }

    @Test
    void maxValueShouldReturnZeroForEmptyItems() {
        assertEquals(0, Knapsack01Basic.maxValue(new int[0], new int[0], 10));
    }

    @Test
    void maxValueShouldReturnZeroWhenAllItemsAreTooHeavy() {
        assertEquals(0, Knapsack01Basic.maxValue(new int[]{5, 6}, new int[]{10, 12}, 4));
    }

    @Test
    void maxValueShouldHandleRepeatedWeights() {
        assertEquals(5, Knapsack01Basic.maxValue(new int[]{1, 1, 1}, new int[]{1, 2, 3}, 2));
    }

    @Test
    void maxValueShouldRejectInvalidInputs() {
        assertThrows(IllegalArgumentException.class, () -> Knapsack01Basic.maxValue(null, new int[]{1}, 1));
        assertThrows(IllegalArgumentException.class, () -> Knapsack01Basic.maxValue(new int[]{1}, null, 1));
        assertThrows(IllegalArgumentException.class, () -> Knapsack01Basic.maxValue(new int[]{1}, new int[]{1, 2}, 1));
        assertThrows(IllegalArgumentException.class, () -> Knapsack01Basic.maxValue(new int[]{1}, new int[]{1}, -1));
        assertThrows(IllegalArgumentException.class, () -> Knapsack01Basic.maxValue(new int[]{0}, new int[]{1}, 1));
        assertThrows(IllegalArgumentException.class, () -> Knapsack01Basic.maxValue(new int[]{1}, new int[]{-1}, 1));
    }
}
