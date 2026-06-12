package stackqueue;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ArrayStackTest {
    @Test
    void newStackShouldBeEmpty() {
        ArrayStack stack = new ArrayStack(3);

        assertTrue(stack.isEmpty());
        assertFalse(stack.isFull());
        assertEquals(0, stack.size());
        assertEquals(3, stack.capacity());
    }

    @Test
    void pushAndPopShouldFollowLifoOrder() {
        ArrayStack stack = new ArrayStack(3);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        assertTrue(stack.isFull());
        assertEquals(30, stack.pop());
        assertEquals(20, stack.pop());
        assertEquals(10, stack.pop());
        assertTrue(stack.isEmpty());
    }

    @Test
    void peekShouldReturnTopWithoutRemovingIt() {
        ArrayStack stack = new ArrayStack(2);

        stack.push(1);
        stack.push(2);

        assertEquals(2, stack.peek());
        assertEquals(2, stack.size());
        assertEquals(2, stack.pop());
    }

    @Test
    void pushShouldThrowWhenStackIsFull() {
        ArrayStack stack = new ArrayStack(1);
        stack.push(99);

        assertThrows(IllegalStateException.class, () -> stack.push(100));
    }

    @Test
    void popAndPeekShouldThrowWhenStackIsEmpty() {
        ArrayStack stack = new ArrayStack(1);

        assertThrows(NoSuchElementException.class, stack::pop);
        assertThrows(NoSuchElementException.class, stack::peek);
    }

    @Test
    void constructorShouldRejectNonPositiveCapacity() {
        assertThrows(IllegalArgumentException.class, () -> new ArrayStack(0));
        assertThrows(IllegalArgumentException.class, () -> new ArrayStack(-1));
    }
}
