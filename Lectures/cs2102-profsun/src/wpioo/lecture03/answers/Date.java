package wpioo.lecture03.answers;

/**
 * This class stores a simple date.
 *
 * @author Prof. Matthew Ahrens
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class Date {

    /** the year in yyyy format */
    public int year;

    /** the month: 1-12 */
    public byte month;

    /** the day: 1-31 */
    public byte day;

    /**
     * Constructor for a 3 part date
     *
     * @param year
     *            in yyyy format
     * @param month
     *            1-12
     * @param day
     *            1-31
     */
    public Date(int year, byte month, byte day) {
        this.year = year;
        this.month = month;
        this.day = day;
        // Python: self.year = year
        // Java: this.year = year
    }

    /**
     * Compares two dates to see which one is earlier
     *
     * @param otherDate
     *            A date to compare this date to
     *
     * @return -1 when this date is earlier, 0 if equal, 1 if later
     */
    public int compareTo(Date otherDate) {
        // my own date information: this.year, this month, this.day
        // other date information: otherDate.year, otherDate.month, otherDate.day
        if (this.year < otherDate.year) {
            return -1;
        } else if (this.year > otherDate.year) {
            return 1;
        } else if (this.month < otherDate.month) {
            return -1;
        } else if (this.month > otherDate.month) {
            return 1;
        } else if (this.day < otherDate.day) {
            return -1;
        } else if (this.day > otherDate.day) {
            return 1;
        } else {
            return 0;
        }
    }
}
