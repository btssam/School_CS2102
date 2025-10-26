package wpioo.lecture14.answers;

import java.util.ArrayList;
import java.util.List;

/**
 * A class that demos the strategy pattern using Gachapon (@see
 * <a href="https://en.wikipedia.org/wiki/Gashapon">Gashapon</a>).
 *
 * @author Prof. Matthew Ahrens
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class Main {

    /**
     * The main entry point to the program.
     *
     * @param args
     *            Command line arguments
     */
    public static void main(String[] args) {
        // generated with the help of ChatGPT4.0
        List<Toy> pokemonToys = new ArrayList<>();

        // A pool of Pokemon names
        String[] pokemonNames = { "Pikachu", "Charizard", "Bulbasaur", "Squirtle", "Jigglypuff", "Eevee", "Snorlax",
                "Mewtwo", "Gengar" };

        // Creating 50 Pokemon toys with possible repeats
        for (int i = 0; i < 50; i++) {
            String name = pokemonNames[i % pokemonNames.length];
            int rarity = i % 11; // 0 - 10 (both inclusive)
            pokemonToys.add(new Toy(name, rarity));
        }

        // Simulate loading the machine with quarters and getting a list of toys back
        Gachapon g = new Gachapon(pokemonToys);
        System.out.println(g.loadQuarter(20).receiveToys());

        // Creating another 50 Pokemon toys with possible repeats
        List<Toy> refillPokemonToys = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            String name = pokemonNames[i % pokemonNames.length];
            int rarity = i % 11; // 0 - 10 (both inclusive)
            refillPokemonToys.add(new Toy(name, rarity));
        }
        g = g.refillToyBin(refillPokemonToys); // Refill the Gachapon with more toys

        // Task:
        // Be able to swap out the logic for how a toy is received while keeping the "paying for toy" mechanism the same
        g.switchStrategy(new RiggedToyBinStrategy());

        // method chaining (Used in the builder pattern a lot):
        System.out.println(g.loadQuarter().loadQuarter().loadQuarter().loadQuarter().receiveToys());
        g.switchStrategy(new InOrderToyBinStrategy());
        System.out.println("\nLeft Over Quarters: " + g.refundQuarters());
    }
}
