package wpioo.lecture19.answers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * This class stores information about a country.
 *
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class Country {

    /** Country name */
    private final String name;

    /** Cities in this country */
    private final List<City> cities;

    /**
     * This stores information related to a country.
     *
     * @param name
     *            Country name
     * @param cities
     *            List of {@link City} objects
     */
    public Country(String name, List<City> cities) {
        this.name = name;
        this.cities = new ArrayList<>(cities);
        this.cities.sort(City::compareTo);
    }

    /**
     * This stores information related to a country.
     *
     * @param name
     *            Country name
     * @param cities
     *            Array of {@link City} objects
     */
    public Country(String name, City[] cities) {
        // Using the Arrays class to convert an array to list
        this(name, Arrays.asList(cities));
    }

    /**
     * A method that returns a {@link City} object that has the same name.
     *
     * @param name
     *            Name of the city we are searching for
     *
     * @return A {@link City} object that matches {@code name}.
     */
    public City findByName(String name) throws IndexOutOfBoundsException, CityNotFoundException {
        if (this.cities.isEmpty()) {
            throw new IndexOutOfBoundsException("List is empty!");
        }

        for (City city : this.cities) {
            if (city.getName().equals(name)) {
                return city;
            }
        }

        // return null; // Not good...
        throw new CityNotFoundException("Couldn't find a city with this name: " + name);
    }

    /**
     * A method that returns the most populated city.
     *
     * @return A {@link City} with the highest population. Tie-breakers for cities with the same population will be
     *         first by state name (alphabetical ignoring case order) followed by city name (alphabetical ignoring case
     *         order).
     *
     * @throws IndexOutOfBoundsException
     *             Thrown when the list is empty
     */
    public City findMostPopulatedCity() throws IndexOutOfBoundsException {
        if (this.cities.isEmpty()) {
            throw new IndexOutOfBoundsException("List is empty");
        }

        return this.cities.get(0);
    }

    /**
     * A method that returns the most populated city.
     *
     * @return A {@link Optional<City>} with the highest population if it can be found, otherwise it returns
     *         {@link Optional#empty()}. Tie-breakers for cities with the same population will be first by state name
     *         (alphabetical ignoring case order) followed by city name (alphabetical ignoring case order).
     */
    public Optional<City> findMostPopulatedCityWithOptional() {
        return this.cities.isEmpty() ? Optional.empty() : Optional.of(this.cities.get(0));
    }

    /**
     * This overrides {@link Object#toString()} to return information about a {@link Country}.
     *
     * @return A string representation of the object.
     */
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder(String.format("Country: %s\n", this.name));
        int counter = 1;
        for (City city : this.cities) {
            str.append(String.format("%02d. %s\n", counter, city.toString()));
            counter++;
        }

        return str.toString();
    }
}
