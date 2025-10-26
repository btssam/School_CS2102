package wpioo.lecture11.answers;

import java.util.LinkedList;
import java.util.List;

/**
 * This class stores information about a club.
 *
 * @author Prof. Matthew Ahrens
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class ClubRoster {

    /** The name of the club */
    public String clubName;

    /** A list of member emails */
    public List<String> emails;

    /**
     * This creates a new club.
     *
     * @param clubName
     *            The name of the club
     */
    public ClubRoster(String clubName) {
        this.clubName = clubName;
        this.emails = new LinkedList<>();
    }

    /**
     * Registers a new email account to our club.
     *
     * @param email
     *            A string containing an email address
     */
    public void addEmail(String email) {
        this.emails.add(email);
    }

    /**
     * Gets the club name.
     *
     * @return A string representing the club's name
     */
    public String getClubName() {
        return this.clubName;
    }

    /**
     * Gets the list of registered members.
     *
     * @return A copy of the list of registered members to avoid people tampering our club's email list.
     */
    public List<String> getEmails() {
        return new LinkedList<>(this.emails);
    }

    /**
     * Gets the number of registered members.
     *
     * @return An integer
     */
    public int size() {
        return this.emails.size();
    }

    /**
     * A helper method that sorts the emails in alphabetical order.
     */
    public void sort() {
        this.emails.sort(String::compareTo);
    }
}
