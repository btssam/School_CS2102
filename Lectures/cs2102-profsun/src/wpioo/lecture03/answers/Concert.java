package wpioo.lecture03.answers;

/**
 * Compound data and some functionality for a concert of some sort.
 *
 * @author Prof. Matthew Ahrens
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class Concert {

    /** the name of the concert */
    public String name;

    /** the running time in minutes */
    public int runningTime;

    /** the genre like: "rock", "pop", "hip-hop", etc. */
    public String genre;

    /** the location where the concert is held */
    public String location;

    /** the concert date in a yyyymmdd-like object */
    public Date concertDate;

    /**
     * The constructor for a concert with no default assumptions
     *
     * @param name
     *            Concert name
     * @param runningTime
     *            Running time in minutes
     * @param genre
     *            Concert genre
     * @param location
     *            Concert location
     * @param concertDate
     *            Concert date
     */
    public Concert(String name, int runningTime, String genre, String location, Date concertDate) {
        this.name = name;
        this.runningTime = runningTime;
        this.genre = genre;
        this.location = location;
        this.concertDate = concertDate;
    }

    /**
     * Determines if a concert is EPIC!
     *
     * @return True if it is a rock concert lasting over 2 hrs long.
     */
    public boolean literallyEpic() {
        // Long hand
        /*
         * if (genre.equalsIgnoreCase("ROCK") && runningTime > 120) { return true; } else { return false; }
         */

        // Short hand
        return genre.equalsIgnoreCase("ROCK") && runningTime > 120;
    }

    /**
     * Produces the name of the earlier of two concerts
     *
     * @param otherConcert
     *            A concert to compare this concert to
     *
     * @return The name of the earlier concert OR "Twinsies!" if same date
     */
    public String openedEarlier(Concert otherConcert) {
        if (this.concertDate.compareTo(otherConcert.concertDate) == -1) {
            return this.name;
        } else if (this.concertDate.compareTo(otherConcert.concertDate) == 1) {
            return otherConcert.name;
        } else {
            return "Twinsies";
        }
    }
}
