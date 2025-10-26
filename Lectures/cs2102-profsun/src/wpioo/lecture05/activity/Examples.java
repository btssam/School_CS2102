package wpioo.lecture05.activity;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * This class contains our JUnit test methods.
 *
 * @author Prof. Matthew Ahrens
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class Examples {

    /**
     * This test case checks that we require 5 seconds until the heating system reaches 60 degrees C.
     */
    @Test
    public void testHeatingSystemSecondsUntil60DegreesC() {
        // propane: 11900 C L / kg
        // Pick nice numbers to make the math easy for a simple test
        Furnace furnace = new Furnace(10.0);
        WaterTank waterTank = new WaterTank(119000, 50, 50.0);
        FuelTank fuelTank = new FuelTank(10000, 11900);
        HeatingSystem heatingSystem = new HeatingSystem(furnace, waterTank, fuelTank);
        assertEquals(5.0, heatingSystem.secondsUntil60Degrees(), 0.01);
    }

    /**
     * This test case runs the heating system for 5 seconds and checks the water tank temperature and amount of fuel in
     * fuel tank.
     */
    @Test
    public void testHeatingSystemRunFor5Seconds() {
        // propane: 11900 C L / kg
        // Pick nice numbers to make the math easy for a simple test
        Furnace furnace = new Furnace(10.0);
        WaterTank waterTank = new WaterTank(119000, 50, 50.0);
        FuelTank fuelTank = new FuelTank(10000, 11900);
        HeatingSystem heatingSystem = new HeatingSystem(furnace, waterTank, fuelTank);
        heatingSystem.runFor(5);
        assertEquals(60.0, waterTank.temperature, 0.01);
        assertEquals(9950.0, fuelTank.amount, 0.01);
    }
}
