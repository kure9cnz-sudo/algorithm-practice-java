package sorting;

import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

final class SortingTestSupport {
    private SortingTestSupport() {
    }

    static void assertSortShouldOrderTypicalInputAndKeepOriginalUnchanged(Function<int[], int[]> sorter) {
        int[] input = {5, 2, 4, 6, 1, 3};
        int[] original = input.clone();

        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, sorter.apply(input));
        assertArrayEquals(original, input);
    }

    static void assertSortShouldHandleEmptyArray(Function<int[], int[]> sorter) {
        assertArrayEquals(new int[0], sorter.apply(new int[0]));
    }

    static void assertSortShouldHandleSingleElement(Function<int[], int[]> sorter) {
        assertArrayEquals(new int[]{42}, sorter.apply(new int[]{42}));
    }

    static void assertSortShouldHandleDuplicatesAndNegativeNumbers(Function<int[], int[]> sorter) {
        int[] input = {3, -1, 3, 0, -1, 2};

        assertArrayEquals(new int[]{-1, -1, 0, 2, 3, 3}, sorter.apply(input));
    }

    static void assertSortShouldRejectNullInput(Function<int[], int[]> sorter) {
        assertThrows(IllegalArgumentException.class, () -> sorter.apply(null));
    }
}
