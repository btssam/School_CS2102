public class MAV {

    String name;
    Propellers propellers;
    Battery battery;
    double metersToDest;


    /**
     *
     * @param name is any identifier
     * @param propellers manage the propeller statistics
     * @param battery manages the battery statistics and state
     * @param metersToDest represents how far it has left to go until it has reached a target in
     * meters
     */
    public MAV(String name, Propellers propellers, Battery battery, double metersToDest){
        this.name = name;
        this.propellers = propellers;
        this.battery = battery;
        this.metersToDest = metersToDest;
    }

    /**
     * Computes the ratio (a number between 0.0 and 1.0) of (1)
     * meters travelable on its current battery’s amount left to (2) meters until its destination.
     * If the vehicle can go past its destination, the method should produce 1.0.
     * @return
     */
    double percentUntilRecharge(){
        //look at meterstoDest, battery.amountLeft and propellers.speed and propellers.currentDrawEach
        double metersTravelable;
        metersTravelable = propellers.speed * battery.amountLeft/
                propellers.currentDrawEach /propellers.count;
        //metersTravelable coule be a helper method
        return Math.min(metersTravelable/metersToDest, 1.0);
    }

    /**
     *  produces true if the vehicle can reach the destination on its current
     * battery’s amount left. Otherwise, it produces false.
     * @return
     */
    boolean doesReachDest(){
        if (percentUntilRecharge() >= 1.0){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * produces the name of whichever vehicle, this one or the
     * parameter one, that can go further (in meters) on its full battery capacity. If there is a tie
     * (within 0.01 meters), it produces the names in the following format:
     * "thisVehiclesName&paramVehiclesName"
     * @return
     */
    String whichGoesFurther(MAV otherMAV){
        return "";
    }

    /**
     * produces no output. It mutates the state of this vehicle. It travels for the
     * provided number of seconds at the speed of its propellers, moving the vehicle closer to
     * its destination and using its current amount of battery. Compute the meters traveled
     * and the amount of battery spent independently. That is, assume if the vehicle runs out
     * of battery early, it still travels a distance corresponding to the full amount of time, and if
     * it gets to its destination early, it still drains the battery for the full amount of time. The
     * method should not leave the vehicle with a negative meters-to-destination nor a
     * negative amount of battery left, and instead set those fields to 0.
     */
    void flyFor(double seconds){

    }



}
