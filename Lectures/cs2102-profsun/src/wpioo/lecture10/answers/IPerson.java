package wpioo.lecture10.answers;

/**
 * This interface provides information for a person.
 *
 * @author Prof. Matthew Ahrens
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public interface IPerson {

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
}
