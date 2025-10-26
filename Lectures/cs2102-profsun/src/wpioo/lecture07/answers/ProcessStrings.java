package wpioo.lecture07.answers;

import java.util.LinkedList;
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
        int totalCharacters = 0;
        for (String s : this.strings) {
            totalCharacters += s.length(); // totalCharacters = totalCharacters + s.length();
        }

        return totalCharacters;
    }

    /**
     * finds the longest string in the list
     *
     * @return the longest string in the list (or "" if the list is empty). In the case that there are two longest
     *         strings, the first one that we encounter will be returned.
     */
    public String longestString() {
        String longest = "";
        for (String s : this.strings) {
            if (s.length() > longest.length()) {
                longest = s;
            }
            // longest = s.length() > longest.length() ? s : longest;
        }

        return longest;
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
        List<String> list = new LinkedList<>(); // creating a new one
        for (String s : this.strings) {
            if (s.length() == length) { // == is ok here because I am comparing ints
                list.add(s); // add method is adding a new string at the end of the list
            }
        }

        return list;
    }
}
