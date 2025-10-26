package wpioo.lecture14.answers;

import java.util.List;

/**
 * This interface specifies a strategy for giving out toys.
 *
 * @author Prof. Matthew Ahrens
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public interface IToyBinStrategy {

    /**
     * This method returns a list of toys from the machine after spending all of our coins.
     *
     * @param quartersLoaded
     *            Number of quarters in the machine
     * @param quartersPerToy
     *            Number of quarters required to play a turn
     *
     * @return A list of {@link Toy}s.
     */
    public GachaResult receiveToys(int quartersLoaded, int quartersPerToy, List<Toy> toys);
}
