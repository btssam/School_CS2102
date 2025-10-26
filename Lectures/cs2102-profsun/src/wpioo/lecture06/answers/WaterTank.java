package wpioo.lecture06.answers;

/**
 * A passive "Hot Water Heater" tank
 *
 * @author Prof. Matthew Ahrens
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class WaterTank {

    /**
     * capacity in Liters
     */
    public double capacity;

    /**
     * temperature in Celsius
     */
    public double temperature;

    /**
     * percent full of hot water (0.0% - 100.0%)
     */
    public double percentFull;

    /**
     * Construct a water tank object
     *
     * @param capacity
     *            the capacity of the tank to hold hot water in Liters (L)
     * @param temperature
     *            the temperature of the hot water in Celsius (C)
     * @param percentFull
     *            the percentage of the capacity currently filled with hot water.
     */
    public WaterTank(double capacity, double temperature, double percentFull) {
        this.capacity = capacity;
        this.temperature = temperature;
        this.percentFull = percentFull;
    }

    /**
     * Returns total amount of water left in tank that I can use
     *
     * @return Amount of water in liters
     */
    public double currentLiters() {
        return this.capacity * this.percentFull / 100.0;
    }

    /**
     * Calculates the delta difference between the current water tank temperature and the target temperature
     *
     * @param targetTemp
     *            A target temperature
     *
     * @return The difference between the water tank temperature and target temperature. If the target temperature is
     *         lower than the current water tank temperature, then we return 0.0.
     */
    public double deltaTempTo(double targetTemp) {
        // Current temperature higher than target temp
        if (targetTemp - this.temperature < 0) {
            return 0.0;
        }

        return targetTemp - this.temperature;
    }

    /**
     * Updates the current water tank temperature by some amount
     *
     * @param deltaCelsius
     *            The temperature amount in Celsius to be raised by
     */
    public void raiseBy(double deltaCelsius) {
        this.temperature += deltaCelsius;
    }

    /**
     * This method overrides the default behavior of {@link Object#equals(Object)}.
     *
     * @param o
     *            Another object
     *
     * @return True if the two objects are equals, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        // Always check that it is a WaterTank
        if (o instanceof WaterTank other) { // instanceof + casting
            // == for double types means that it must be exactly the same
            // but we are OK with a bit of a difference
            return Math.abs(this.capacity - other.capacity) < 0.01
                    && Math.abs(this.temperature - other.temperature) < 0.01
                    && Math.abs(this.percentFull - other.percentFull) < 0.01;
        }

        return false;
    }

    /**
     * This method overrides the default behavior of {@link Object#toString()}.
     *
     * @return A string representation of the object
     */
    @Override
    public String toString() {
        return "WaterTank: " + this.capacity + " (capacity), " + this.temperature + " (temperature), "
                + this.percentFull + " (percentFull)";
    }
}
