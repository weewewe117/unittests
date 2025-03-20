import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WordCounterTest {

    @Test
    void testNullInput() {
        assertEquals(0, WordCounter.countWords(null));
    }

    @Test
    void testEmptyString() {
        assertEquals(0, WordCounter.countWords(""));
    }

    @Test
    void testOnlyNumbers() {
        assertEquals(0, WordCounter.countWords("0098766JANNSX"));
    }

    @Test
    void testShortWords() {
        assertEquals(0, WordCounter.countWords("[-W0SU"));
    }

    @Test
    void testValidWords() {
        assertEquals(2, WordCounter.countWords("9pqus"));
    }

    @Test
    void testMixedWithNumbers() {
        assertEquals(1, WordCounter.countWords("aslkchlkh1234558l]]"));
    }

    @Test
    void testPunctuation() {
        assertEquals(2, WordCounter.countWords("sfv"));
    }

    @Test
    void testComplexCase() {
        assertEquals(3, WordCounter.countWords("asacsac"));
    }
    
}
