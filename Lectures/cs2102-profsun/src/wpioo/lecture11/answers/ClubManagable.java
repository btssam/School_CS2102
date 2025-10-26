package wpioo.lecture11.answers;

import java.util.List;

/**
 * This is an interface for a club management system.
 *
 * @author Prof. Matthew Ahrens
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public interface ClubManagable {

    /**
     * Stores additional "raw" club data into our club management system.
     *
     * @param data
     *            New data to be added
     */
    void intake(List<String> data);

    /**
     * Retrieves the most popular club in our club management system.
     *
     * @return A string that identifies the club
     */
    String mostPopular();

    /**
     * Counts the total number of unique clubs in our club management system.
     *
     * @return An integer
     */
    int uniqueClubs();

    /**
     * Retrieves a sorted list of emails for the specified club.
     *
     * @param clubName
     *            A club name
     *
     * @return A list of students participating in this club in alphabetical order by email
     */
    List<String> sortedEmails(String clubName);
}
