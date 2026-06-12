package dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LongestCommonSubsequenceTest {
    @Test
    void lengthShouldReturnTypicalLcsLength() {
        assertEquals(4, LongestCommonSubsequence.length("ABCBDAB", "BDCABA"));
    }

    @Test
    void lengthShouldReturnZeroWhenEitherStringIsEmpty() {
        assertEquals(0, LongestCommonSubsequence.length("", "abc"));
        assertEquals(0, LongestCommonSubsequence.length("abc", ""));
        assertEquals(0, LongestCommonSubsequence.length("", ""));
    }

    @Test
    void lengthShouldReturnZeroWhenThereIsNoCommonSubsequence() {
        assertEquals(0, LongestCommonSubsequence.length("abc", "XYZ"));
    }

    @Test
    void lengthShouldHandleRepeatedCharacters() {
        assertEquals(2, LongestCommonSubsequence.length("aaaa", "aa"));
    }

    @Test
    void lengthShouldBeCaseSensitive() {
        assertEquals(0, LongestCommonSubsequence.length("abc", "ABC"));
    }

    @Test
    void lengthShouldRejectNullInputs() {
        assertThrows(IllegalArgumentException.class, () -> LongestCommonSubsequence.length(null, "abc"));
        assertThrows(IllegalArgumentException.class, () -> LongestCommonSubsequence.length("abc", null));
    }
}
