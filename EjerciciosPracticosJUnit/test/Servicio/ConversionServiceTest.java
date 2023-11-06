package Servicio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConversionServiceTest {

    public ConversionServiceTest() {
    }
    ConversionService cs;

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        cs = new ConversionService();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testCelciusF() {
        assertEquals(212, cs.celciusF(100), 0);
    }

    @Test
    public void testCelciusK() {
        assertEquals(373.15, cs.celciusK(100), 0);
    }

    @Test
    public void testfaKelvin() {
        assertEquals(273.15, cs.faKelvin(32), 0);
    }

    @Test
    public void testKelvinF() {
        assertEquals(32, cs.kelvinF(273.15), 0);
    }

    @Test
    public void testFCelcius() {
        assertEquals(100, cs.faCelcius(212), 0);
    }

    @Test
    public void testKCelcius() {
        assertEquals(100, cs.kCelcius(373.15), 0);
    }

}
