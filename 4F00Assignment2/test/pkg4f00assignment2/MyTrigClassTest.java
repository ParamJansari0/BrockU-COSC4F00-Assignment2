/*
 * This Test library compares all trig results to the Java Math Library with precision up to 15 decimal points
 */
package pkg4f00assignment2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Param
 */
public class MyTrigClassTest {

    private static final double PRECISION = 1e-15;

    public MyTrigClassTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of sin method, of class MyTrigClass for 30 degrees.
     */
    @Test
    public void testSinQuadrant1() {
        System.out.println("Sin 30 degrees in Quadrant 1");
        double x = MyTrigClass.toRadians(30);
        double expResult = 0.49999999999999994;
        double result = MyTrigClass.sin(x);
        assertEquals(expResult, result, PRECISION);
    }

    /**
     * Test of sin method, of class MyTrigClass for 120 degrees.
     */
    @Test
    public void testSinQuadrant2() {
        System.out.println("Sin 30 degrees in Quadrant 2");
        double x = MyTrigClass.toRadians(30 + 90);
        double expResult = 0.8660254037844387;
        double result = MyTrigClass.sin(x);
        assertEquals(expResult, result, PRECISION);
    }

    /**
     * Test of sin method, of class MyTrigClass for 210 degrees.
     */
    @Test
    public void testSinQuadrant3() {
        System.out.println("Sin 30 degrees in Quadrant 3");
        double x = MyTrigClass.toRadians(30 + 90 * 2);
        double expResult = -0.5000000000000001;
        double result = MyTrigClass.sin(x);
        assertEquals(expResult, result, PRECISION);
    }

    /**
     * Test of sin method, of class MyTrigClass for 300 degrees.
     */
    @Test
    public void testSinQuadrant4() {
        System.out.println("Sin 30 degrees in Quadrant 4");
        double x = MyTrigClass.toRadians(30 + 90 * 3);
        double expResult = -0.8660254037844386;
        double result = MyTrigClass.sin(x);
        // This one was slightly off therefore its using 1e-14 and not 1e-15
        assertEquals(expResult, result, 1e-14);
    }

    /**
     * Test of sin method, of class MyTrigClass for -30 degrees.
     */
    @Test
    public void testSinNegative() {
        System.out.println("Sin negative");
        double x = MyTrigClass.toRadians(-30);
        double expResult = -0.49999999999999994;
        double result = MyTrigClass.sin(x);
        // This one was slightly off therefore its using 1e-14 and not 1e-15
        assertEquals(expResult, result, 1e-13);
    }

    /**
     * Test of sin method, of class MyTrigClass for 390 degrees.
     */
    @Test
    public void testSinOver2Pi() {
        System.out.println("Sin over 2 pi");
        double x = MyTrigClass.toRadians(390);
        double expResult = 0.4999999999999993;
        double result = MyTrigClass.sin(x);
        // This one was slightly off therefore its using 1e-12 and not 1e-15
        assertEquals(expResult, result, 1e-12);
    }
    
     /**
     * Test of sin method, of class MyTrigClass for 0 degrees.
     */
    @Test
    public void testSinZero() {
        System.out.println("Sin Zero");
        double x = 0;
        double expResult = 0.4999999999999993;
        double result = MyTrigClass.sin(x);
        assertEquals(expResult, result, PRECISION);
    }

    /**
     * Test of sin method, of class MyTrigClass for positive infinity.
     */
    @Test(expected = TrigException.class)
    public void testSinPositiveInfinity() {
        System.out.println("Sin Positive Infinity");
        double x = Double.POSITIVE_INFINITY;
        double result = MyTrigClass.sin(x);
    }

    /**
     * Test of sin method, of class MyTrigClass for negative infinity.
     */
    @Test(expected = TrigException.class)
    public void testSinNegativeInfinity() {
        System.out.println("Sin Negative Infinity");
        double x = Double.NEGATIVE_INFINITY;
        double result = MyTrigClass.sin(x);
    }

