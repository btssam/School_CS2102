public class Battery {

    double capacity;
    double amountLeft;

    /**
     *
     * @param capacity  is the maximum power provided by the battery (when full) in milliAmpere-
     * seconds (mAs or mA-s)
     * @param amountLeft  is the current power providable by a battery in use in milliAmpere-
     * seconds (mAs or mA-s). Assume the battery can draw any amount of current without exploding
     */
    public Battery(double capacity, double amountLeft){
        this.capacity = capacity;
        this.amountLeft = amountLeft;
    }

}
