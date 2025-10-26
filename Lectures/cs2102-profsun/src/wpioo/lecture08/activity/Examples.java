package wpioo.lecture08.activity;

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

    /**
     * This test case checks that this boa fits in a 5 ft pen.
     */
    @Test
    public void testBoaFitsIn5FtPen() {
        Cageable boa = new Boa("Harvey", 4, "Pizza", true);
        assertTrue(boa.fitInExhibit(5));
    }

    /**
     * This test case checks that this boa does not fit in a 5 ft pen.
     */
    @Test
    public void testBoaDoesNotFitIn5FtPen() {
        Cageable boa = new Boa("Nokia", 20, "Pixels", false);
        assertFalse(boa.fitInExhibit(5));
    }

    /**
     * This test case checks which boas fit in the display exhibit.
     */
    @Test
    public void testZooOnListOfBoas() {
        Zoo aZoo = new Zoo(List.of(new Boa("Harvey", 4, "Pizza", true), new Boa("Nokia", 20, "Pixels", false)));
        assertEquals(List.of("Harvey"), aZoo.allThatFit(5));
    }

    // /**
    // * This test case checks that this unrolled dillo fits in a 5 ft pen.
    // */
    // @Test
    // public void testDilloUnrolledTrue() {
    // Cageable dillo = new Dillo(42, 3, false);
    // assertTrue(dillo.fitInExhibit(5));
    // }
    //
    // /**
    // * This test case checks that this unrolled dillo does not fit in a 2 ft pen.
    // */
    // @Test
    // public void testDilloUnrolledFalse() {
    // Cageable dillo = new Dillo(42, 3, false);
    // assertFalse(dillo.fitInExhibit(2));
    // }
    //
    // /**
    // * This test case checks that this rolled dillo fits in a 2 ft pen.
    // */
    // @Test
    // public void testDilloRolledTrue() {
    // Cageable dillo = new Dillo(44, 3, true);
    // assertTrue(dillo.fitInExhibit(2));
    // }
    //
    // /**
    // * This test case checks that this rolled dillo does not fit in a 1 ft pen.
    // */
    // @Test
    // public void testDilloRolledFalse() {
    // Cageable dillo = new Dillo(44, 3, true);
    // assertFalse(dillo.fitInExhibit(1));
    // }
    //
    // /**
    // * This test case checks which dillos fit in the display exhibit.
    // */
    // @Test
    // public void testZooOnListOfDillos() {
    // Zoo aZoo = new Zoo(List.of(new Dillo(12, 8, true), new Dillo(77, 6, false)));
    // assertEquals(List.of("Dillo#12"), aZoo.allThatFit(5));
    // }
    //
    // /**
    // * This test case checks which boas and dillos fit in the display exhibit.
    // */
    // @Test
    // public void testZooWithBoasAndDillos() {
    // Zoo aZoo = new Zoo(List.of(new Boa("Harvey", 4, "Pizza", true), new Boa("Nokia", 20, "Pixels", false),
    // new Dillo(12, 8, true), new Dillo(77, 6, false)));
    // assertEquals(List.of("Harvey", "Dillo#12"), aZoo.allThatFit(5));
    // }
}