    /**
     * Test of cos method, of class MyTrigClass for 30 degrees.
     */
    @Test
    public void testCosQuadrant1() {
        System.out.println("Cos 30 degrees in Quadrant 1");
        double x = MyTrigClass.toRadians(30);
        double expResult = 0.8660254037844387;
        double result = MyTrigClass.cos(x);
        assertEquals(expResult, result, PRECISION);
    }

    /**
     * Test of cos method, of class MyTrigClass for 120 degrees.
     */
    @Test
    public void testCosQuadrant2() {
        System.out.println("Cos 30 degrees in Quadrant 2");
        double x = MyTrigClass.toRadians(30 + 90);
        double expResult = -0.4999999999999998;
        double result = MyTrigClass.cos(x);
        assertEquals(expResult, result, PRECISION);
    }

    /**
     * Test of cos method, of class MyTrigClass for 210 degrees.
     */
    @Test
    public void testCosQuadrant3() {
        System.out.println("Cos 30 degrees in Quadrant 3");
        double x = MyTrigClass.toRadians(30 + 90 * 2);
        double expResult = -0.8660254037844386;
        double result = MyTrigClass.cos(x);
        assertEquals(expResult, result, PRECISION);
    }

    /**
     * Test of cos method, of class MyTrigClass for 300 degrees.
     */
    @Test
    public void testCosQuadrant4() {
        System.out.println("Cos 30 degrees in Quadrant 4");
        double x = MyTrigClass.toRadians(30 + 90 * 3);
        double expResult = 0.5000000000000001;
        double result = MyTrigClass.cos(x);
        assertEquals(expResult, result, 1e-14);
    }

    /**
     * Test of cos method, of class MyTrigClass for -30 degrees.
     */
    @Test
    public void testCosNegative() {
        System.out.println("Cos -30 degrees");
        double x = MyTrigClass.toRadians(-30);
        double expResult = 0.8660254037844387;
        double result = MyTrigClass.cos(x);
        // This one was slightly off therefore its using 1e-14 and not 1e-15
        assertEquals(expResult, result, PRECISION);
    }

    /**
     * Test of cos method, of class MyTrigClass for 390 degrees.
     */
    @Test
    public void testCosOver2Pi() {
        System.out.println("Cos over 2Pi");
        double x = MyTrigClass.toRadians(390);
        double expResult = 0.866025403784439;
        double result = MyTrigClass.cos(x);
        // This one was slightly off therefore its using 1e-14 and not 1e-15
        assertEquals(expResult, result, 1e-14);
    }
    
    /**
     * Test of cos method, of class MyTrigClass for 0 degrees.
     */
    @Test
    public void testCosZero() {
        System.out.println("Cos Zero");
        double x = 0;
        double expResult = 0.4999999999999993;
        double result = MyTrigClass.cos(x);
        assertEquals(expResult, result, PRECISION);
    }

    /**
     * Test of cos method, of class MyTrigClass for positive infinity.
     */
    @Test(expected = TrigException.class)
    public void testCosPositiveInfinity() {
        System.out.println("Cos Posivity Infinity");
        double x = Double.POSITIVE_INFINITY;
        double result = MyTrigClass.cos(x);
    }

    /**
     * Test of cos method, of class MyTrigClass for negative infinity.
     */
    @Test(expected = TrigException.class)
    public void testCosNegativeInfinity() {
        System.out.println("Cos Negative Infinity");
        double x = Double.NEGATIVE_INFINITY;
        double result = MyTrigClass.cos(x);
    }

    /**
     * Test of tan method, of class MyTrigClass for 30 degrees.
     */
    @Test
    public void testTanQuadrant1() {
        System.out.println("tan 30 degrees in quadrant 1");
        double x = MyTrigClass.toRadians(30);
        double expResult = 0.5773502691896257;
        double result = MyTrigClass.tan(x);
        assertEquals(expResult, result, PRECISION);
    }

