package wpioo.lecture11.answers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * This class implements {@link ClubManagable} to provide a club management system.
 *
 * @author Prof. Matthew Ahrens
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class ClubRosters implements ClubManagable {

    /** A list of "raw" data */
    public List<String> intakeData;

    /** A list of clubs with roster information */
    public List<ClubRoster> sortedData;

    /**
     * This creates a new club management system.
     */
    public ClubRosters() {
        this.intakeData = new ArrayList<>();
        this.sortedData = new LinkedList<>();
    }

    /**
     * Stores additional "raw" club data into our club management system.
     *
     * @param data
     *            New data to be added
     */
    public void intake(List<String> data) {
        this.intakeData.addAll(data);
    }

    /**
     * Cleaning the data so we remove any non-WPI addresses.
     */
    public void clean() {
        // Loop and remove all non-WPI email addresses
        List<String> cleanData = new ArrayList<>(this.intakeData.size()); // default size of whatever size intakeData is
        for (int i = 0; i < this.intakeData.size(); i += 2) {
            // Search for any WPI email address
            if (this.intakeData.get(i).endsWith("@wpi.edu")) {
                cleanData.add(this.intakeData.get(i)); // email address
                cleanData.add(this.intakeData.get(i + 1)); // club name
            }
        }

        this.intakeData = cleanData; // replace my "raw" data to a clean data with just WPI students
    }

    /**
     * Process the intake data and place into {@link ClubRoster} objects.
     */
    public void parse() {
        for (int i = 0; i < this.intakeData.size(); i += 2) {
            ClubRoster club = findOrCreate(this.intakeData.get(i + 1)); // Locate the club
            club.addEmail(this.intakeData.get(i));
        }

        this.intakeData.clear(); // Get of all "raw" data that we parsed
    }

    /**
     * A helper method for locating and returning a {@link ClubRoster}. If the club does not exist, we create one before
     * returning it.
     *
     * @param name
     *            Club name
     *
     * @return A {@link ClubRoster} with this name
     */
    public ClubRoster findOrCreate(String name) {
        // Loop through all existing clubs
        for (ClubRoster club : this.sortedData) {
            // Attempt to find a club that matches the specified name
            if (club.getClubName().equals(name)) {
                return club;
            }
        }

        // Creating a new club
        ClubRoster newClub = new ClubRoster(name);
        this.sortedData.add(newClub);

        return newClub;
    }

    /**
     * Sort each {@link ClubRoster}'s email addresses.
     */
    public void sort() {
        for (ClubRoster club : this.sortedData) {
            club.sort();
        }
    }

    /**
     * Retrieves the most popular club in our club management system.
     *
     * @return A string that identifies the club
     */
    public String mostPopular() {
        this.clean(); // Eliminating non-WPI email addresses
        this.parse(); // Converting "raw" data into ClubRoster objects
        this.sort();

        // Special Case: No clubs
        if (this.sortedData.isEmpty()) {
            return "N/A";
        } else {
            ClubRoster mostPopularSoFar = this.sortedData.get(0);
            for (ClubRoster club : this.sortedData) {
                // Most email addresses win
                if (club.size() > mostPopularSoFar.size()) {
                    mostPopularSoFar = club;
                }
            }

            return mostPopularSoFar.getClubName();
        }
    }

    /**
     * Counts the total number of unique clubs in our club management system.
     *
     * @return An integer
     */
    public int uniqueClubs() {
        List<String> clubs = new LinkedList<>();
        for (int i = 0; i < this.intakeData.size(); i += 2) {
            if (this.intakeData.get(i).endsWith("@wpi.edu") && !clubs.contains(this.intakeData.get(i + 1))) {
                clubs.add(this.intakeData.get(i + 1));
            }
        }
        return clubs.size();
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
        List<String> emails = new LinkedList<>();
        for (int i = 0; i < this.intakeData.size(); i += 2) {
            if (intakeData.get(i).endsWith("@wpi.edu") && intakeData.get(i + 1).equals(clubName)) {
                emails.add(intakeData.get(i));
            }
        }
        emails.sort(String::compareTo);
        return emails;
    }
}
