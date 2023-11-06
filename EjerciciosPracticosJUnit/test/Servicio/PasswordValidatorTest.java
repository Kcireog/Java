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
public class PasswordValidatorTest {

    public PasswordValidatorTest() {
    }
    PasswordValidator ps;

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        ps = new PasswordValidator();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testLongitudContraseña() {
        assertTrue(ps.longitudContraseña("mel_mEl"));
    }

    @Test
    public void testMayusculas() {
        assertFalse(ps.mayusculas("mel_mel"));
    }

    @Test
    public void testCaracteresEsp() {
        assertTrue(ps.caracteresEsp("mel_mEl"));
    }

}
