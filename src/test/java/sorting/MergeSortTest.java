package sorting;

import org.junit.jupiter.api.Test;

class MergeSortTest {
    @Test
    void sortShouldOrderTypicalInputAndKeepOriginalUnchanged() {
        SortingTestSupport.assertSortShouldOrderTypicalInputAndKeepOriginalUnchanged(MergeSort::sort);
    }

    @Test
    void sortShouldHandleEmptyArray() {
        SortingTestSupport.assertSortShouldHandleEmptyArray(MergeSort::sort);
    }

    @Test
    void sortShouldHandleSingleElement() {
        SortingTestSupport.assertSortShouldHandleSingleElement(MergeSort::sort);
    }

    @Test
    void sortShouldHandleDuplicatesAndNegativeNumbers() {
        SortingTestSupport.assertSortShouldHandleDuplicatesAndNegativeNumbers(MergeSort::sort);
    }

    @Test
    void sortShouldRejectNullInput() {
        SortingTestSupport.assertSortShouldRejectNullInput(MergeSort::sort);
    }
}
