package wpioo.lecture03.activity;

/**
 * This class stores a simple date.
 * @author Ben Samara bsamara@wpi.edu
 * @version 1.0
 */

public class Date {

    /**
     * Year Information
     */
    public int year;

    /** Month Info
     */

    public byte month;
    /**
     * Day Info
     */
    public byte day;


    /**
     * This creates a new Date object.
     * @param year year info
     * @param month month info
     * @param day day info
     */
    public Date(int year, byte month, byte day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    /**
     * compares to two date
     * @param otherDate  another date to compare
     * @return -1 if current date is smaller, 0 if it's equal, 1 if otherDate is smaller
     */

    public int compareTo(Date otherDate){
        if (this.year < otherDate.year){
            return -1;
        } else if (this.year > otherDate.year){
            return 1;
        }
        if (this.month < otherDate.month){
            return -1;
        } else if (this.month > otherDate.month){
            return 1;
        }
        if (this.day < otherDate.day){
            return -1;
        } else if (this.day > otherDate.day){
            return 1;
        } else{
            return 0;
        }
    }

}
