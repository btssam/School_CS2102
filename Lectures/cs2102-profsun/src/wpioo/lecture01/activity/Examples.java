package wpioo.lecture01.activity; // a way of organizing code.

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * This class contains our JUnit test methods.
 *
 * @author Prof. Matthew Ahrens
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 2.0
 */
public class Examples {

    /**
     * This test case shows that we can double by multiplying two integers.
     */
    @Test
    public void testDoublingNumbers() {
        assertEquals(4, 2 * 2);
    }

    /**
     * This test case shows that we can triple by using the {@link Multiplier#triple(double)} method.
     */
    @Test
    public void testTriple() {
        Multiplier multi = new Multiplier();
        assertEquals(3, multi.triple(1), 0.01);
    }

    @Test
    public void testNumber() {
        int testNum = 5;
        assertEquals(2+3, testNum);
    }

    /**
     * This test case shows that we can calculate the cost of candy and demonstrates that we need a {@code delta} value
     * when comparing {@code double}s.
     */
    @Test
    public void testCandies() {
        Multiplier multi = new Multiplier();
        assertEquals(10, multi.costForCandy(20), 0.01);
    }

    /**
     * This test case computes the quiz percentage of 4 quizzes.
     */
    @Test
    public void testQuizPercentage() {
        GradeCalculator gradeCalc = new GradeCalculator();
        assertEquals(0.8, gradeCalc.quizPercentage(30, 50, 40, 40), 0.0001);
    }

    /**
     * This test case computes the homework percentage when we receive full credit for all of them.
     */
    @Test
    public void testHWPercentage() {
        GradeCalculator gradeCalc = new GradeCalculator();
        assertEquals(1.0, gradeCalc.hwPercentage(180, 3), 0.001);
    }

    /**
     * This test case computes the homework percentage when we submit no homework.
     */
    @Test
    public void testHWPercentageNoneSubmitted() {
        GradeCalculator gradeCalc = new GradeCalculator();
        assertEquals(0.0, gradeCalc.hwPercentage(0, 3), 0.001);
    }

    /**
     * This test case computes the homework percentage when there are no homework assignments.
     */
    @Test
    public void testHWPercentageNoAssignment() {
        GradeCalculator gradeCalc = new GradeCalculator();
        assertEquals(0.0, gradeCalc.hwPercentage(0, 0), 0.001);
    }

    /**
     * This test case estimates your grade in the class using sample quiz and homework grades.
     */
    @Test
    public void testFuzzyLetter() {
        GradeCalculator gradeCalc = new GradeCalculator();
        assertEquals("My grade is: B", gradeCalc.fuzzyLetterGrade(50, 50, 50, 50, 230, 5));
    }
}
