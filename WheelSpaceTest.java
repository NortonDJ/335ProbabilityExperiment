

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class WheelSpaceTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class WheelSpaceTest
{
    /**
     * Default constructor for test class WheelSpaceTest
     */
    public WheelSpaceTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void test00NotOdd(){
        WheelSpace w = new WheelSpace(1, "00", "black");
        assertFalse(w.isOdd());
    }
    
    @Test
    public void test00NotEven(){
        WheelSpace w = new WheelSpace(1, "00", "black");
        assertFalse(w.isEven());
    }
    
    @Test
    public void test0NotOdd(){
        WheelSpace w = new WheelSpace(1, "0", "black");
        assertFalse(w.isOdd());
    }
    
    @Test
    public void test0NotEven(){
        WheelSpace w = new WheelSpace(1, "0", "black");
        assertFalse(w.isEven());
    }
    
    @Test
    public void testColorBlackIdentifiesBlack(){
        WheelSpace w = new WheelSpace(1, "0", "black");
        assertTrue(w.isBlack());
    }
    
    @Test
    public void testColorRedIdentifiesRed(){
        WheelSpace w = new WheelSpace(1, "0", "red");
        assertTrue(w.isRed());
    }
    
    @Test
    public void testColorBlackNotIdentifiesRed(){
        WheelSpace w = new WheelSpace(1, "0", "black");
        assertFalse(w.isRed());
    }
    
    @Test
    public void testColorRedNotIdentifiesBlack(){
        WheelSpace w = new WheelSpace(1, "0", "red");
        assertFalse(w.isBlack());
    }
}
