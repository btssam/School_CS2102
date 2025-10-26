package wpioo.lecture02.answers;

/**
 * This class contains the solution to a classic interview question: {@code FizzBuzz}.
 *
 * @author Prof. Matthew Ahrens
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class ClassicInterview {

    /**
     * A classic interview question: FizzBuzz.
     *
     * @param num
     *            A number
     *
     * @return The string {@code fizzbuzz} if it is divisible by 3 and 5, {@code fizz} if it is divisible by 3,
     *         {@code buzz} if it is divisible by 5 or the number (as a string) otherwise.
     */
    public String fizzbuzz(int num) {
        int rem3 = num % 3;
        int rem5 = num % 5;
        if (rem3 == 0 && rem5 == 0) {
            return "fizzbuzz";
        } else if (rem3 == 0) {
            return "fizz";
        } else if (rem5 == 0) {
            return "buzz";
        } else {
            return String.format("%d", num);
        }
    }
}
