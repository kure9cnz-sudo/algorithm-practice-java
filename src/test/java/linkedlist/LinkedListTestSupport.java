package linkedlist;

import java.util.ArrayList;
import java.util.List;

final class LinkedListTestSupport {
    private LinkedListTestSupport() {
    }

    static ListNode list(int... values) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int value : values) {
            current.next = new ListNode(value);
            current = current.next;
        }
        return dummy.next;
    }

    static int[] toArray(ListNode head) {
        List<Integer> values = new ArrayList<>();
        ListNode current = head;
        int guard = 0;
        while (current != null && guard < 100) {
            values.add(current.value);
            current = current.next;
            guard++;
        }
        return values.stream().mapToInt(Integer::intValue).toArray();
    }
}
