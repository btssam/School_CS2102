package wpioo.lecture22.answers;

import java.util.HashMap;
import java.util.Map;

/**
 * This class stores information about a book.
 *
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 2.0
 */
public class Book implements Comparable<Book> {

    /** Book name */
    private String bookName;

    /** Book data */
    private String bookData;

    /** Frequency table for words in the book */
    private Map<String, Integer> frequencyWordsBook;

    /**
     * This stores information related to a book.
     *
     * @param bookName
     *            Name of the book
     * @param bookData
     *            Content inside this book
     */
    public Book(String bookName, String bookData) {
        this.bookName = bookName;
        this.bookData = bookData;
        this.frequencyWordsBook = new HashMap<>();

        // Split by words by removing all punctuation.
        String[] wordsInBook = bookData.replace("\n", " ").replaceAll("\"", "").replaceAll("[^\\sa-zA-Z0-9']", "")
                .split(" ");
        for (String word : wordsInBook) {
            frequencyWordsBook.put(word.toLowerCase(), frequencyWordsBook.getOrDefault(word.toLowerCase(), 0) + 1);
        }
    }

    /**
     * This method implements the {@link Comparable#compareTo(Object)} method for this class.
     *
     * @return {@code -1} if {@link Book} is "less than" {@code o}, {@code 1} if {@link Book} is "greater than"
     *         {@code o} and {@code 0} if {@link Book} and {@code o} are equal (i.e., {@code this.equals(o) == true}).
     */
    @Override
    public int compareTo(Book o) {
        // 1) Compare book name
        int compareName = this.bookName.compareToIgnoreCase(o.bookName);
        if (compareName == 0) { // same name
            // 2) Compare book content (no need to compare maps, because if maps should be equal if content is equal)
            return this.bookData.compareToIgnoreCase(o.bookData);
        } else { // different name, so just return the results
            return compareName;
        }
    }

    /**
     * This returns the name of the book.
     *
     * @return A string
     */
    public String getBookName() {
        return bookName;
    }

    /**
     * This returns the contents of the book.
     *
     * @return A string
     */
    public String getBookData() {
        return bookData;
    }

    /**
     * This returns a string representation of the words' frequency.
     *
     * @return A string representation of the map
     */
    public String getFrequencyWordsBook() {
        StringBuilder sb = new StringBuilder();
        // Print data to console
        for (Map.Entry<String, Integer> wordFreq : frequencyWordsBook.entrySet()) {
            sb.append(wordFreq.getKey()).append(": ").append(wordFreq.getValue());
        }

        return sb.toString();
    }

    /**
     * This method overrides the {@link Object#equals(Object)} method for this class.
     *
     * @param o
     *            Another object
     *
     * @return {@code true} if {@code o} is-a {@link Book} and has the same information, {@code false} otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Book book = (Book) o;

        if (!bookName.equals(book.bookName))
            return false;
        if (!bookData.equals(book.bookData))
            return false;
        return frequencyWordsBook.equals(book.frequencyWordsBook);
    }

    /**
     * This method overrides the {@link Object#hashCode()} method for this class.
     *
     * @return Hash code value for this {@link Book}.
     */
    @Override
    public int hashCode() {
        int result = bookName.hashCode();
        result = 31 * result + bookData.hashCode();
        result = 31 * result + frequencyWordsBook.hashCode();
        return result;
    }

    /**
     * This method overrides the {@link Object#toString()} method for this class.
     *
     * @return A string representation of a {@link Book}.
     */
    @Override
    public String toString() {
        return "Book Name: " + bookName + "\n" + frequencyWordsBook.toString();
    }
}
