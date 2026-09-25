import org.example.WordCounter;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class WordCounterTest {

    @Test
    void shouldCountWords() {
        WordCounter counter = new WordCounter();

        counter.countWords("hello world hello");

        assertEquals(2, counter.getCount("hello"));
        assertEquals(1, counter.getCount("world"));
    }

    @Test
    void shouldReturnZeroForUnknownWord() {
        WordCounter counter = new WordCounter();

        counter.countWords("hello world");

        assertEquals(0, counter.getCount("java"));
    }

    @Test
    void shouldReturnMostFrequentWord() {
        WordCounter counter = new WordCounter();

        counter.countWords("java java python java python");

        assertEquals("java", counter.getMostFrequent());
    }

    @Test
    void shouldReturnWordsAboveNumber() {
        WordCounter counter = new WordCounter();

        counter.countWords("java java java python python");

        Map<String, Integer> result = counter.getWordsAbove(2);

        assertEquals(1, result.size());
        assertEquals(3, result.get("java"));
    }

    @Test
    void shouldWorkWithUpperCase() {
        WordCounter counter = new WordCounter();

        counter.countWords("Java java JAVA");

        assertEquals(3, counter.getCount("java"));
    }
}
