package wpioo.lecture02.answers;

/**
 * This class contains a few ticketing-related methods.
 *
 * @author Prof. Matthew Ahrens
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 2.0
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
     * Creates a Marquee message with the name and the number of tickets remaining
     *
     * @param name
     *            Name for movie or show
     * @param ticketsRemaining
     *            Number of tickets remaining
     *
     * @return A string that indicates the name along with the number of tickets remaining
     */
    public String nowPlaying(String name, int ticketsRemaining) {
        return String.format("Now Playing: %s %s", name, ticketsMsg(ticketsRemaining));
    }

    /**
     * Creates a string with the number of tickets remaining
     *
     * @param ticketsRemaining
     *            Number of tickets remaining
     *
     * @return A string that indicates the number of tickets remaining
     */
    public String ticketsMsg(int ticketsRemaining) {
        if (ticketsRemaining > 0) {
            return String.format("Only %d tickets left!", ticketsRemaining);
        } else {
            return "!Sold Out!";
        }
    }
}
