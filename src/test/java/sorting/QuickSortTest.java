package sorting;

import org.junit.jupiter.api.Test;

class QuickSortTest {
    @Test
    void sortShouldOrderTypicalInputAndKeepOriginalUnchanged() {
        SortingTestSupport.assertSortShouldOrderTypicalInputAndKeepOriginalUnchanged(QuickSort::sort);
    }

    @Test
    void sortShouldHandleEmptyArray() {
        SortingTestSupport.assertSortShouldHandleEmptyArray(QuickSort::sort);
    }

    @Test
    void sortShouldHandleSingleElement() {
        SortingTestSupport.assertSortShouldHandleSingleElement(QuickSort::sort);
    }

    @Test
    void sortShouldHandleDuplicatesAndNegativeNumbers() {
        SortingTestSupport.assertSortShouldHandleDuplicatesAndNegativeNumbers(QuickSort::sort);
    }

    @Test
    void sortShouldRejectNullInput() {
        SortingTestSupport.assertSortShouldRejectNullInput(QuickSort::sort);
    }
}
