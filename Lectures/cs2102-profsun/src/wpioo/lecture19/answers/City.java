package wpioo.lecture19.answers;

/**
 * This class stores information about a city.
 *
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 2.0
 */
public class City implements Comparable<City> {

    /** City name */
    private final String name;

    /** State where city is located in */
    private final String state;

    /** City's population (U.S. Census 2020) */
    private final int population;

    /**
     * This stores information related to a city.
     *
     * @param name
     *            City name
     * @param state
     *            State where city is located in
     * @param population
     *            City's population (U.S. Census 2020)
     */
    public City(String name, String state, int population) {
        // Uppercase first letter, the rest lowercase
        this.name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        // All uppercase
        this.state = state.toUpperCase();
        this.population = population;
    }

    /**
     * This method implements {@link Comparable#compareTo(Object)} to compare two cities.
     * <p>
     * Comparison Order:
     * <ol>
     * <li>City Population (Descending Order)</li>
     * <li>State Name (Alphabetical Order)</li>
     * <li>City Name (Alphabetical Order)</li>
     * </ol>
     *
     * @param otherCity
     *            the city to be compared.
     *
     * @return < 0 if the comparison order determines that this city is "smaller", > 0 if the comparison order
     *         determines that the other city is "smaller", 0 if the two cities are the same.
     */
    @Override
    public int compareTo(City otherCity) {
        // Compare by population first (descending order)
        int populationCompare = Integer.compare(otherCity.population, this.population);
        if (populationCompare != 0) {
            return populationCompare;
        }

        // Compare by State second (alphabetical order)
        int stateCompare = this.state.compareToIgnoreCase(otherCity.state);
        if (stateCompare != 0) {
            return stateCompare;
        }

        // Compare by city name (alphabetical order)
        return this.name.compareToIgnoreCase(otherCity.name);
    }

    /**
     * This method overrides the {@link Object#equals(Object)} method for this class.
     *
     * @param o
     *            Another object
     *
     * @return {@code true} if {@code o} is-a {@link City} and has the same information, {@code false} otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (o instanceof City city) {
            return this.population == city.population && this.name.equals(city.name) && this.state.equals(city.state);
        }

        return false;
    }

    /**
     * This returns the name of the city.
     *
     * @return A string
     */
    public String getName() {
        return this.name;
    }

    /**
     * This returns the name of the state.
     *
     * @return A string
     */
    public String getState() {
        return this.state;
    }

    /**
     * This returns the population of the state.
     *
     * @return An integer
     */
    public int getPopulation() {
        return this.population;
    }

    /**
     * This overrides {@link Object#toString()} to return information about a {@link City}.
     *
     * @return A string representation of the object.
     */
    @Override
    public String toString() {
        return "City{" + "name='" + this.getName() + '\'' + ", state='" + this.getState() + '\'' + ", population="
                + this.getPopulation() + '}';
    }
}
