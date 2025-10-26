package wpioo.lecture10.answers;

/**
 * This class implements {@link IPerson} and {@link IHourly} for an intern in a law firm.
 *
 * @author Prof. Matthew Ahrens
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class Intern implements IPerson, IHourly {

    /** Intern's first name */
    public String firstName;

    /** Intern's last name */
    public String lastName;

    /** Intern's contract description */
    public String contractDescription;

    /** Intern's total number of hours worked */
    public int totalHoursWorked;

    /** Intern's hourly rate */
    public double hourlyRate;

    /**
     * This creates an intern.
     *
     * @param firstName
     *            Intern's first name
     * @param lastName
     *            Intern's last name
     * @param totalHoursWorked
     *            Intern's total number of hours worked
     * @param hourlyRate
     *            Intern's hourly rate
     * @param contractDescription
     *            Intern's contract description
     */
    public Intern(String firstName, String lastName, int totalHoursWorked, double hourlyRate,
            String contractDescription) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalHoursWorked = totalHoursWorked;
        this.hourlyRate = hourlyRate;
        this.contractDescription = contractDescription;
    }

    /**
     * This method returns the intern's first name.
     *
     * @return First name as a string
     */
    @Override
    public String getFirstName() {
        return firstName;
    }

    /**
     * This method returns the intern's last name.
     *
     * @return Last name as a string
     */
    @Override
    public String getLastName() {
        return lastName;
    }

    /**
     * This method returns the intern's contract description.
     *
     * @return Description for this hourly employee
     */
    @Override
    public String getContractDescription() {
        return contractDescription;
    }

    /**
     * This method returns the intern's rate.
     *
     * @return Hourly rate
     */
    @Override
    public double getHourlyRate() {
        return hourlyRate;
    }

    /**
     * This method returns the intern's total number of hours worked.
     *
     * @return Total number of hours worked
     */
    @Override
    public int getTotalHours() {
        return totalHoursWorked;
    }
}
