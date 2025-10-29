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
}
