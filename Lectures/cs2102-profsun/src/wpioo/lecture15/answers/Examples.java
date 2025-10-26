package wpioo.lecture15.answers;

import org.junit.Test;
import static org.junit.Assert.*;

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
     * Test case for testing an empty immutable binary tree.
     */
    @Test
    public void testImmutableTree() {
        IBinTree<Integer> immutableBT = new BTEmpty<>();
        assertEquals(new BTEmpty<>(), immutableBT);
    }
}
