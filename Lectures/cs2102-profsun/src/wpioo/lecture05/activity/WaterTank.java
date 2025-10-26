package wpioo.lecture05.activity;

/**
 * A passive "Hot Water Heater" tank
 *
 * @author Prof. Matthew Ahrens
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class WaterTank {

    /** capacity in Liters */
    public double capacity;

    /** temperature in Celsius */
    public double temperature;

    /** percent full of hot water (0.0% - 100.0%) */
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
}