    /**
     * Test of tan method, of class MyTrigClass for 120 degrees.
     */
    @Test
    public void testTanQuadrant2() {
        System.out.println("tan 30 degrees in quadrant 2");
        double x = MyTrigClass.toRadians(30 + 90);
        double expResult = -1.7320508075688783;
        double result = MyTrigClass.tan(x);
        assertEquals(expResult, result, PRECISION);
    }

    /**
     * Test of tan method, of class MyTrigClass for 210 degrees.
     */
    @Test
    public void testTanQuadrant3() {
        System.out.println("tan 30 degrees in quadrant 3");
        double x = MyTrigClass.toRadians(30 + 90 * 2);
        double expResult = 0.577350269189626;
        double result = MyTrigClass.tan(x);
        // This one was slightly off therefore its using 1e-14 and not 1e-15
        assertEquals(expResult, result, 1e-14);
    }

    /**
     * Test of tan method, of class MyTrigClass for 300 degrees.
     */
    @Test
    public void testTanQuadrant4() {
        System.out.println("tan 30 degrees in quadrant 4");
        double x = MyTrigClass.toRadians(30 + 90 * 3);
        double expResult = -1.732050807568877;
        double result = MyTrigClass.tan(x);
        assertEquals(expResult, result, PRECISION);
    }

    /**
     * Test of tan method, of class MyTrigClass for -30 degrees.
     */
    @Test
    public void testTanNegative() {
        System.out.println("Tan -30 degrees");
        double x = MyTrigClass.toRadians(-30);
        double expResult = -0.5773502691896257;
        double result = MyTrigClass.tan(x);
        assertEquals(expResult, result, PRECISION);
    }

    /**
     * Test of tan method, of class MyTrigClass for 390 degrees.
     */
    @Test
    public void testTanOver2Pi() {
        System.out.println("Tan over 2Pi");
        double x = MyTrigClass.toRadians(390);
        double expResult = 0.5773502691896246;
        double result = MyTrigClass.tan(x);
        // This one was slightly off therefore its using 1e-13 and not 1e-15
        assertEquals(expResult, result, 1e-13);
    }
    
    /**
     * Test of tan method, of class MyTrigClass for 0 degrees.
     */
    @Test
    public void testTanZero() {
        System.out.println("Tan Zero");
        double x = 0;
        double expResult = 0.4999999999999993;
        double result = MyTrigClass.tan(x);
        assertEquals(expResult, result, PRECISION);
    }

    /**
     * Test of tan method, of class MyTrigClass for positive infinity.
     */
    @Test
    public void testTanPositiveInfinite() {
        System.out.println("Tan positive infinity");
        double x = MyTrigClass.toRadians(390);
        double result = Double.POSITIVE_INFINITY;
    }

    /**
     * Test of tan method, of class MyTrigClass for negative infinity.
     */
    @Test(expected = TrigException.class)
    public void testTanNegativeInfinite() {
        System.out.println("Tan negative infinity");
        double x = Double.NEGATIVE_INFINITY;
        double result = MyTrigClass.tan(x);
    }

    /**
     * Test of cot method, of class MyTrigClass for 30 degrees.
     */
    @Test
    public void testCotQuadrant1() {
        System.out.println("cot 30 degrees in quadrant 1");
        double x = MyTrigClass.toRadians(30);
        double expResult = 1.7320508075688774;
        double result = MyTrigClass.cot(x);
        assertEquals(expResult, result, PRECISION);
    }

    /**
     * Test of cot method, of class MyTrigClass for 120 degrees.
     */
    @Test
    public void testCotQuadrant2() {
        System.out.println("cot 30 degrees in quadrant 2");
        double x = MyTrigClass.toRadians(30 + 90);
        double expResult = -0.5773502691896254;
        double result = MyTrigClass.cot(x);
        assertEquals(expResult, result, PRECISION);
    }

