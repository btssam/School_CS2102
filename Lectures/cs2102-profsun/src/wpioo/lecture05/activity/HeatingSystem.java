package wpioo.lecture05.activity;
//package Lectures.cs2102-profsun.src.wpioo.lecture05.activity;

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
    public HeatingSystem(wpioo.lecture05.activity.Furnace furnace, wpioo.lecture05.activity.WaterTank waterTank, wpioo.lecture05.activity.FuelTank fuelTank) {
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
        //Water: L
        //WaterTank: Amount of water in L
        double litersOfWater = this.waterTank.capacity * this.waterTank.percentFull / 100.0;

        //Water Tank: current temperature in C, but I need 60
        double degreesToHeat = 60 - this.waterTank.temperature;
        if (degreesToHeat < 0){
            return 0.0;
        }

        //(L * C)/ (C * L / kg)-> kg
        double kgOfFuelToBurn = (litersOfWater * degreesToHeat) / this.fuelTank.kcalPotential;

        //kg / (kg/s) -> s
        double seconds = kgOfFuelToBurn / this.furnace.fuelConsumption;
        // Output ?s
        return seconds;
    }

//        // in Liters

//        double amountOfWaterToHeat = this.waterTank.capacity * this.waterTank.percentFull / 100.0;
//
//        // Degrees C
//        double deltaDegrees = 60 - this.waterTank.temperature;
//        if (deltaDegrees < 0) {
//            return 0;
//        }
//
//        // (C * L) / (C*L/kg) -> kg
//        double kgOfFuelToBurn = (amountOfWaterToHeat * deltaDegrees) / this.fuelTank.kcalPotential;
//
//        // kg / (kg/s) -> s
//        double timeToBurnFuel = kgOfFuelToBurn / this.furnace.fuelConsumption;
//        return timeToBurnFuel;
//    }
//
//    /**
//     * Run the heating system for some unit of seconds
//     *
//     * @param seconds
//     *            Side effects: - raises the temperature of the hot water tank - consumes fuel
//     */
    public void runFor(double seconds) {

        // Given seconds (how long to run system)

        //Amount of fuel to consume (kg)
        // (kg / s) * s -> kg
        double kgOfFuelToBurn = this.furnace.fuelConsumption * seconds;
        this.fuelTank.amount -= kgOfFuelToBurn;
        if (this.fuelTank.amount < 0){
            this.fuelTank.amount = 0.0;
        }

        // (C*L / kg) * kg -> (C * L)
        double

        // (C*L) / L --> C

    }
//        // (kg / s) * s -> kg
//        double kgOfFuelToBurn = this.furnace.fuelConsumption * seconds;
//
//        this.fuelTank.amount -= kgOfFuelToBurn;
//        if (this.fuelTank.amount < 0) {
//            this.fuelTank.amount = 0.0;
//        }
//
//        // (C * L / kg) * kg -> C * L
//        double celsiusLiters = this.fuelTank.kcalPotential * kgOfFuelToBurn;
//
//        // (C * L) / L -> C
//        double deltaTemperature = celsiusLiters / (this.waterTank.capacity * (this.waterTank.percentFull / 100.0));
//        this.waterTank.temperature += deltaTemperature;
//    }
}
