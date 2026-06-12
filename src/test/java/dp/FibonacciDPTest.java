package dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FibonacciDPTest {
    @Test
    void fibShouldReturnBaseCases() {
        assertEquals(0L, FibonacciDP.fib(0));
        assertEquals(1L, FibonacciDP.fib(1));
    }

    @Test
    void fibShouldReturnSmallKnownValues() {
        assertEquals(1L, FibonacciDP.fib(2));
        assertEquals(5L, FibonacciDP.fib(5));
        assertEquals(55L, FibonacciDP.fib(10));
    }

    @Test
    void fibShouldReturnLargerKnownValue() {
        assertEquals(12_586_269_025L, FibonacciDP.fib(50));
    }

    @Test
    void fibShouldRejectNegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> FibonacciDP.fib(-1));
    }

    @Test
    void fibShouldRejectInputThatWouldOverflowLong() {
        assertThrows(IllegalArgumentException.class, () -> FibonacciDP.fib(93));
    }
}