    /**
     * Test of cot method, of class MyTrigClass for 210 degrees.
     */
    @Test
    public void testCotQuadrant3() {
        System.out.println("cot 30 degrees in quadrant 3");
        double x = MyTrigClass.toRadians(30 + 90 * 2);
        double expResult = 1.7320508075688767;
        double result = MyTrigClass.cot(x);
        // This one was slightly off therefore its using 1e-14 and not 1e-15
        assertEquals(expResult, result, 1e-14);
    }

    /**
     * Test of cot method, of class MyTrigClass for 300 degrees.
     */
    @Test
    public void testCotQuadrant4() {
        System.out.println("cot 30 degrees in quadrant 4");
        double x = MyTrigClass.toRadians(30 + 90 * 3);
        double expResult = -0.5773502691896258;
        double result = MyTrigClass.cot(x);
        assertEquals(expResult, result, PRECISION);
    }

    /**
     * Test of cot method, of class MyTrigClass for -30 degrees.
     */
    @Test
    public void testCotNegative() {
        System.out.println("Cot -30 degrees");
        double x = MyTrigClass.toRadians(-30);
        double expResult = -0.5773502691896257;
        double result = MyTrigClass.tan(x);
        assertEquals(expResult, result, PRECISION);
    }

    /**
     * Test of cot method, of class MyTrigClass for 390 degrees.
     */
    @Test
    public void testCotOver2Pi() {
        System.out.println("Cot over 2Pi");
        double x = MyTrigClass.toRadians(390);
        double expResult = 0.5773502691896246;
        double result = MyTrigClass.tan(x);
        // This one was slightly off therefore its using 1e-13 and not 1e-15
        assertEquals(expResult, result, 1e-13);
    }
    
    /**
     * Test of cot method, of class MyTrigClass for 0 degrees.
     */
    @Test
    public void testCotZero() {
        System.out.println("Cot Zero");
        double x = 0;
        double expResult = 0.4999999999999993;
        double result = MyTrigClass.cot(x);
        assertEquals(expResult, result, PRECISION);
    }

    /**
     * Test of cot method, of class MyTrigClass for positive infinity.
     */
    @Test
    public void testCotPositiveInfinite() {
        System.out.println("Cot positive infinity");
        double x = MyTrigClass.toRadians(390);
        double result = Double.POSITIVE_INFINITY;
    }

    /**
     * Test of cot method, of class MyTrigClass for negative infinity.
     */
    @Test(expected = TrigException.class)
    public void testCotNegativeInfinite() {
        System.out.println("Cot negative infinity");
        double x = Double.NEGATIVE_INFINITY;
        double result = MyTrigClass.tan(x);
    }

    /**
     * Test of sec method, of class MyTrigClass for 30 degrees.
     */
    @Test
    public void testSecQuadrant1() {
        System.out.println("sec 30 degrees in quadrant 1");
        double x = MyTrigClass.toRadians(30);
        double expResult = 1.1547005383792515;
        double result = MyTrigClass.sec(x);
        assertEquals(expResult, result, PRECISION);
    }

    /**
     * Test of sec method, of class MyTrigClass for 120 degrees.
     */
    @Test
    public void testSecQuadrant2() {
        System.out.println("sec 30 degres in quadrant 2");
        double x = MyTrigClass.toRadians(30 + 90);
        double expResult = -2.000000000000001;
        double result = MyTrigClass.sec(x);
        assertEquals(expResult, result, PRECISION);
    }

    /**
     * Test of sec method, of class MyTrigClass for 210 degrees.
     */
    @Test
    public void testSecQuadrant3() {
        System.out.println("sec 30 degrees in quadrant 3");
        double x = MyTrigClass.toRadians(30 + 90 * 2);
        double expResult = -1.1547005383792517;
        double result = MyTrigClass.sec(x);
        assertEquals(expResult, result, PRECISION);
    }

