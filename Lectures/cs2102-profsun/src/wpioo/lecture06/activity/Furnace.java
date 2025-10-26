package wpioo.lecture06.activity;

/**
 * A water boiler that consumes some amount of fuel
 *
 * @author Prof. Matthew Ahrens
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class Furnace {

    /** The rate at which this furnace consumes fuel while running (kilogram of fuel per second) */
    public double fuelConsumption;

    /**
     * Instantiates the furnace to a particular thoroughput
     *
     * @param fuelConsumption
     *            (kg fuel/s)
     */
    public Furnace(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    /**
     * Calculates the number of seconds required to burn this amount of fuel
     *
     * @param amtOfFuelToBurnInKg
     *            Amount of fuel to be burned
     *
     * @return Number of seconds to consume all this fuel
     */
    public double secondsToBurnFuel(double amtOfFuelToBurnInKg) {
        // kg / (kg/s) -> s
        return amtOfFuelToBurnInKg / this.fuelConsumption;
    }

    /**
     * Calculates the amount of fuel burned after the specified number of seconds
     *
     * @param seconds
     *            Number of seconds to run the furnace
     *
     * @return Amount of fuel burned in kg
     */
    public double kgBurnedAfter(double seconds) {
        // (kg / s) * s -> kg
        return this.fuelConsumption * seconds;
    }
}
