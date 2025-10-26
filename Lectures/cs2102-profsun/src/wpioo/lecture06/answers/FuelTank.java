package wpioo.lecture06.answers;

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

    /**
     * Calculates how much fuel is burned
     *
     * @param amtWaterInLiters
     *            Amount of water to heat
     * @param deltaDegrees
     *            Number of degrees needed to heat
     *
     * @return The amount of fuel in kg to be burned
     */
    public double kgOfFuelToBurn(double amtWaterInLiters, double deltaDegrees) {
        // (C * L) / (C*L/kg) -> kg
        return (amtWaterInLiters * deltaDegrees) / this.kcalPotential;
    }

    /**
     * Updates the fuel amount after burning the specified amount of fuel
     *
     * @param kgOfFuelToBurn
     *            Amount of fuel to be burned
     */
    public void spendKgOfFuel(double kgOfFuelToBurn) {
        this.amount -= kgOfFuelToBurn;
        if (this.amount < 0) {
            this.amount = 0.0;
        }
    }

    /**
     * Calculates the Celsius per liter raised after burning some amount of fuel
     *
     * @param kgBurned
     *            the amount of fuel to burn
     *
     * @return C * L water raised by burning the fuel
     */
    public double celsius1LiterRaisedAfterBurning(double kgBurned) {
        // (C * L / kg) * kg -> C * L
        return this.kcalPotential * kgBurned;
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
        // Always check that it is a FuelTank
        if (o instanceof FuelTank other) { // instanceof + casting
            // == for double types means that it must be exactly the same
            // but we are OK with a bit of a difference
            return Math.abs(this.amount - other.amount) < 0.01
                    && Math.abs(this.kcalPotential - other.kcalPotential) < 0.01;
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
        return "FuelTank: " + this.amount + " (amount), " + this.kcalPotential + " (kcalPotential)";
    }
}
