package wpioo.lecture13.answers;

import java.util.ArrayList;
import java.util.List;

/**
 * This class extends {@link CSClubRostersBP} to provide a club management system for CS clubs.
 *
 * @author Prof. Matthew Ahrens
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class CSClubRostersBP extends ClubRostersBP {

    /** A list of CS clubs */
    public List<String> csClubs;

    /**
     * This creates a new club management system for CS clubs.
     */
    public CSClubRostersBP(List<String> csClubs) {
        super(); // calling ClubRostersBP constructor
        this.csClubs = csClubs;
    }

    /**
     * Cleaning the data so we remove any non-CS clubs and any non-WPI addresses.
     */
    @Override
    public void clean() {
        // Loop and remove non-CS clubs
        List<String> cleanData = new ArrayList<>(this.intakeData.size());
        for (int i = 0; i < this.intakeData.size(); i += 2) {
            // Check to see if it is a CS club
            if (this.csClubs.contains(this.intakeData.get(i + 1))) {
                cleanData.add(this.intakeData.get(i));
                cleanData.add(this.intakeData.get(i + 1));
            }
        }
        this.intakeData = cleanData;

        super.clean(); // Run the parent implementation of clean
    }
}
