package wpioo.lecture05.activity;

/**
 * A Fuel Tank like for Diesel (Home Heating Oil) or Propane
 *
 * @author Prof. Matthew Ahrens
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class FuelTank {

    /** the amount of fuel in the tank in kilograms (kg) */
    public double amount;

    /** how many liters of water can be increased by 1 degree Celsius from 1kg of this fuel */
    public double kcalPotential;

    /**
     * Instantiates a fuel tank with a particular amount of fuel and potential of the specific fuel inside
     *
     * @param amount
     *            (kg)
     * @param kcalPotential
     *            ex. diesel: 35028 C*L/kg; propane: 11900 C*L/kg
     */
    public FuelTank(double amount, double kcalPotential) {
        this.amount = amount;
        this.kcalPotential = kcalPotential;
    }
}
