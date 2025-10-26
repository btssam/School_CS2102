package wpioo.lecture11.answers;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This class contains our JUnit test methods.
 *
 * @author Prof. Matthew Ahrens
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class Examples {

    /** A list of raw data which contains emails and club information */
    List<String> rawData = List.of("a@wpi.edu", "Bionics", "b@wpi.edu", "ACM", "c@wpi.edu", "WICS", "d@wpi.edu", "ACM",
            "e@wpi.edu", "Pep Band", "m@tufts.edu", "Pep Band", "g@wpi.edu", "Console Game Club", "h@wpi.edu", "WICS",
            "y@clemson.edu", "ACM", "j@wpi.edu", "ACM");

    /**
     * Test case for testing a club management system.
     */
    @Test
    public void testClub() {
        ClubManagable clubRoster = new ClubRosters();
        clubRoster.intake(rawData);
        assertEquals("ACM", clubRoster.mostPopular());
        assertEquals(5, clubRoster.uniqueClubs());
        assertEquals(List.of("b@wpi.edu", "d@wpi.edu", "j@wpi.edu"), clubRoster.sortedEmails("ACM"));
    }
}
