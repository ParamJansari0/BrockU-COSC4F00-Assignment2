/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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

    @Test
    public void testSinQuadrant1() {
        System.out.println("sin");
        double x = MyTrigClass.toDegrees(45);
        double expResult = 1 / MyTrigClass.sqrt(2);
        double result = MyTrigClass.sin(x);
        assertEquals(expResult, result, 0.0);
    }

    public void testSinQuadrant2() {
        System.out.println("sin");
        double x = 0.0;
        double expResult = 0.0;
        double result = MyTrigClass.sin(x);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public void testSinQuadrant3() {
        System.out.println("sin");
        double x = 0.0;
        double expResult = 0.0;
        double result = MyTrigClass.sin(x);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public void testSinQuadrant4() {
        System.out.println("sin");
        double x = 0.0;
        double expResult = 0.0;
        double result = MyTrigClass.sin(x);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cos method, of class MyTrigClass.
     */
    @Test
    public void testCosQuadrant1() {
        System.out.println("cos");
        double x = 0.0;
        double expResult = 0.0;
        double result = MyTrigClass.cos(x);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cos method, of class MyTrigClass.
     */
    @Test
    public void testCosQuadrant2() {
        System.out.println("cos");
        double x = 0.0;
        double expResult = 0.0;
        double result = MyTrigClass.cos(x);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cos method, of class MyTrigClass.
     */
    @Test
    public void testCosQuadrant3() {
        System.out.println("cos");
        double x = 0.0;
        double expResult = 0.0;
        double result = MyTrigClass.cos(x);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cos method, of class MyTrigClass.
     */
    @Test
    public void testCosQuadrant4() {
        System.out.println("cos");
        double x = 0.0;
        double expResult = 0.0;
        double result = MyTrigClass.cos(x);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tan method, of class MyTrigClass.
     */
    @Test
    public void testTanQuadrant1() {
        System.out.println("tan");
        double x = 0.0;
        double expResult = 0.0;
        double result = MyTrigClass.tan(x);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tan method, of class MyTrigClass.
     */
    @Test
    public void testTanQuadrant2() {
        System.out.println("tan");
        double x = 0.0;
        double expResult = 0.0;
        double result = MyTrigClass.tan(x);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tan method, of class MyTrigClass.
     */
    @Test
    public void testTanQuadrant3() {
        System.out.println("tan");
        double x = 0.0;
        double expResult = 0.0;
        double result = MyTrigClass.tan(x);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tan method, of class MyTrigClass.
     */
    @Test
    public void testTanQuadrant4() {
        System.out.println("tan");
        double x = 0.0;
        double expResult = 0.0;
        double result = MyTrigClass.tan(x);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cot method, of class MyTrigClass.
     */
    @Test
    public void testCotQuadrant1() {
        System.out.println("cot");
        double x = 0.0;
        double expResult = 0.0;
        double result = MyTrigClass.cot(x);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cot method, of class MyTrigClass.
     */
    @Test
    public void testCotQuadrant2() {
        System.out.println("cot");
        double x = 0.0;
        double expResult = 0.0;
        double result = MyTrigClass.cot(x);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cot method, of class MyTrigClass.
     */
    @Test
    public void testCotQuadrant3() {
        System.out.println("cot");
        double x = 0.0;
        double expResult = 0.0;
        double result = MyTrigClass.cot(x);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cot method, of class MyTrigClass.
     */
    @Test
    public void testCotQuadrant4() {
        System.out.println("cot");
        double x = 0.0;
        double expResult = 0.0;
        double result = MyTrigClass.cot(x);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sec method, of class MyTrigClass.
     */
    @Test
    public void testSecQuadrant1() {
        System.out.println("sec");
        double x = 0.0;
        double expResult = 0.0;
        double result = MyTrigClass.sec(x);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sec method, of class MyTrigClass.
     */
    @Test
    public void testSecQuadrant2() {
        System.out.println("sec");
        double x = 0.0;
        double expResult = 0.0;
        double result = MyTrigClass.sec(x);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sec method, of class MyTrigClass.
     */
    @Test
    public void testSecQuadrant3() {
        System.out.println("sec");
        double x = 0.0;
        double expResult = 0.0;
        double result = MyTrigClass.sec(x);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sec method, of class MyTrigClass.
     */
    @Test
    public void testSecQuadrant4() {
        System.out.println("sec");
        double x = 0.0;
        double expResult = 0.0;
        double result = MyTrigClass.sec(x);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of csc method, of class MyTrigClass.
     */
    @Test
    public void testCscQuadrant1() {
        System.out.println("csc");
        double x = 0.0;
        double expResult = 0.0;
        double result = MyTrigClass.csc(x);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of csc method, of class MyTrigClass.
     */
    @Test
    public void testCscQuadrant2() {
        System.out.println("csc");
        double x = 0.0;
        double expResult = 0.0;
        double result = MyTrigClass.csc(x);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of csc method, of class MyTrigClass.
     */
    @Test
    public void testCscQuadrant3() {
        System.out.println("csc");
        double x = 0.0;
        double expResult = 0.0;
        double result = MyTrigClass.csc(x);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of csc method, of class MyTrigClass.
     */
    @Test
    public void testCscQuadrant4() {
        System.out.println("csc");
        double x = 0.0;
        double expResult = 0.0;
        double result = MyTrigClass.csc(x);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toRadians method, of class MyTrigClass.
     */
    @Test
    public void testToRadians() {
        System.out.println("toRadians");
        double degrees = 1;
        double expResult = 0.017453292519943295;
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
