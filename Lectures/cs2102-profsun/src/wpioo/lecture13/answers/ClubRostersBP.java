package wpioo.lecture13.answers;

import java.util.List;

/**
 * This class implements {@link ClubManagable} to provide a club management system.
 *
 * @author Prof. Matthew Ahrens
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class ClubRostersBP extends ClubRostersTemplate implements ClubManagable {

    /**
     * This creates a new club management system.
     */
    public ClubRostersBP() {
        super(); // constructor from ClubRostersTemplate
    }

    /**
     * Retrieves the most popular club in our club management system.
     *
     * @return A string that identifies the club
     */
    public String mostPopular() {
        this.processData(); // instead of calling the three methods separately
        return super.mostPopular();
    }

    /**
     * Counts the total number of unique clubs in our club management system.
     *
     * @return An integer
     */
    public int uniqueClubs() {
        this.processData(); // instead of calling the three methods separately
        return super.uniqueClubs();
    }

    /**
     * Retrieves a sorted list of emails for the specified club.
     *
     * @param clubName
     *            A club name
     *
     * @return A list of students participating in this club in alphabetical order by email
     */
    public List<String> sortedEmails(String clubName) {
        this.processData(); // instead of calling the three methods separately
        return super.sortedEmails(clubName);
    }
}
