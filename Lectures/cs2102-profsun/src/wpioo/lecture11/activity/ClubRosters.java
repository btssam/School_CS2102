package wpioo.lecture11.activity;

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
    public List<String> data;

    /**
     * This creates a new club management system.
     *
     * @param data
     *            A list of "raw" data
     */
    public ClubRosters(List<String> data) {
        this.data = data;
    }

    /**
     * Stores additional "raw" club data into our club management system.
     *
     * @param data
     *            New data to be added
     */
    public void intake(List<String> data) {
        this.data.addAll(data);
    }

    /**
     * Retrieves the most popular club in our club management system.
     *
     * @return A string that identifies the club
     */
    public String mostPopular() {
        List<String> clubs = new LinkedList<>();
        List<Integer> counts = new LinkedList<>();
        for (int i = 0; i < this.data.size(); i += 2) {
            String email = this.data.get(i);
            String club = this.data.get(i + 1);
            if (email.endsWith("@wpi.edu") && !clubs.contains(club)) {
                clubs.add(club);
                counts.add(1);
            } else if (email.endsWith("@wpi.edu")) {
                counts.set(clubs.indexOf(club), counts.get(clubs.indexOf(club)) + 1);
            }
        }

        int biggestCount = 0;
        String biggestClub = "N/A";
        for (int i = 0; i < clubs.size(); i++) {
            if (counts.get(i) > biggestCount) {
                biggestCount = counts.get(i);
                biggestClub = clubs.get(i);
            }
        }

        return biggestClub;
    }

    /**
     * Counts the total number of unique clubs in our club management system.
     *
     * @return An integer
     */
    public int uniqueClubs() {
        List<String> clubs = new LinkedList<>();
        for (int i = 0; i < this.data.size(); i += 2) {
            if (this.data.get(i).endsWith("@wpi.edu") && !clubs.contains(this.data.get(i + 1))) {
                clubs.add(this.data.get(i + 1));
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
        for (int i = 0; i < this.data.size(); i += 2) {
            if (data.get(i).endsWith("@wpi.edu") && data.get(i + 1).equals(clubName)) {
                emails.add(data.get(i));
            }
        }
        emails.sort(String::compareTo);
        return emails;
    }
}
