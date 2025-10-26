package wpioo.lecture21.activity;

/**
 * This class stores information about a student.
 *
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class Student implements Comparable<Student> {

    /** Student ID Number */
    private long studentID;

    /** Student Name */
    private String name;

    /** Student Email */
    private String email;

    /**
     * This stores information related to a student.
     *
     * @param studentID
     *            Student's ID
     * @param name
     *            Student's name
     * @param email
     *            Student's email
     */
    public Student(long studentID, String name, String email) {
        this.studentID = studentID;
        this.name = name;
        this.email = email;
    }

    /**
     * This method implements the {@link Comparable#compareTo(Object)} method for this class.
     *
     * @return {@code -1} if {@link Student} is "less than" {@code o}, {@code 1} if {@link Student} is "greater than"
     *         {@code o} and {@code 0} if {@link Student} and {@code o} are equal (i.e.,
     *         {@code this.equals(o) == true}).
     */
    @Override
    public int compareTo(Student o) {
        // Compare IDs
        if (this.studentID < o.studentID) {
            return -1;
        } else if (this.studentID > o.studentID) {
            return 1;
        } else {
            // Compare email
            int emailCompareResult = this.email.compareTo(o.email);
            if (emailCompareResult < 0) {
                return -1;
            } else if (emailCompareResult > 0) {
                return 1;
            } else {
                // Compare name
                return this.name.compareTo(o.name);
            }
        }
    }

    /**
     * This returns the student's ID.
     *
     * @return ID as a long
     */
    public long getStudentID() {
        return studentID;
    }

    /**
     * This returns the student's name.
     *
     * @return Name as a string.
     */
    public String getName() {
        return name;
    }

    /**
     * This returns the student's email.
     *
     * @return Email as a string.
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method overrides the {@link Object#equals(Object)} method for this class.
     *
     * @param o
     *            Another object
     *
     * @return {@code true} if {@code o} is-a {@link Student} and has the same information, {@code false} otherwise.
     */
    @Override
    public boolean equals(Object o) {
        // Default implementation
        return this == o;
    }

    /**
     * This method overrides the {@link Object#hashCode()} method for this class.
     *
     * @return Hash code value for this {@link Student}.
     */
    @Override
    public int hashCode() {
        // Not a good implementation
        return 17;
    }

    /**
     * This method overrides the {@link Object#toString()} method for this class.
     *
     * @return A string representation of a {@link Student}.
     */
    @Override
    public String toString() {
        return "Student{" + "studentID=" + studentID + ", name='" + name + '\'' + ", email='" + email + '\'' + '}';
    }
}
