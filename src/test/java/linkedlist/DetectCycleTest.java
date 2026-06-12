package linkedlist;

import org.junit.jupiter.api.Test;

import static linkedlist.LinkedListTestSupport.list;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DetectCycleTest {
    @Test
    void hasCycleShouldReturnFalseForEmptyList() {
        assertFalse(DetectCycle.hasCycle(null));
    }

    @Test
    void hasCycleShouldReturnFalseForSingleNodeWithoutCycle() {
        assertFalse(DetectCycle.hasCycle(new ListNode(1)));
    }

    @Test
    void hasCycleShouldReturnTrueForSingleNodePointingToItself() {
        ListNode node = new ListNode(1);
        node.next = node;

        assertTrue(DetectCycle.hasCycle(node));
    }

    @Test
    void hasCycleShouldReturnFalseForLongListWithoutCycle() {
        assertFalse(DetectCycle.hasCycle(list(1, 2, 3, 4, 5)));
    }

    @Test
    void hasCycleShouldReturnTrueForCycleToMiddleNode() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second;

        assertTrue(DetectCycle.hasCycle(first));
    }
}
