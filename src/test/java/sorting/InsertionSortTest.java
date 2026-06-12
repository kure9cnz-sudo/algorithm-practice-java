package sorting;

import org.junit.jupiter.api.Test;

class InsertionSortTest {
    @Test
    void sortShouldOrderTypicalInputAndKeepOriginalUnchanged() {
        SortingTestSupport.assertSortShouldOrderTypicalInputAndKeepOriginalUnchanged(InsertionSort::sort);
    }

    @Test
    void sortShouldHandleEmptyArray() {
        SortingTestSupport.assertSortShouldHandleEmptyArray(InsertionSort::sort);
    }

    @Test
    void sortShouldHandleSingleElement() {
        SortingTestSupport.assertSortShouldHandleSingleElement(InsertionSort::sort);
    }

    @Test
    void sortShouldHandleDuplicatesAndNegativeNumbers() {
        SortingTestSupport.assertSortShouldHandleDuplicatesAndNegativeNumbers(InsertionSort::sort);
    }

    @Test
    void sortShouldRejectNullInput() {
        SortingTestSupport.assertSortShouldRejectNullInput(InsertionSort::sort);
    }
}
