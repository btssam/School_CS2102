package wpioo.lecture19.answers;

import java.io.IOException;
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
        try {
            System.out.println("---------------------");
            System.out.println("Part A: Catching Exception Thrown By Library Methods");
            int population = Integer.parseInt("R");
        } catch (NumberFormatException nfe) {
            System.err.println("Part A: Cannot convert R to an integer");
        }

        String[] citiesArr = new String[2];
        try {
            System.out.println("---------------------");
            System.out.println("Part B: Catching Array Exceptions");
            citiesArr[1000] = "Atlanta";

            System.out.println("---------------------");
            System.out.println("Part C: Unreachable Code");
            String lowercaseCity = citiesArr[0].toLowerCase();
        } catch (ArrayIndexOutOfBoundsException aioe) {
            System.err.println("Part B: Index 1000 is not allowed, trying index 1");
            citiesArr[1] = "Atlanta";
            System.out.println(citiesArr[1]);
        } catch (Exception e) {
            System.err.println("Nothing happens here!");
        }

        Country countryWithNoCities = new Country("Blank", List.of());
        try {
            try {
                System.out.println("---------------------");
                System.out.println(
                        "Part D: A Country With No Cities: findMostPopulatedCity/findMostPopulatedCityWithOptional");
                System.out.println(countryWithNoCities.findMostPopulatedCity());
                Optional<City> optional = countryWithNoCities.findMostPopulatedCityWithOptional();
                optional.ifPresent(System.out::println);
            } catch (IndexOutOfBoundsException ex) {
                System.err.println(ex.getMessage());
                throw new IOException("Just for fun!");
            }
        } catch (IOException io) {
            System.err.println(io.getMessage());
        }

        try {
            System.out.println("---------------------");
            System.out.println("Part E: A Country With No Cities: findByName");
            System.out.println(countryWithNoCities.findByName("Boston"));
        } catch (IndexOutOfBoundsException | CityNotFoundException ioe) {
            System.err.println(ioe.getMessage());
        }

        try {
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
        } catch (IndexOutOfBoundsException | CityNotFoundException ioe) {
            System.err.println(ioe.getMessage());
        } finally {
            System.out.println("---------------------");
            System.out.println("End of Class!");
        }
    }
}
