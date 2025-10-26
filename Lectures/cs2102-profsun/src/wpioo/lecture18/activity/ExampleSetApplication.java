package wpioo.lecture18.activity;

import java.util.HashSet;
import java.util.Set;

/**
 * A class that demonstrates the basic usage of {@link Set}s.
 *
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class ExampleSetApplication {

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
                a queen with a fair face on the throne of france  in both
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

        // Task #1: Find the unique words (ignoring case) in each string
        System.out.println("----------------------------------------");
        Set<String> uniqueTale = new HashSet<>();
        System.out.println("Unique Words in Tale: " + uniqueTale);

        Set<String> uniqueAesop = new HashSet<>();
        System.out.println("Unique Words in Aesop: " + uniqueAesop);

        // Task #2: Union (unique words that appear in either Tale or Aesop)
        System.out.println("----------------------------------------");
        Set<String> union = new HashSet<>();
        System.out.println("Unique Words in Either Tale or Aesop: " + union);

        // Task #3: Intersection (unique words that appear in both Tale and Aesop)
        System.out.println("----------------------------------------");
        Set<String> intersection = new HashSet<>();
        System.out.println("Unique Words in Both Tale and Aesop: " + intersection);

        // Task #4a: Difference (unique words in Tale that does not appear in Aesop)
        System.out.println("----------------------------------------");
        Set<String> difference1 = new HashSet<>();
        System.out.println("Unique Words in Tale That Doesn't Appear in Aesop: " + difference1);

        // Task #4b: Difference (unique words in Aesop that does not appear in Tale)
        Set<String> difference2 = new HashSet<>();
        System.out.println("Unique Words in Aesop That Doesn't Appear in Tale: " + difference2);

        System.out.println("----------------------------------------");
    }
}
