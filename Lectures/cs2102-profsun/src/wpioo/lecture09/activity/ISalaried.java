package wpioo.lecture09.activity;

/**
 * This interface provides information for all salaried employees. This interface is a modified version from <i>Building
 * Java Programs</i> by Stuart Reges and Marty Stepp.
 *
 * @author Prof. Matthew Ahrens
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public interface ISalaried {

    /**
     * This method returns the salaried employee's first name.
     *
     * @return First name as a string
     */
    public String getFirstName();

    /**
     * This method returns the salaried employee's last name.
     *
     * @return Last name as a string
     */
    public String getLastName();

    /**
     * This method returns the salaried employee's number of hours worked per week.
     *
     * @return Number of hours worked per week
     */
    public int getHours();

    /**
     * This method returns the salaried employee's yearly salary.
     *
     * @return Yearly salary
     */
    public double getSalary();

    /**
     * This method returns the salaried employee's number of vacation days per year.
     *
     * @return Number of vacation days per year
     */
    public int getVacationDays();

    /**
     * This method returns the name of the form that needs to filled out to request vacation days.
     *
     * @return The name of the form that needs to be filled.
     */
    public String getVacationForm();
}
