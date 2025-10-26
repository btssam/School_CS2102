package wpioo.lecture02.answers;

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
     * This test case verifies the ticket price without senior discount.
     */
    @Test
    public void testTicketFasterWithoutSeniorDiscount() {
        TicketFaster ticketFaster = new TicketFaster();
        assertEquals(33.0, ticketFaster.priceForTickets(3, false), 0.01);
    }

    /**
     * This test case verifies the ticket price with senior discount.
     */
    @Test
    public void testTicketFasterWithSeniorDiscount() {
        TicketFaster ticketFaster = new TicketFaster();
        assertEquals(16.5, ticketFaster.priceForTickets(3, true), 0.01);
    }

    /**
     * This test case verifies a string with the movie playing now information and the number of tickets left is
     * returned.
     */
    @Test
    public void testTicketFasterNowPlayingSomeTickets() {
        TicketFaster ticketFaster = new TicketFaster();
        assertEquals("Now Playing: Big Ex tha Plug only 70 tickets left",
                ticketFaster.nowPlaying("Big Ex tha Plug", 70));
    }

    /**
     * This test case verifies a string with the movie playing now information and all tickets are sold out is returned.
     */
    @Test
    public void testTicketsFasterNowPlayingNoTickets() {
        TicketFaster ticketFaster = new TicketFaster();
        assertEquals("Now Playing: Big Ex tha Plug !SOLD OUT!", ticketFaster.nowPlaying("Big Ex tha Plug", 0));
    }

    /**
     * This test case verifies "fizz" is returned when we provide a number that is only divisible by 3.
     */
    @Test
    public void testFizzBuzzOutputFizz() {
        ClassicInterview classic = new ClassicInterview();
        assertEquals("fizz", classic.fizzbuzz(3));
    }

    /**
     * This test case verifies "buzz" is returned when we provide a number that is only divisible by 5.
     */
    @Test
    public void testFizzBuzzOutputBuzz() {
        ClassicInterview classic = new ClassicInterview();
        assertEquals("buzz", classic.fizzbuzz(5));
    }

    /**
     * This test case verifies "fizzbuzz" is returned when we provide a number that is divisible by 3 and 5.
     */
    @Test
    public void testFizzBuzzOutputFizzBuzz() {
        ClassicInterview classic = new ClassicInterview();
        assertEquals("fizzbuzz", classic.fizzbuzz(15));
    }

    /**
     * This test case verifies the number as a string is returned when we provide a number that isn't divisible by 3 or
     * 5.
     */
    @Test
    public void testFizzBuzzOutputNot3Or5Div() {
        ClassicInterview classic = new ClassicInterview();
        assertEquals("22", classic.fizzbuzz(22));
    }
}
