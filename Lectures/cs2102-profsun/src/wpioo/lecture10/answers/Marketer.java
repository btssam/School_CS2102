package wpioo.lecture10.answers;

/**
 * This class implements {@link IPerson} and {@link ISalaried} for a marketer in a law firm. This class is a modified
 * version from <i>Building Java Programs</i> by Stuart Reges and Marty Stepp.
 *
 * @author Prof. Matthew Ahrens
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class Marketer extends Employee implements IPerson, ISalaried {

    /**
     * This creates a marketer.
     *
     * @param firstName
     *            Employee's first name
     * @param lastName
     *            Employee's last name
     */
    public Marketer(String firstName, String lastName) {
        super(firstName, lastName);
    }

    /**
     * Prints out a message that the marketers can advertise.
     */
    public void advertise() {
        System.out.println("Act now while supplies last!");
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
        return super.equals(o) && o instanceof Marketer;
    }

    /**
     * This method returns the lawyer's yearly salary.
     *
     * @return Yearly salary
     */
    @Override
    public double getSalary() {
        return super.getSalary() + 10000;
    }

    /**
     * This method overrides the default behavior of {@link Object#toString()}.
     *
     * @return A string representation of the object
     */
    @Override
    public String toString() {
        return "Marketer: " + super.toString();
    }
}
