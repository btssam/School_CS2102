package wpioo.lecture20.activity;

import java.util.*;

/**
 * A class that demonstrates the basic usage of {@link Map}s.
 *
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 2.0
 */
public class ExampleMapApplication {

    /**
     * The main entry point to the program.
     *
     * @param args
     *            Command line arguments
     */
    public static void main(String[] args) {
        // First few lines of "A Tale of Two Cities" by Charles Dickens
        String tale = """
                it was the best of times it was the worst of times
                it was the age of wisdom it was the age of foolishness
                it was the epoch of belief it was the epoch of incredulity
                it was the season of light it was the season of darkness
                it was the spring of hope it was the winter of despair
                we had everything before us we had nothing before us
                we were all going direct to heaven we were all going direct
                the other way in short the period was so far like the present
                period that some of its noisiest authorities insisted on its
                being received for good or for evil in the superlative degree
                of comparison only
                there were a king with a large jaw and a queen with a plain face
                on the throne of england there were a king with a large jaw and
                a queen with a fair face on the throne of france in both
                countries it was clearer than crystal to the lords of the state
                preserves of loaves and fishes that things in general were
                settled for ever""";

        // Use regex to filter out punctuation and newlines and split by space character
        String[] talesByWords = tale.replace("\n", " ").replaceAll("\"", "").replaceAll("[^\\sa-zA-Z0-9']", "")
                .split(" ");

        // First few lines of "Aesop's Fables"
        String aesop = """
                The Wolf and the Lamb
                WOLF, meeting with a Lamb astray from the fold, resolved not to
                lay violent hands on him, but to find some plea to justify to the
                Lamb the Wolf's right to eat him. He thus addressed him:
                "Sirrah, last year you grossly insulted me." "Indeed," bleated
                the Lamb in a mournful tone of voice, "I was not then born." Then
                said the Wolf, "You feed in my pasture." "No, good sir," replied
                the Lamb, "I have not yet tasted grass." Again said the Wolf,
                "You drink of my well." "No," exclaimed the Lamb, "I never yet
                drank water, for as yet my mother's milk is both food and drink
                to me." Upon which the Wolf seized him and ate him up, saying,
                "Well! I won't remain supperless, even though you refute every
                one of my imputations." The tyrant will always find a pretext for
                his tyranny.""";

        // Use regex to filter out punctuation and newlines and split by space character
        String[] aesopByWord = aesop.replace("\n", " ").replaceAll("\"", "").replaceAll("[^\\sa-zA-Z0-9']", "")
                .split(" ");

        // Task #1: Store the frequency of words (ignoring case) in each string
        System.out.println("----------------------------------------");
        Map<String, Integer> frequencyWordsTale = new HashMap<>();
        // TODO: Add words and frequency

        Map<String, Integer> frequencyWordsAesop = new HashMap<>();
        // TODO: Add words and frequency

        // Task #2: Find the word with the highest frequency (looping over keys)
        System.out.println("----------------------------------------");
        String highestFreqWordInTale = "";
        int highestFreqInTale = Integer.MIN_VALUE;
        // TODO: Loop over all keys
        System.out.println(
                "Word with highest frequency in Tale: " + highestFreqWordInTale + " (" + highestFreqInTale + ")");

        // Task #3: Find the word with the highest frequency (looping over key-value pairs)
        System.out.println("----------------------------------------");
        String highestFreqWordInAesop = "";
        int highestFreqInAesop = Integer.MIN_VALUE;
        // TODO: Loop over all key-value pairs
        System.out.println(
                "Word with highest frequency in Aesop: " + highestFreqWordInAesop + " (" + highestFreqInAesop + ")");

        // Task #4: Combining into one single map
        System.out.println("----------------------------------------");
        Map<String, Integer> combinedMap = new HashMap<>();
        // TODO: Combine into one single map

        String highestFreqWord = "";
        int highestFreq = Integer.MIN_VALUE;
        // TODO: Find word with highest frequency
        System.out.println("Word with highest frequency in Tale and Aesop combined: " + highestFreqWord + " ("
                + highestFreq + ")");

        // Task #5: Build inverse-lookup map
        System.out.println("----------------------------------------");
        Map<Integer, List<String>> inverseLookup = new TreeMap<>();
        // TODO: Loop from 1 to highestFreq and build an inverse look up map

        System.out.println(inverseLookup);
        System.out.println("----------------------------------------");
    }
}