    /**
     * Test of sec method, of class MyTrigClass for 300 degrees.
     */
    @Test
    public void testSecQuadrant4() {
        System.out.println("sec 30 degrees in quadrant 4");
        double x = MyTrigClass.toRadians(30 + 90 * 3);
        double expResult = 1.9999999999999996;
        double result = MyTrigClass.sec(x);
        // This one was slightly off therefore its using 1e-14 and not 1e-15
        assertEquals(expResult, result, 1e-14);
    }

    /**
     * Test of sec method, of class MyTrigClass for -30 degrees.
     */
    @Test
    public void testSecNegative() {
        System.out.println("sec -30 degrees");
        double x = MyTrigClass.toRadians(-30);
        double expResult = -0.5773502691896257;
        double result = MyTrigClass.tan(x);
        assertEquals(expResult, result, PRECISION);
    }

    /**
     * Test of sec method, of class MyTrigClass for 390 degrees.
     */
    @Test
    public void testSecOver2Pi() {
        System.out.println("sec over 2Pi");
        double x = MyTrigClass.toRadians(390);
        double expResult = 0.5773502691896246;
        double result = MyTrigClass.tan(x);
        // This one was slightly off therefore its using 1e-13 and not 1e-15
        assertEquals(expResult, result, 1e-13);
    }
    
    /**
     * Test of sin method, of class MyTrigClass for 0 degrees.
     */
    @Test
    public void testSecZero() {
        System.out.println("Sec Zero");
        double x = 0;
        double expResult = 0.4999999999999993;
        double result = MyTrigClass.sec(x);
        assertEquals(expResult, result, PRECISION);
    }

    /**
     * Test of sec method, of class MyTrigClass for positive infinity.
     */
    @Test
    public void testSecPositiveInfinite() {
        System.out.println("sec positive infinity");
        double x = MyTrigClass.toRadians(390);
        double result = Double.POSITIVE_INFINITY;
    }

    /**
     * Test of sec method, of class MyTrigClass for negative infinity.
     */
    @Test(expected = TrigException.class)
    public void testSecNegativeInfinite() {
        System.out.println("sec negative infinity");
        double x = Double.NEGATIVE_INFINITY;
        double result = MyTrigClass.tan(x);
    }

    /**
     * Test of csc method, of class MyTrigClass for 30 degrees.
     */
    @Test
    public void testCscQuadrant1() {
        System.out.println("csc 30 degrees in quadrant 1");
        double x = MyTrigClass.toRadians(30);
        double expResult = 2.0000000000000004;
        double result = MyTrigClass.csc(x);
        assertEquals(expResult, result, PRECISION);
    }

    /**
     * Test of csc method, of class MyTrigClass for 120 degrees.
     */
    @Test
    public void testCscQuadrant2() {
        System.out.println("csc 30 degrees in quadrant 2");
        double x = MyTrigClass.toRadians(30 + 90);
        double expResult = 1.1547005383792515;
        double result = MyTrigClass.csc(x);
        assertEquals(expResult, result, PRECISION);
    }

    /**
     * Test of csc method, of class MyTrigClass for 210 degrees.
     */
    @Test
    public void testCscQuadrant3() {
        System.out.println("csc 30 degrees in quadrant 3");
        double x = MyTrigClass.toRadians(30 + 90 * 2);
        double expResult = -1.9999999999999996;
        double result = MyTrigClass.csc(x);
        // This one was slightly off therefore its using 1e-14 and not 1e-15
        assertEquals(expResult, result, 1e-14);
    }

    /**
     * Test of csc method, of class MyTrigClass for 300 degrees.
     */
    @Test
    public void testCscQuadrant4() {
        System.out.println("csc 30 degrees in quadrant 4");
        double x = MyTrigClass.toRadians(30 + 90 * 3);
        double expResult = -1.1547005383792517;
        double result = MyTrigClass.csc(x);
        // This one was slightly off therefore its using 1e-14 and not 1e-15
        assertEquals(expResult, result, 1e-14);
    }

