package wpioo.lecture02.activity;

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

    @Test
    public void testNowPlayingLotsofTciketsLeft(){
        TicketFaster tf = new TicketFaster();
        assertEquals("Now Playing: Interstellar Only 200 tickets left!",
                tf.nowPlaying("Interstellar", 200));
    }

    @Test
    public void testNowPlayingNoTicketsLeft(){
        TicketFaster tf = new TicketFaster();
        assertEquals("Now Playing: Avatar !SOLD OUT!",
                tf.nowPlaying("Avatar", 0));
    }
}
