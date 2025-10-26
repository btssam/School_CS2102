package wpioo.lecture03.answers;

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

    /**
     * This test case verifies that this was an epic rock concert lasting over 2 hours.
     */
    @Test
    public void testConcertLiterallyEpicTrue() {
        byte month = 7;
        byte day = 18;
        Concert epicConcert = new Concert("The Rolling Stones North American Tour 1972", 180, "rock", "Boston",
                new Date(1972, month, day));
        assertEquals("The Rolling Stones North American Tour 1972", epicConcert.name);
        assertTrue(epicConcert.literallyEpic());
    }

    /**
     * This test case verifies that this was a rock concert, but didn't last over 2 hours.
     */
    @Test
    public void testConcertLiterallyEpicFalseNotLongEnough() {
        byte month = 10;
        byte day = 25;
        Concert oldTimersConcert = new Concert("WPI: Old Timers", 60, "rock", "Worcester", new Date(2024, month, day));
        assertFalse(oldTimersConcert.literallyEpic());
        // assertTrue(!oldTimersConcert.literallyEpic());
    }

    /**
     * This test case verifies that this wasn't a rock concert.
     */
    @Test
    public void testConcertLiterallyEpicFalseNotRock() {
        byte month = 10;
        byte day = 25;
        Concert babyShartConcert = new Concert("Baby Shark", 180, "pop", "Worcester", new Date(2024, month, day));
        assertFalse(babyShartConcert.literallyEpic());
    }

    /**
     * This test case verifies the Rolling Stones concert occurred before the Old Timers concert.
     */
    @Test
    public void testConcertOpenedEarlierRollingStones() {
        // Rolling Stones
        byte monthRS = 7;
        byte dayRS = 18;
        Concert rollingStonesConcert = new Concert("The Rolling Stones North American Tour 1972", 180, "rock", "Boston",
                new Date(1972, monthRS, dayRS));

        // WPI: Old Timers
        byte monthOT = 10;
        byte dayOT = 25;
        Concert oldTimersConcert = new Concert("WPI: Old Timers", 60, "rock", "Worcester",
                new Date(2024, monthOT, dayOT));

        // Both should produce the same result
        assertEquals("The Rolling Stones North American Tour 1972",
                rollingStonesConcert.openedEarlier(oldTimersConcert));
        assertEquals("The Rolling Stones North American Tour 1972",
                oldTimersConcert.openedEarlier(rollingStonesConcert));
    }
}
