package wpioo.lecture10.activity;

/**
 * This class implements {@link ISalaried} for a lawyer in a law firm. This class is a modified version from <i>Building
 * Java Programs</i> by Stuart Reges and Marty Stepp.
 *
 * @author Prof. Matthew Ahrens
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class Lawyer extends Employee implements ISalaried {

    /**
     * This creates a lawyer.
     *
     * @param firstName
     *            Employee's first name
     * @param lastName
     *            Employee's last name
     */
    public Lawyer(String firstName, String lastName) {
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
        return super.equals(o) && o instanceof Lawyer;
    }

    /**
     * This method returns the lawyer's yearly salary.
     *
     * @return Yearly salary
     */
    @Override
    public double getSalary() {
        return super.getSalary() + 160000;
    }

    /**
     * This method returns the name of the form that needs to filled out to request vacation days.
     *
     * @return The name of the form that needs to be filled.
     */
    @Override
    public String getVacationForm() {
        return "pink";
    }

    /**
     * Prints out a message that the lawyer can sue.
     */
    public void sue() {
        System.out.println("I'll see you in court!");
    }

    /**
     * This method overrides the default behavior of {@link Object#toString()}.
     *
     * @return A string representation of the object
     */
    @Override
    public String toString() {
        return "Lawyer: " + super.toString();
    }
}
