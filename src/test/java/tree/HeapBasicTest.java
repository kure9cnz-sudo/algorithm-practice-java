package tree;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HeapBasicTest {
    @Test
    void newHeapShouldBeEmpty() {
        HeapBasic heap = new HeapBasic(3);

        assertTrue(heap.isEmpty());
        assertEquals(0, heap.size());
    }

    @Test
    void insertAndPeekMinShouldKeepSmallestValueAtRoot() {
        HeapBasic heap = new HeapBasic(4);

        heap.insert(5);
        heap.insert(3);
        heap.insert(8);
        heap.insert(1);

        assertFalse(heap.isEmpty());
        assertEquals(4, heap.size());
        assertEquals(1, heap.peekMin());
        assertEquals(4, heap.size());
    }

    @Test
    void extractMinShouldReturnValuesInAscendingOrder() {
        HeapBasic heap = new HeapBasic(5);
        for (int value : new int[]{4, 1, 3, 2, 5}) {
            heap.insert(value);
        }

        assertEquals(1, heap.extractMin());
        assertEquals(2, heap.extractMin());
        assertEquals(3, heap.extractMin());
        assertEquals(4, heap.extractMin());
        assertEquals(5, heap.extractMin());
        assertTrue(heap.isEmpty());
    }

    @Test
    void heapShouldHandleDuplicateValues() {
        HeapBasic heap = new HeapBasic(4);
        heap.insert(2);
        heap.insert(1);
        heap.insert(2);
        heap.insert(1);

        assertEquals(1, heap.extractMin());
        assertEquals(1, heap.extractMin());
        assertEquals(2, heap.extractMin());
        assertEquals(2, heap.extractMin());
    }

    @Test
    void peekMinAndExtractMinShouldThrowWhenHeapIsEmpty() {
        HeapBasic heap = new HeapBasic(1);

        assertThrows(NoSuchElementException.class, heap::peekMin);
        assertThrows(NoSuchElementException.class, heap::extractMin);
    }

    @Test
    void insertShouldThrowWhenHeapIsFull() {
        HeapBasic heap = new HeapBasic(1);
        heap.insert(1);

        assertThrows(IllegalStateException.class, () -> heap.insert(2));
    }

    @Test
    void constructorShouldRejectNonPositiveCapacity() {
        assertThrows(IllegalArgumentException.class, () -> new HeapBasic(0));
        assertThrows(IllegalArgumentException.class, () -> new HeapBasic(-1));
    }
}
