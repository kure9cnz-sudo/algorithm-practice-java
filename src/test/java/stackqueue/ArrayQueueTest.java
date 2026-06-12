package stackqueue;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ArrayQueueTest {
    @Test
    void newQueueShouldBeEmpty() {
        ArrayQueue queue = new ArrayQueue(3);

        assertTrue(queue.isEmpty());
        assertFalse(queue.isFull());
        assertEquals(0, queue.size());
        assertEquals(3, queue.capacity());
    }

    @Test
    void offerAndPollShouldFollowFifoOrder() {
        ArrayQueue queue = new ArrayQueue(3);

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        assertTrue(queue.isFull());
        assertEquals(10, queue.poll());
        assertEquals(20, queue.poll());
        assertEquals(30, queue.poll());
        assertTrue(queue.isEmpty());
    }

    @Test
    void queueShouldReuseFreedSlotsAfterWrapAround() {
        ArrayQueue queue = new ArrayQueue(3);

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        assertEquals(1, queue.poll());
        queue.offer(4);

        assertEquals(2, queue.poll());
        assertEquals(3, queue.poll());
        assertEquals(4, queue.poll());
    }

    @Test
    void peekShouldReturnFrontWithoutRemovingIt() {
        ArrayQueue queue = new ArrayQueue(2);

        queue.offer(7);
        queue.offer(8);

        assertEquals(7, queue.peek());
        assertEquals(2, queue.size());
        assertEquals(7, queue.poll());
    }

    @Test
    void offerShouldThrowWhenQueueIsFull() {
        ArrayQueue queue = new ArrayQueue(1);
        queue.offer(99);

        assertThrows(IllegalStateException.class, () -> queue.offer(100));
    }

    @Test
    void pollAndPeekShouldThrowWhenQueueIsEmpty() {
        ArrayQueue queue = new ArrayQueue(1);

        assertThrows(NoSuchElementException.class, queue::poll);
        assertThrows(NoSuchElementException.class, queue::peek);
    }

    @Test
    void constructorShouldRejectNonPositiveCapacity() {
        assertThrows(IllegalArgumentException.class, () -> new ArrayQueue(0));
        assertThrows(IllegalArgumentException.class, () -> new ArrayQueue(-1));
    }
}
