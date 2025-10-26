package wpioo.lecture10.answers;

/**
 * This interface provides information for all hourly employees.
 *
 * @author Prof. Matthew Ahrens
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public interface IHourly {

    /**
     * This method returns the hourly employee's contract description.
     *
     * @return Description for this hourly employee
     */
    public String getContractDescription();

    /**
     * This method returns the hourly employee's rate.
     *
     * @return Hourly rate
     */
    public double getHourlyRate();

    /**
     * This method returns the hourly employee's total number of hours worked.
     *
     * @return Total number of hours worked
     */
    public int getTotalHours();
}
