/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Servicio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rodri
 */
public class DiscountCalculatorTest {

    public DiscountCalculatorTest() {
    }
    DiscountCalculator dc;

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        dc = new DiscountCalculator();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testDiscout() {
        assertEquals(5000, dc.Discount(10000, 50), 0);
        assertEquals(7500, dc.Discount(10000, 25), 0);
        assertEquals(800, dc.Discount(1000, 20), 0);

    }

}
