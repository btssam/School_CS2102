package wpioo.lecture20.activity;

import org.junit.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.*;

/**
 * This class contains our JUnit test methods.
 *
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class Examples {

    /**
     * Test case where we attempt to retrieve an integer value when the map is empty.
     */
    @Test
    public void testGetMapEmpty() {
        Map<Integer, Integer> map = new HashMap<>();
        assertFalse(15 != map.get(1));
    }
}
