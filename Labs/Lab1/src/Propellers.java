public class Propellers {

    int count;
    double speed;
    double currentDrawEach;

    /**
     *
     * @param count the number of propellers on the propeller unit (1, 2, 3, 4, etc.)
     * @param speed how fast the unit can go in meters-per-second
     * @param currentDrawEach how much power each propeller consumes when turned on in
     * milliAmpere-per-propeller
     */
    public Propellers(int count, double speed, double currentDrawEach){
        this.count = count;
        this.speed = speed;
        this.currentDrawEach = currentDrawEach;
    }
}
