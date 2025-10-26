package wpioo.lecture10.answers;

/**
 * This class implements {@link IPerson} and {@link ISalaried} for a legal secretary in a law firm. This class is a
 * modified version from <i>Building Java Programs</i> by Stuart Reges and Marty Stepp.
 *
 * @author Prof. Matthew Ahrens
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class LegalSecretary extends Secretary {

    /**
     * This creates a legal secretary.
     *
     * @param firstName
     *            Employee's first name
     * @param lastName
     *            Employee's last name
     */
    public LegalSecretary(String firstName, String lastName) {
        super(firstName, lastName);
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
        return super.equals(o) && o instanceof LegalSecretary;
    }

    /**
     * This method returns the legal secretary's yearly salary.
     *
     * @return Yearly salary
     */
    @Override
    public double getSalary() {
        return super.getSalary() + 5000;
    }

    /**
     * Prints out a message that a legal secretary can file legal briefs.
     */
    public void fileLegalBriefs() {
        System.out.println("I could file all day!");
    }

    /**
     * This method overrides the default behavior of {@link Object#toString()}.
     *
     * @return A string representation of the object
     */
    @Override
    public String toString() {
        return "Legal" + super.toString();
    }
}
