/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import personaimc.Persona;

/**
 *
 * @author adrian
 */
public class PersonaTest {
    

    Persona p = new Persona();

    public PersonaTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void pesoIdealTest() {

        p.setALTURA(1.70);
        p.setPESO(60);

        assertEquals(0, p.calcularIMC(), 0);
    }

    @Test
    public void bajoDePesoTest() {

        p.setALTURA(1.70);
        p.setPESO(55);

        assertEquals(-1, p.calcularIMC(), 0);

    }

    @Test
    public void sobrepesoTest() {

        p.setALTURA(1.70);
        p.setPESO(90);

        assertEquals(1, p.calcularIMC(), 0);

    }

    @Test
    public void esMayorEdadTest() {

        p.setEDAD(19);

        assertTrue(p.esMayorDeEdad());

    }

    @Test
    public void esMenorEdadTest() {

        p.setEDAD(16);

        assertFalse(p.esMayorDeEdad());

    }

    @Test
    public void esHombreTest() {

        p.setSEXO('H');
        p.comprobarSexo();

        assertTrue(p.getSEXO() == 'H');
    }

    @Test
    public void esMujerTest() {

        p.setSEXO('M');
        p.comprobarSexo();

        assertTrue(p.getSEXO() == 'M');
    }

    @Test
    public void esErrorTest() {

        p.setSEXO('V');
        p.comprobarSexo();

        assertTrue(p.getSEXO() == 'H');
    }
}
