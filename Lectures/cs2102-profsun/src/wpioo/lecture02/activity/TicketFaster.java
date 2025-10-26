package wpioo.lecture02.activity;

/**
 * This class contains a few ticketing-related methods.
 *
 * @author Prof. Matthew Ahrens
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class TicketFaster {

    /**
     * Produces the price for a movie that costs $11 per ticket.
     *
     * @param numTickets
     *            the number of tickets
     * @param seniorDiscount
     *            movies are half-off for when accompanied by seniors
     *
     * @return the total cost of the tickets
     */
    public double priceForTickets(int numTickets, boolean seniorDiscount) {
        if (seniorDiscount) {
            return (numTickets * 11) / 2.0;
        } else {
            return (numTickets * 11);
        }
    }

    /**
     * Creates a Marquee message with the name and the number of tickets
     * @param name Name of movie or show (cannot be empty string)
     * @param tickets_remaining Number of tickets remaining
     * @return A string that indicates what's being played and the # of
     * tickets remaining or that it is sold out
     */

    public String nowPlaying(String name, int tickets_remaining){
        return String.format("Now Playing: %s %s", name, this.ticketsMsg(tickets_remaining));
    }

    public String ticketsMsg(int tickets_remaining){
        if (tickets_remaining > 0){
            return String.format("Only %d tickets left!", tickets_remaining);
    }
        else{
            return ("!SOLD OUT!");
    }
}
}
