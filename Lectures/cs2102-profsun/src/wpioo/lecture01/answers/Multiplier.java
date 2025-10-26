package wpioo.lecture01.answers; // a way of organizing code.

/**
 * This class contains a few multiplier methods for helping us with calculations.
 *
 * @author Prof. Matthew Ahrens
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class Multiplier {

    /**
     * A function that triples its input
     *
     * @param number
     *            any number
     *
     * @return 3x that number
     */
    public double triple(double number) {
        return 3 * number;
    }

    /**
     * A function that calculates the total cost of a bunch of candy
     *
     * @param candies
     *            the amount of candies
     *
     * @return the total cost at $.50 per candy
     */
    public double costForCandy(int candies) {
        double costEach = 0.50;
        return candies * costEach;
    }
}
