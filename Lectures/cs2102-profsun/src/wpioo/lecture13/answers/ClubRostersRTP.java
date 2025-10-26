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
public class ClubRostersRTP extends ClubRostersTemplate implements ClubManagable {

    /**
     * This creates a new club management system.
     */
    public ClubRostersRTP() {
        super();
    }

    /**
     * Stores additional "raw" club data into our club management system.
     *
     * @param data
     *            New data to be added
     */
    public void intake(List<String> data) {
        super.intake(data);
        this.processData(); // instead of calling the three methods separately
    }
}
