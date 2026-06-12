package search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BinarySearchTest {
    @Test
    void indexOfShouldFindExistingValueInTypicalInput() {
        assertEquals(3, BinarySearch.indexOf(new int[]{1, 3, 5, 7, 9}, 7));
    }

    @Test
    void indexOfShouldReturnMinusOneWhenValueIsMissing() {
        assertEquals(-1, BinarySearch.indexOf(new int[]{1, 3, 5, 7, 9}, 4));
    }

    @Test
    void indexOfShouldHandleEmptyArrayAndSingleElementArray() {
        assertEquals(-1, BinarySearch.indexOf(new int[0], 1));
        assertEquals(0, BinarySearch.indexOf(new int[]{8}, 8));
        assertEquals(-1, BinarySearch.indexOf(new int[]{8}, 9));
    }

    @Test
    void indexOfShouldReturnAnyMatchingIndexForDuplicates() {
        int index = BinarySearch.indexOf(new int[]{1, 2, 2, 2, 3}, 2);

        assertTrue(index >= 1 && index <= 3);
    }

    @Test
    void indexOfShouldRejectNullArray() {
        assertThrows(IllegalArgumentException.class, () -> BinarySearch.indexOf(null, 1));
    }
}
