package wpioo.lecture19.activity;

import java.util.List;
import java.util.Optional;

/**
 * A class that demos the usage of {@link Exception}s.
 *
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 2.0
 */
public class ExceptionsDemo {

    /**
     * The main entry point to the program.
     *
     * @param args
     *            Command line arguments
     */
    public static void main(String[] args) {
        System.out.println("---------------------");
        System.out.println("Part A: Catching Exception Thrown By Library Methods");
        int population = Integer.parseInt("R");

        String[] citiesArr = new String[2];
        System.out.println("---------------------");
        System.out.println("Part B: Catching Array Exceptions");
        citiesArr[1000] = "Atlanta";

        System.out.println("---------------------");
        System.out.println("Part C: Unreachable Code");
        String lowercaseCity = citiesArr[0].toLowerCase();

        Country countryWithNoCities = new Country("Blank", List.of());
        System.out.println("---------------------");
        System.out.println("Part D: A Country With No Cities: findMostPopulatedCity/findMostPopulatedCityWithOptional");
        System.out.println(countryWithNoCities.findMostPopulatedCity());
        Optional<City> optional = countryWithNoCities.findMostPopulatedCityWithOptional();
        optional.ifPresent(System.out::println);

        System.out.println("---------------------");
        System.out.println("Part E: A Country With No Cities: findByName");
        System.out.println(countryWithNoCities.findByName("Boston"));

        System.out.println("---------------------");
        System.out.println("Part F: United States With Top 10 Most Populated Cities");
        Country unitedStates = new Country("United States",
                List.of(new City("Phoenix", "AZ", 1608139), new City("LOS ANGELES", "cA", 3898747),
                        new City("San Diego", "CA", 1386932), new City("Jacksonville", "FL", 949611),
                        new City("chicago", "il", 2746388), new City("New York", "NY", 8804190),
                        new City("Philadelphia", "PA", 1603797), new City("Houston", "TX", 2304580),
                        new City("San Antonio", "TX", 1434625), new City("Dallas", "TX", 1304379)));
        System.out.println(unitedStates);
        System.out.println(unitedStates.findByName("Boston"));
        System.out.println("---------------------");
        System.out.println("End of Class!");
    }
}
