package wpioo.lecture10.activity;

/**
 * This class implements {@link ISalaried} for a secretary in a law firm. This class is a modified version from
 * <i>Building Java Programs</i> by Stuart Reges and Marty Stepp.
 *
 * @author Prof. Matthew Ahrens
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class Secretary extends Employee implements ISalaried {

    /**
     * This creates a secretary.
     *
     * @param firstName
     *            Employee's first name
     * @param lastName
     *            Employee's last name
     */
    public Secretary(String firstName, String lastName) {
        super(firstName, lastName); // Calls the Employee constructor
    }

    /**
     * This method overrides the default behavior of {@link Object#equals(Object)}.
     *
     * @param o
     *            Another object
     *
     * @return True if the two objects are equals, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        return super.equals(o) && o instanceof Secretary;
    }

    /**
     * This method returns the secretary's number of hours worked per week.
     *
     * @return Number of hours worked per week
     */
    @Override
    public int getHours() {
        return super.getHours() + 10;
    }

    /**
     * This method returns the secretary's number of vacation days per year.
     *
     * @return Number of vacation days per year
     */
    @Override
    public int getVacationDays() {
        return super.getVacationDays() + 7;
    }

    /**
     * Prints a message that states the secretary can take dictation.
     *
     * @param text
     *            Text to be dictated.
     */
    public void takeDictation(String text) {
        System.out.println("Taking dictation of text: " + text);
    }

    /**
     * This method overrides the default behavior of {@link Object#toString()}.
     *
     * @return A string representation of the object
     */
    @Override
    public String toString() {
        return "Secretary: " + super.toString();
    }
}
