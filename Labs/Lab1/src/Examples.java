import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Examples {

    @Test
    public void testPercentUntilRecharge50Percent() {
        MAV mav1 = new MAV("bumblebee",
                new Propellers(4, 1, 0.25),
                new Battery(10, 10), 20);
        assertEquals(0.5, mav1.percentUntilRecharge(), 0.01);
    }

    @Test
    public void testPercentUntilRecharge100Percent() {
        MAV mav1 = new MAV("bumblebee",
                new Propellers(4, 1, 0.25),
                new Battery(10, 10), 1);
        assertEquals(1.0, mav1.percentUntilRecharge(), 0.01);
    }

    @Test
    public void doesReachDestFalse() {
        MAV mav1 = new MAV("bumblebee",
                new Propellers(4, 1, 0.25),
                new Battery(10, 10), 20);
        assertEquals(false, mav1.doesReachDest());
    }

    @Test
    public void doesReachDestTrue() {
        MAV mav1 = new MAV("bumblebee",
                new Propellers(4, 1, 0.25),
                new Battery(10, 10), 1);
        assertEquals(true, mav1.doesReachDest());
    }

    @Test
    public void whichGoesFurtherA() {
        MAV mav1 = new MAV("bumblebee",
                new Propellers(4, 1, 0.25),
                new Battery(10, 10), 1);
        MAV mav2 = new MAV("bumblebee",
                new Propellers(4, 5, 0.25),
                new Battery(10, 10), 1);
        assertEquals(mav2.name, mav1.whichGoesFurther(mav2));
    }

    @Test
    public void whichGoesFurtherB() {
        MAV mav1 = new MAV("bumblebee",
                new Propellers(4, 5, 0.25),
                new Battery(10, 10), 1);
        MAV mav2 = new MAV("bumblebee",
                new Propellers(4, 1, 0.25),
                new Battery(10, 10), 1);
        assertEquals(mav1.name, mav1.whichGoesFurther(mav2));
    }


    @Test
    public void whichGoesFurtherC() {
        MAV mav1 = new MAV("bumblebee",
                new Propellers(4, 1, 0.25),
                new Battery(10, 10), 1);
        MAV mav2 = new MAV("megatron",
                new Propellers(4, 1, 0.25),
                new Battery(10, 10), 1);
        assertEquals(mav1.name + '&' + mav2.name, mav1.whichGoesFurther(mav2));
    }

    @Test
    public void testFlyForA() {
        MAV mav1 = new MAV("bumblebee",
                new Propellers(4, 1, 0.25),
                new Battery(10, 10), 2);
        mav1.flyFor(1);
        assertEquals(9, mav1.battery.amountLeft, 0.01);
        assertEquals(1, mav1.metersToDest, 0.01);
    }

    @Test
    public void testFlyForB() {
        MAV mav1 = new MAV("bumblebee",
                new Propellers(4, 1, 0.25),
                new Battery(10, 0.2), 0.2);
        mav1.flyFor(1);
        assertEquals(0, mav1.battery.amountLeft, 0.01);
        assertEquals(0, mav1.metersToDest, 0.01);
    }

}
