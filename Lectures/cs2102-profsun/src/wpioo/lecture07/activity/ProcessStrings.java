package wpioo.lecture07.activity;

import javax.annotation.processing.ProcessingEnvironment;
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
        //List<Integer> ints
        // int y : ints or Integer y: ints
        // Primitives: byte, char, short, int, long, float, double, boolean
        // Class Wrappers; Byte, Character, Short, Integer, Long, Float, Double, Boolean //??
        // this is a 'for each' loop
        int numChars = 0;
        for (String x : this.strings){
            numChars += x.length();
        }
        return numChars;
    }

    /**
     * finds the longest string in the list
     *
     * @return the longest string in the list (or "" if the list is empty). In the case that there are two longest
     *         strings, the "first one" (so we do > rather than >=) that we encounter will be returned.
     */
    public String longestString() {
        String longest = "";
        for(String s : this.strings){
            if (s.length() > longest.length()){
                longest = s;
            }
        }
        return longest;
        //longest = s.length() > longest.length() ? : s : longest;
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
        List<String> list = new LinkedList<>();
        for ( String s : this.strings){
            if (s.length() == length){
                list.add(s);
            }
        }
        return list;
    }

    @Override
    public String toString(){
        return String.format("Processing: %s", this.strings.toString());
    }


    @Override public boolean equals(Object o){
        if (o instanceof ProcessStrings sp){
            //List equal will cal each String equal for each item
            return this.strings.equals(sp.strings);
        }
        else{
            return false;
        }
    }
}
