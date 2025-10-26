package wpioo.lecture09.activity;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

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
     * Test case for checking if our lawyer has the correct information.
     */
    @Test
    public void testLawyer() {
        ISalaried s = new Lawyer("John", "Smith");
        String expected = "Lawyer: John Smith" + " works 40 hours/week," + " makes 200000.00 salary,"
                + " has 14 vacation days," + " and uses pink form to request vacation.";
        assertEquals(expected, s.toString());
    }

    // /**
    // * Test case for checking if our secretary has the correct information.
    // */
    // @Test
    // public void testSecretary() {
    // ISalaried s = new Secretary("Adam", "King");
    // String expected = "Secretary: Adam King" + " works 50 hours/week," + " makes 40000.00 salary,"
    // + " has 21 vacation days," + " and uses yellow form to request vacation.";
    // assertEquals(expected, s.toString());
    // }
    //
    // /**
    // * Test case for checking if our legal secretary has the correct information.
    // */
    // @Test
    // public void testLegalSecretary() {
    // ISalaried s = new LegalSecretary("Dave", "Crosby");
    // String expected = "LegalSecretary: Dave Crosby" + " works 50 hours/week," + " makes 45000.00 salary,"
    // + " has 21 vacation days," + " and uses yellow form to request vacation.";
    // assertEquals(expected, s.toString());
    // }
    //
    // /**
    // * Test case for checking if our marketer has the correct information.
    // */
    // @Test
    // public void testMarketer() {
    // ISalaried s = new Marketer("Samantha", "Johnson");
    // String expected = "Marketer: Samantha Johnson" + " works 40 hours/week," + " makes 50000.00 salary,"
    // + " has 14 vacation days," + " and uses yellow form to request vacation.";
    // assertEquals(expected, s.toString());
    // }
}
