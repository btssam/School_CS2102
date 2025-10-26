package wpioo.lecture01.activity; // a way of organizing code.

/**
 * This class contains methods to calculate grades.
 *
 * @author Prof. Matthew Ahrens
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 2.0
 */
public class GradeCalculator {

    /** Constant: # of Points Per Quiz */
    public static final double POINTS_PER_QUIZ = 50.0;

    /** Constant: # of Points Per Homework */
    public static final double POINTS_PER_HOMEWORK = 60.0;

    /** Constant: # of Points Per Lab */
    public static final double POINTS_PER_LAB = 10.0;

    /** Constant: Extra Credit for Attending Lab */
    public static final double LAB_ATTENDANCE_EC = 3.0;

    /**
     * Calculates the quiz average across all 4 quizzes
     *
     * @param quiz1
     *            Score for quiz 1
     * @param quiz2
     *            Score for quiz 2
     * @param quiz3
     *            Score for quiz 3
     * @param quiz4
     *            Score for quiz 4
     *
     * @return the % on a scale of 0.0 to 1.0
     */
    public double quizPercentage(int quiz1, int quiz2, int quiz3, int quiz4) {
        // Variable Declaration: <type> name;
        // Variable Assignment/Initialization: name = <value>;
        // Variable Declaration and Initialization: <type> name = <value>;
        // KEY POINT: Division is special -> 1 / 2 = 0, 2 / 3 = 0, 1.0 / 2 = 0.50000000000001 != 0.5
        return (quiz1 + quiz2 + quiz3 + quiz4) / (4 * POINTS_PER_QUIZ);
    }

    /**
     * Computes the percentage of the current HW scores
     *
     * @param hwPoints
     *            the total number of hw points earned so far
     * @param hwsAttempted
     *            the number of hws attempted
     *
     * @return the average on a scale of 0.0 to 1.0 (greater than 1.0 is extra credit)
     */
    public double hwPercentage(int hwPoints, int hwsAttempted) {
        return 0.0; // TODO: REPLACE ME
    }

    /**
     * Computes an estimated letter grade given quiz scores and hws attempted.
     *
     * @param quiz1
     *            Score for quiz 1
     * @param quiz2
     *            Score for quiz 2
     * @param quiz3
     *            Score for quiz 3
     * @param quiz4
     *            Score for quiz 4
     * @param hwPoints
     *            the total number of hw points earned so far
     * @param hwsAttempted
     *            the number of hws attempted
     *
     * @return a string representing the letter grade
     */
    public String fuzzyLetterGrade(int quiz1, int quiz2, int quiz3, int quiz4, int hwPoints, int hwsAttempted) {
        double avg = 0.0; // TODO: REPLACE ME
        String myGrade = "My grade is:";
        if (avg >= .90) {
            return myGrade + " " + "A";
        } else if (avg >= .80) {
            return myGrade.concat(" ").concat("B");
        } else if (avg >= .70) {
            return String.format("%s %s", myGrade, "C");
        } else {
            return myGrade + " NR";
        }
    }

    /**
     * Computes the percentage of the current Lab scores
     *
     * @param labPoints
     *            the total number of lab points earned
     * @param labsAttempted
     *            the number of labs submitted to Gradescope (max 10 points each)
     * @param labsAttended
     *            the number of labs extra credit is earned for attending (3 points each)
     *
     * @return the average on a scale of 0.0 to 1.0 (greater than 1.0 is extra credit)
     */

}
