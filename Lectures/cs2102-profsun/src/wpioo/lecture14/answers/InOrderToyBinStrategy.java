package wpioo.lecture14.answers;

import java.util.LinkedList;
import java.util.List;

/**
 * This is a normal in-order toy distribution strategy for toys with rarity.
 *
 * @author Prof. Matthew Ahrens
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class InOrderToyBinStrategy implements IToyBinStrategy {

    /**
     * This method returns a list of toys from the machine after spending all of our coins.
     *
     * @param quartersLoaded
     *            Number of quarters in the machine
     * @param quartersPerToy
     *            Number of quarters required to play a turn
     * @param toys
     *            List of toys to hand out
     *
     * @return A list of {@link Toy}s.
     */
    @Override
    public GachaResult receiveToys(int quartersLoaded, int quartersPerToy, List<Toy> toys) {
        LinkedList<Toy> toysToReceive = new LinkedList<>();

        // Prints a helpful error message when we don't have enough quarters to buy a toy
        if (quartersLoaded < quartersPerToy) {
            System.err.println("Not enough quarters");
        }

        // Remove toys from the Gachapon until we run out of quarters
        int quartersSpent = 0;
        for (int i = quartersLoaded; i >= quartersPerToy && !toys.isEmpty(); i = i - quartersPerToy) {
            toysToReceive.add(toys.remove(0));
            quartersSpent += quartersPerToy; // spending quartersPerToy each turn
        }

        return new GachaResult(toysToReceive, quartersSpent);
    }
}
