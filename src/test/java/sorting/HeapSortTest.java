package sorting;

import org.junit.jupiter.api.Test;

class HeapSortTest {
    @Test
    void sortShouldOrderTypicalInputAndKeepOriginalUnchanged() {
        SortingTestSupport.assertSortShouldOrderTypicalInputAndKeepOriginalUnchanged(HeapSort::sort);
    }

    @Test
    void sortShouldHandleEmptyArray() {
        SortingTestSupport.assertSortShouldHandleEmptyArray(HeapSort::sort);
    }

    @Test
    void sortShouldHandleSingleElement() {
        SortingTestSupport.assertSortShouldHandleSingleElement(HeapSort::sort);
    }

    @Test
    void sortShouldHandleDuplicatesAndNegativeNumbers() {
        SortingTestSupport.assertSortShouldHandleDuplicatesAndNegativeNumbers(HeapSort::sort);
    }

    @Test
    void sortShouldRejectNullInput() {
        SortingTestSupport.assertSortShouldRejectNullInput(HeapSort::sort);
    }
}
