package linkedlist;

import org.junit.jupiter.api.Test;

import static linkedlist.LinkedListTestSupport.list;
import static linkedlist.LinkedListTestSupport.toArray;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

class MergeTwoSortedListsTest {
    @Test
    void mergeShouldMergeTwoTypicalSortedLists() {
        ListNode first = list(1, 3, 5);
        ListNode second = list(2, 4, 6);

        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, toArray(MergeTwoSortedLists.merge(first, second)));
    }

    @Test
    void mergeShouldReturnSecondListWhenFirstIsEmpty() {
        ListNode second = list(1, 2, 3);

        assertSame(second, MergeTwoSortedLists.merge(null, second));
    }

    @Test
    void mergeShouldReturnFirstListWhenSecondIsEmpty() {
        ListNode first = list(1, 2, 3);

        assertSame(first, MergeTwoSortedLists.merge(first, null));
    }

    @Test
    void mergeShouldReturnNullWhenBothListsAreEmpty() {
        assertNull(MergeTwoSortedLists.merge(null, null));
    }

    @Test
    void mergeShouldHandleDuplicatesAndNegativeValues() {
        ListNode first = list(-3, -1, 2, 2);
        ListNode second = list(-2, 2, 4);

        assertArrayEquals(new int[]{-3, -2, -1, 2, 2, 2, 4}, toArray(MergeTwoSortedLists.merge(first, second)));
    }
}
