package hashtable;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FrequencyCounterTest {
    @Test
    void countFrequenciesShouldCountTypicalCharacters() {
        assertEquals(Map.of('b', 1, 'a', 3, 'n', 2), FrequencyCounter.countFrequencies("banana"));
    }

    @Test
    void countFrequenciesShouldReturnEmptyMapForEmptyString() {
        assertTrue(FrequencyCounter.countFrequencies("").isEmpty());
    }

    @Test
    void countFrequenciesShouldCountSpacesAndPunctuation() {
        assertEquals(Map.of('a', 2, ' ', 1, '!', 1), FrequencyCounter.countFrequencies("a a!"));
    }

    @Test
    void countFrequenciesShouldBeCaseSensitive() {
        assertEquals(Map.of('A', 2, 'a', 1), FrequencyCounter.countFrequencies("AaA"));
    }

    @Test
    void countFrequenciesShouldRejectNullInput() {
        assertThrows(IllegalArgumentException.class, () -> FrequencyCounter.countFrequencies(null));
    }
}
