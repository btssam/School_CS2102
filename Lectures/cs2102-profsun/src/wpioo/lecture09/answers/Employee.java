package wpioo.lecture09.answers;

/**
 * This class implements {@link ISalaried} for an employee in a law firm. This class is a modified version from
 * <i>Building Java Programs</i> by Stuart Reges and Marty Stepp.
 *
 * @author Prof. Matthew Ahrens
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class Employee implements ISalaried {

    /** Employee's first name */
    public String firstName;

    /** Employee's last name */
    public String lastName;

    /** Employee's number of worked hours per week */
    public int hours;

    /** Employee's salary */
    public double salary;

    /** Employee's number of vacation days */
    public int vacationDays;

    /**
     * This creates an employee.
     *
     * @param firstName
     *            Employee's first name
     * @param lastName
     *            Employee's last name
     */
    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hours = 40;
        this.salary = 40000.00;
        this.vacationDays = 14; // 2 weeks' paid vacation
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
        if (o instanceof Employee other) {
            return this.firstName.equals(other.firstName) && this.lastName.equals(other.lastName)
                    && this.getHours() == other.getHours() && Math.abs(this.getSalary() - other.getSalary()) < 0.001
                    && this.getVacationDays() == other.getVacationDays()
                    && this.getVacationForm().equals(other.getVacationForm());
        }

        return false;
    }

    /**
     * This method returns the salaried employee's first name.
     *
     * @return First name as a string
     */
    @Override
    public String getFirstName() {
        return firstName;
    }

    /**
     * This method returns the salaried employee's last name.
     *
     * @return Last name as a string
     */
    @Override
    public String getLastName() {
        return lastName;
    }

    /**
     * This method returns the salaried employee's number of hours worked per week.
     *
     * @return Number of hours worked per week
     */
    @Override
    public int getHours() {
        return hours;
    }

    /**
     * This method returns the salaried employee's yearly salary.
     *
     * @return Yearly salary
     */
    @Override
    public double getSalary() {
        return salary;
    }

    /**
     * This method returns the salaried employee's number of vacation days per year.
     *
     * @return Number of vacation days per year
     */
    @Override
    public int getVacationDays() {
        return vacationDays;
    }

    /**
     * This method returns the name of the form that needs to filled out to request vacation days.
     *
     * @return The name of the form that needs to be filled.
     */
    @Override
    public String getVacationForm() {
        return "yellow";
    }

    /**
     * This method overrides the default behavior of {@link Object#toString()}.
     *
     * @return A string representation of the object
     */
    @Override
    public String toString() {
        return String.format(
                "%s %s works %d hours/week, makes %.2f salary, has %d vacation days, and uses %s form to request vacation.",
                this.firstName, this.lastName, this.getHours(), this.getSalary(), this.getVacationDays(),
                this.getVacationForm());
    }
}
