package wpioo.lecture05.activity;

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
}
