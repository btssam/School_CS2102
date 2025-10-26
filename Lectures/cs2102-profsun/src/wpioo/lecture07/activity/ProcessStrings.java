package wpioo.lecture07.activity;

import java.util.List;

/**
 * A class for processing lists of strings
 *
 * @author Prof. Matthew Ahrens
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class ProcessStrings {

    /** The strings to process */
    public List<String> strings;

    /**
     * Constructs a string processor for some strings
     *
     * @param strings
     *            the strings to process
     */
    public ProcessStrings(List<String> strings) {
        this.strings = strings;
    }

    /**
     * Calculates the total characters in all the strings
     *
     * @return the number of characters total
     */
    public int totalCharacters() {
        return 0;
    }

    /**
     * finds the longest string in the list
     *
     * @return the longest string in the list (or "" if the list is empty). In the case that there are two longest
     *         strings, the first one that we encounter will be returned.
     */
    public String longestString() {
        return "";
    }

    /**
     * filters out only the strings that have a particular length
     *
     * @param length
     *            the length of strings to keep
     *
     * @return a *new* list of strings with the given length
     */
    public List<String> stringsWithLength(int length) {
        return null;
    }
}
