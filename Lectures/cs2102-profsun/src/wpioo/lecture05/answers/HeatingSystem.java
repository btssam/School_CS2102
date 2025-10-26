package wpioo.lecture05.answers;

/**
 * A complete heating system with multiple subcomponents
 *
 * @author Prof. Matthew Ahrens
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class HeatingSystem {

    /** A water boiler that consumes some amount of fuel */
    public Furnace furnace;

    /** A "Hot Water Heater" tank */
    public WaterTank waterTank;

    /** A Fuel Tank like for Diesel (Home Heating Oil) or Propane */
    public FuelTank fuelTank;

    /**
     * Construct a heating system object
     *
     * @param furnace
     *            A water boiler that consumes some amount of fuel
     * @param waterTank
     *            A "Hot Water Heater" tan
     * @param fuelTank
     *            A water boiler that consumes some amount of fuel
     */
    public HeatingSystem(Furnace furnace, WaterTank waterTank, FuelTank fuelTank) {
        this.furnace = furnace;
        this.waterTank = waterTank;
        this.fuelTank = fuelTank;
    }

    /**
     * Uses the current fuel and water to get to 60 degrees
     *
     * @return the time to get to 60 degrees Celsius in seconds
     */
    public double secondsUntil60Degrees() {
        // in Liters
        double amountOfWaterToHeat = this.waterTank.currentLiters();

        // Degrees C
        double deltaDegrees = this.waterTank.deltaTempTo(60);
        double kgOfFuelToBurn = this.fuelTank.kgOfFuelToBurn(amountOfWaterToHeat, deltaDegrees);

        return this.furnace.secondsToBurnFuel(kgOfFuelToBurn);
    }

    /**
     * Run the heating system for some unit of seconds
     *
     * @param seconds
     *            Side effects: - raises the temperature of the hot water tank - consumes fuel
     */
    public void runFor(double seconds) {
        double kgOfFuelToBurn = this.furnace.kgBurnedAfter(seconds);

        // Updating how much fuel is left in my fuel tank
        this.fuelTank.spendKgOfFuel(kgOfFuelToBurn);

        // Celsius per liter raised after burning some amount of fuel
        double celsiusLiters = this.fuelTank.celsius1LiterRaisedAfterBurning(kgOfFuelToBurn);

        // (C * L) / L -> C
        double deltaTemperature = celsiusLiters / this.waterTank.currentLiters();

        // Update the temperature of the water tank
        this.waterTank.raiseBy(deltaTemperature);
    }
}
