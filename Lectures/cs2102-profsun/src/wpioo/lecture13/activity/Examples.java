package wpioo.lecture13.activity;

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
        ClubManagable clubRoster = new ClubRostersBP();
        clubRoster.intake(rawData);
        assertEquals("ACM", clubRoster.mostPopular());
        assertEquals(5, clubRoster.uniqueClubs());
        assertEquals(List.of("b@wpi.edu", "d@wpi.edu", "j@wpi.edu"), clubRoster.sortedEmails("ACM"));
    }

    /**
     * Test case for testing a club management system, where we use batch processing to clean, parse and sort the data.
     */
    @Test
    public void testClubBP() {
        ClubManagable clubRoster = new ClubRostersBP();
        clubRoster.intake(rawData);
        assertEquals("ACM", clubRoster.mostPopular());
        assertEquals(5, clubRoster.uniqueClubs());
        assertEquals(List.of("b@wpi.edu", "d@wpi.edu", "j@wpi.edu"), clubRoster.sortedEmails("ACM"));
    }

    /**
     * Test case for testing a club management system, where we use real-time processing to clean, parse and sort the
     * data.
     */
    @Test
    public void testClubRTP() {
        ClubManagable clubRosters = new ClubRostersRTP();
        clubRosters.intake(rawData);
        assertEquals("ACM", clubRosters.mostPopular());
        assertEquals(5, clubRosters.uniqueClubs());
        assertEquals(List.of("b@wpi.edu", "d@wpi.edu", "j@wpi.edu"), clubRosters.sortedEmails("ACM"));
    }

    /**
     * Test case that demonstrates how to time each implementation's data intake time.
     */
    @Test
    public void testClubTimingIntake() {
        ClubManagable clubRostersRTP = new ClubRostersRTP();
        ClubManagable clubRostersBP = new ClubRostersBP();

        long preRTPIntake = System.nanoTime(); // start time for rtp
        clubRostersRTP.intake(rawData);
        long postRTPIntake = System.nanoTime(); // end time for rtp
        // post - pre = time elapsed

        long preBPIntake = System.nanoTime();
        clubRostersBP.intake(rawData);
        long postBPIntake = System.nanoTime();

        assertTrue((postRTPIntake - preRTPIntake) > (postBPIntake - preBPIntake));
    }

    /**
     * Test case that demonstrates how to time each implementation's data intake time.
     */
    @Test
    public void testClubTimingIntake2() {
        ClubManagable clubRostersRTP = new ClubRostersRTP();
        ClubManagable clubRostersBP = new ClubRostersBP();

        long preRTPIntake = System.nanoTime(); // start time for rtp
        for (int i = 0; i < 10000; i++) {
            clubRostersRTP.intake(rawData);
        }
        long postRTPIntake = System.nanoTime(); // end time for rtp
        // post - pre = time elapsed

        long preBPIntake = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            clubRostersBP.intake(rawData);
        }
        long postBPIntake = System.nanoTime();

        assertTrue((postRTPIntake - preRTPIntake) > (postBPIntake - preBPIntake));
    }

    /**
     * Test case that demonstrates how to time each implementation's data output time.
     */
    @Test
    public void testClubTimingOutput() {
        ClubManagable clubRostersRTP = new ClubRostersRTP();
        ClubManagable clubRostersBP = new ClubRostersBP();
        clubRostersRTP.intake(rawData);
        clubRostersBP.intake(rawData);

        long preRTPAnswer = System.nanoTime();
        clubRostersRTP.mostPopular();
        long postRTPAnswer = System.nanoTime();

        long preBPAnswer = System.nanoTime();
        clubRostersBP.mostPopular();
        long postBPAnswer = System.nanoTime();

        assertTrue((postRTPAnswer - preRTPAnswer) < (postBPAnswer - preBPAnswer));
    }
    //
    // /**
    // * Test case for testing a club management system, where we are only interested in CS clubs.
    // */
    // @Test
    // public void testClubCountBPCSClubs() {
    // ClubManagable clubRoster = new CSClubRostersBP(List.of("ACM", "WICS"));
    // clubRoster.intake(rawData);
    // assertEquals("ACM", clubRoster.mostPopular());
    // assertEquals(2, clubRoster.uniqueClubs());
    // assertEquals(List.of("b@wpi.edu", "d@wpi.edu", "j@wpi.edu"), clubRoster.sortedEmails("ACM"));
    // }
}