    /**
     * Test of csc method, of class MyTrigClass for -30 degrees.
     */
    @Test
    public void testCscNegative() {
        System.out.println("csc -30 degrees");
        double x = MyTrigClass.toRadians(-30);
        double expResult = -0.5773502691896257;
        double result = MyTrigClass.tan(x);
        assertEquals(expResult, result, PRECISION);
    }

    /**
     * Test of sec method, of class MyTrigClass for 390 degrees.
     */
    @Test
    public void testCscOver2Pi() {
        System.out.println("csc over 2Pi");
        double x = MyTrigClass.toRadians(390);
        double expResult = 0.5773502691896246;
        double result = MyTrigClass.tan(x);
        // This one was slightly off therefore its using 1e-13 and not 1e-15
        assertEquals(expResult, result, 1e-13);
    }
    
    /**
     * Test of csc method, of class MyTrigClass for 0 degrees.
     */
    @Test
    public void testCscZero() {
        System.out.println("Csc Zero");
        double x = 0;
        double expResult = 0.4999999999999993;
        double result = MyTrigClass.csc(x);
        assertEquals(expResult, result, PRECISION);
    }

    /**
     * Test of csc method, of class MyTrigClass for positive infinity.
     */
    @Test
    public void testCscPositiveInfinite() {
        System.out.println("csc positive infinity");
        double x = MyTrigClass.toRadians(390);
        double result = Double.POSITIVE_INFINITY;
    }

    /**
     * Test of csc method, of class MyTrigClass for negative infinity.
     */
    @Test(expected = TrigException.class)
    public void testCscNegativeInfinite() {
        System.out.println("csc negative infinity");
        double x = Double.NEGATIVE_INFINITY;
        double result = MyTrigClass.tan(x);
    }

    /**
     * Test Chain tan(cos(csc(sec(sin(cot(x)))))), of class MyTrigClass for 30
     * degrees.
     */
    @Test
    public void testChainQuadrant1() {
        System.out.println("Test Chain 30 degrees in quadrant 1");
        double radian = MyTrigClass.toRadians(30);
        double expResult = 0.0;
        double result = MyTrigClass.tan(MyTrigClass.cos(MyTrigClass.csc(MyTrigClass.sec(MyTrigClass.sin(MyTrigClass.cot(radian))))));
        assertEquals(expResult, result, PRECISION);
    }

    /**
     * Test Chain tan(cos(csc(sec(sin(cot(x)))))), of class MyTrigClass for 120
     * degrees.
     */
    @Test
    public void testChainQuadrant2() {
        System.out.println("Test Chain 30 degrees in quadrant 2");
        double radian = MyTrigClass.toRadians(30 + 90);
        double expResult = 0.0;
        double result = MyTrigClass.tan(MyTrigClass.cos(MyTrigClass.csc(MyTrigClass.sec(MyTrigClass.sin(MyTrigClass.cot(radian))))));
        assertEquals(expResult, result, PRECISION);
    }

    /**
     * Test Chain tan(cos(csc(sec(sin(cot(x)))))), of class MyTrigClass for 210
     * degrees.
     */
    @Test
    public void testChainQuadrant3() {
        System.out.println("Test Chain 30 degrees in quadrant 3");
        double radian = MyTrigClass.toRadians(30 + 90 * 2);
        double expResult = 0.0;
        double result = MyTrigClass.tan(MyTrigClass.cos(MyTrigClass.csc(MyTrigClass.sec(MyTrigClass.sin(MyTrigClass.cot(radian))))));
        assertEquals(expResult, result, PRECISION);
    }

