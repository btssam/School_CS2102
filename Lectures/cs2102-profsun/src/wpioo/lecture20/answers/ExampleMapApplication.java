package wpioo.lecture20.answers;

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
                the other wayin short the period was so far like the present
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
        for (String word : talesByWords) {
            // Case 1: First time that we are seeing the word
            if (!frequencyWordsTale.containsKey(word)) {
                frequencyWordsTale.put(word.toLowerCase(), 1);
            }
            // Case 2: Not the first time, so I will increment it by 1
            else {
                frequencyWordsTale.put(word.toLowerCase(), frequencyWordsTale.get(word.toLowerCase()) + 1);
            }
        }
        System.out.println(frequencyWordsTale);

        Map<String, Integer> frequencyWordsAesop = new HashMap<>();
        for (String word : aesopByWord) {
            frequencyWordsAesop.put(word.toLowerCase(), frequencyWordsAesop.getOrDefault(word, 0) + 1);
        }
        System.out.println(frequencyWordsAesop);

        // Task #2: Find the word with the highest frequency (looping over keys)
        System.out.println("----------------------------------------");
        String highestFreqWordInTale = "";
        int highestFreqInTale = Integer.MIN_VALUE;
        for (String key : frequencyWordsTale.keySet()) {
            if (frequencyWordsTale.get(key) > highestFreqInTale) {
                highestFreqInTale = frequencyWordsTale.get(key);
                highestFreqWordInTale = key;
            }
        }
        System.out.println(
                "Word with highest frequency in Tale: " + highestFreqWordInTale + " (" + highestFreqInTale + ")");

        // Task #3: Find the word with the highest frequency (looping over key-value pairs)
        System.out.println("----------------------------------------");
        String highestFreqWordInAesop = "";
        int highestFreqInAesop = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : frequencyWordsAesop.entrySet()) {
            if (entry.getValue() > highestFreqInAesop) {
                highestFreqWordInAesop = entry.getKey();
                highestFreqInAesop = entry.getValue();
            }
        }
        System.out.println(
                "Word with highest frequency in Aesop: " + highestFreqWordInAesop + " (" + highestFreqInAesop + ")");

        // Task #4: Combining into one single map
        System.out.println("----------------------------------------");
        Map<String, Integer> combinedMap = new HashMap<>(frequencyWordsTale);
        for (Map.Entry<String, Integer> entry : frequencyWordsAesop.entrySet()) {
            // Case 1: Common word in tale
            if (combinedMap.containsKey(entry.getKey())) {
                combinedMap.put(entry.getKey(), combinedMap.get(entry.getKey()) + entry.getValue());
            }
            // Case 2: Word not in tale
            else {
                combinedMap.put(entry.getKey(), entry.getValue());
            }
        }
        System.out.println(combinedMap);

        String highestFreqWord = "";
        int highestFreq = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : combinedMap.entrySet()) {
            if (entry.getValue() > highestFreq) {
                highestFreq = entry.getValue();
                highestFreqWord = entry.getKey();
            }
        }
        System.out.println("Word with highest frequency in Tale and Aesop combined: " + highestFreqWord + " ("
                + highestFreq + ")");

        // Task #5: Build inverse-lookup map
        System.out.println("----------------------------------------");
        // Frequency -> List of words with this frequency
        Map<Integer, List<String>> inverseLookup = new TreeMap<>();
        for (Map.Entry<String, Integer> entry : combinedMap.entrySet()) {
            // Case 1: frequency exists in the inverseLookup map
            if (inverseLookup.containsKey(entry.getValue())) {
                List<String> words = inverseLookup.get(entry.getValue()); // list of words with this frequency
                words.add(entry.getKey());
                inverseLookup.put(entry.getValue(), words); // update
            }
            // Case 2: Nope, first time seeing this frequency
            else {
                List<String> words = new ArrayList<>();
                words.add(entry.getKey());
                inverseLookup.put(entry.getValue(), words);
            }
        }

        System.out.println(inverseLookup);
        System.out.println("----------------------------------------");
    }
}
