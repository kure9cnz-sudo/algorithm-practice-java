package stackqueue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ParenthesesCheckerTest {
    @Test
    void isBalancedShouldReturnTrueForNestedBalancedBrackets() {
        assertTrue(ParenthesesChecker.isBalanced("{[()()]}"));
    }

    @Test
    void isBalancedShouldIgnoreNonBracketCharacters() {
        assertTrue(ParenthesesChecker.isBalanced("if (a[0] == '{') { return true; }"));
    }

    @Test
    void isBalancedShouldReturnFalseForMismatchedBrackets() {
        assertFalse(ParenthesesChecker.isBalanced("([)]"));
    }

    @Test
    void isBalancedShouldReturnFalseForMissingOrExtraBracket() {
        assertFalse(ParenthesesChecker.isBalanced("(()"));
        assertFalse(ParenthesesChecker.isBalanced("())"));
    }

    @Test
    void isBalancedShouldHandleEmptyString() {
        assertTrue(ParenthesesChecker.isBalanced(""));
    }

    @Test
    void isBalancedShouldRejectNullInput() {
        assertThrows(IllegalArgumentException.class, () -> ParenthesesChecker.isBalanced(null));
    }
}