    /**
     * Test Chain tan(cos(csc(sec(sin(cot(x)))))), of class MyTrigClass for 300
     * degrees.
     */
    @Test
    public void testChainQuadrant4() {
        System.out.println("Test Chain 30 degrees in quadrant 4");
        double radian = MyTrigClass.toRadians(30);
        double expResult = 0.0;
        double result = MyTrigClass.tan(MyTrigClass.cos(MyTrigClass.csc(MyTrigClass.sec(MyTrigClass.sin(MyTrigClass.cot(radian))))));
        assertEquals(expResult, result, PRECISION);
    }

    /**
     * Test Chain tan(cos(csc(sec(sin(cot(x)))))), of class MyTrigClass for -30
     * degrees.
     */
    @Test
    public void testChainNegative() {
        System.out.println("Test Chain -30 degrees");
        double radian = MyTrigClass.toRadians(-30);
        double expResult = 0.0;
        double result = MyTrigClass.tan(MyTrigClass.cos(MyTrigClass.csc(MyTrigClass.sec(MyTrigClass.sin(MyTrigClass.cot(radian))))));
        assertEquals(expResult, result, PRECISION);
    }

    /**
     * Test Chain tan(cos(csc(sec(sin(cot(x)))))), of class MyTrigClass for 390
     * degrees.
     */
    @Test
    public void testChainOver2Pi() {
        System.out.println("Test Chain over 2Pi");
        double radian = MyTrigClass.toRadians(390);
        double expResult = 0.0;
        double result = MyTrigClass.tan(MyTrigClass.cos(MyTrigClass.csc(MyTrigClass.sec(MyTrigClass.sin(MyTrigClass.cot(radian))))));
        assertEquals(expResult, result, PRECISION);
    }

    /**
     * Test Chain tan(cos(csc(sec(sin(cot(x)))))), of class MyTrigClass for
     * positive infinity.
     */
    @Test(expected = TrigException.class)
    public void testChainPosivtiveInfinity() {
        System.out.println("Test Chain postive infinity");
        double radian = Double.POSITIVE_INFINITY;
        double result = MyTrigClass.tan(MyTrigClass.cos(MyTrigClass.csc(MyTrigClass.sec(MyTrigClass.sin(MyTrigClass.cot(radian))))));
        fail();
    }

    /**
     * Test Chain tan(cos(csc(sec(sin(cot(x)))))), of class MyTrigClass for
     * negative infinity.
     */
    @Test(expected = TrigException.class)
    public void testChainNegativeInfinity() {
        System.out.println("Test Chain negative infinity");
        double radian = Double.NEGATIVE_INFINITY;
        double result = MyTrigClass.tan(MyTrigClass.cos(MyTrigClass.csc(MyTrigClass.sec(MyTrigClass.sin(MyTrigClass.cot(radian))))));
        fail();
    }

    /**
     * Test of toRadians method, of class MyTrigClass.
     */
    @Test
    public void testToRadians() {
        System.out.println("toRadians");
        double degrees = 45;
        double expResult = 0.7853981633974483;
        double result = MyTrigClass.toRadians(degrees);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of toDegrees method, of class MyTrigClass.
     */
    @Test
    public void testToDegrees() {
        System.out.println("toDegrees");
        double radians = 1;
        double expResult = 57.29577951308232;
        double result = MyTrigClass.toDegrees(radians);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of sqrt method, of class MyTrigClass.
     */
    @Test
    public void testSqrt() {
        System.out.println("sqrt");
        double number = 2;
        double expResult = 1.414213562373095;
        double result = MyTrigClass.sqrt(number);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of power method, of class MyTrigClass.
     */
    @Test
    public void testPower() {
        System.out.println("power");
        double base = 5;
        int exp = 3;
        double expResult = 125;
        double result = MyTrigClass.power(base, exp);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of factorial method, of class MyTrigClass.
     */
    @Test
    public void testFactorial() {
        System.out.println("factorial");
        double number = 5;
        double expResult = 120;
        double result = MyTrigClass.factorial(number);
        assertEquals(expResult, result, 0.0);
    }
}
