package wpioo.lecture07.answers;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * This class contains our JUnit test methods.
 *
 * @author Prof. Matthew Ahrens
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class Examples {

    /** A class for processing lists of strings that contains no strings */
    public ProcessStrings psEmpty = new ProcessStrings(List.of());

    /** A class for processing lists of strings that contains some strings */
    public ProcessStrings psNonEmpty = new ProcessStrings(List.of("hello", "every", "CS", "2102", "student"));

    /** A class for processing lists of strings that contains strings of equal length */
    public ProcessStrings psAllSameLength = new ProcessStrings(List.of("maybe", "lunch", "later"));

    /**
     * This test case that checks we return the total number of characters for an empty list.
     */
    @Test
    public void testProcessStringsTotalCharactersEmpty() {
        assertEquals(0, psEmpty.totalCharacters());
    }

    /**
     * This test case that checks we return the total number of characters for a list of strings.
     */
    @Test
    public void testProcessStringsTotalCharactersNonEmpty() {
        assertEquals(23, psNonEmpty.totalCharacters());
    }

    /**
     * This test case that checks we return the total number of characters for a list with strings of the same length.
     */
    @Test
    public void testProcessStringsTotalCharactersSameLength() {
        assertEquals(15, psAllSameLength.totalCharacters());
    }

    /**
     * This test case that checks we return the correct string for an empty list.
     */
    @Test
    public void testProcessStringsLongestStringEmpty() {
        assertEquals("", psEmpty.longestString());
    }

    /**
     * This test case that checks we return the correct string for a list of strings.
     */
    @Test
    public void testProcessStringsLongestStringNonEmpty() {
        assertEquals("student", psNonEmpty.longestString());
    }

    /**
     * This test case that checks we return the correct string for a list with strings of the same length.
     */
    @Test
    public void testProcessStringsLongestStringSameLength() {
        assertEquals("maybe", psAllSameLength.longestString());
    }

    /**
     * This test case that checks we return all strings of length 5 with an empty list.
     */
    @Test
    public void testProcessStringsStringWithLength5Empty() {
        assertEquals(List.of(), psEmpty.stringsWithLength(5));
    }

    /**
     * This test case that checks we return all strings of length 5 with a list of strings.
     */
    @Test
    public void testProcessStringsStringWithLength5NonEmpty() {
        assertEquals(List.of("hello", "every"), psNonEmpty.stringsWithLength(5));
    }

    /**
     * This test case that checks we return all strings of length 5 with strings of the same length.
     */
    @Test
    public void testProcessStringsStringWithLength5SameLength() {
        assertEquals(List.of("maybe", "lunch", "later"), psAllSameLength.stringsWithLength(5));
        // assertEquals(psAllSameLength.strings, ...);
    }

    /**
     * This test case that checks we return all strings of with the longest length.
     */
    @Test
    public void testProcessStringsStringWithLengthLongestLength() {
        assertEquals(List.of("maybe", "lunch", "later"),
                psAllSameLength.stringsWithLength(psAllSameLength.longestString().length()));
    }
}
