package linkedlist;

import org.junit.jupiter.api.Test;

import static linkedlist.LinkedListTestSupport.list;
import static linkedlist.LinkedListTestSupport.toArray;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

class ReverseLinkedListTest {
    @Test
    void reverseShouldReverseTypicalList() {
        ListNode head = list(1, 2, 3, 4);

        assertArrayEquals(new int[]{4, 3, 2, 1}, toArray(ReverseLinkedList.reverse(head)));
    }

    @Test
    void reverseShouldHandleSingleNode() {
        ListNode head = new ListNode(42);

        assertSame(head, ReverseLinkedList.reverse(head));
        assertNull(head.next);
    }

    @Test
    void reverseShouldHandleEmptyList() {
        assertNull(ReverseLinkedList.reverse(null));
    }

    @Test
    void reverseShouldHandleDuplicateValues() {
        ListNode head = list(2, 2, 3, 3);

        assertArrayEquals(new int[]{3, 3, 2, 2}, toArray(ReverseLinkedList.reverse(head)));
    }

    @Test
    void reverseShouldReuseOriginalNodes() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        first.next = second;
        second.next = third;

        ListNode reversed = ReverseLinkedList.reverse(first);

        assertSame(third, reversed);
        assertSame(second, reversed.next);
        assertSame(first, reversed.next.next);
        assertNull(first.next);
    }
}
