/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import entornotestingpruebajunit.Calculadora;
import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author adrian
 */
@RunWith(value = Parameterized.class)
public class SumaRestaParam {

    //atributos suma
    private double s1, s2, sEsperado;

    //atributos resta
    private double r1, r2, rEsperado;
    
    //Atributos multiplicacion
    private double m1, m2, mEsperado;

    //Atributo objeto para acceder a la clase calculadora
    Calculadora objetoCalculadora = new Calculadora();

    public SumaRestaParam(double s1, double s2, double sEsperado, double r1, double r2, double rEsperado, double m1, double m2, double mEsperado) {
        this.s1 = s1;
        this.s2 = s2;
        this.sEsperado = sEsperado;
        this.r1 = r1;
        this.r2 = r2;
        this.rEsperado = rEsperado;
        this.m1 = m1;
        this.m2 = m2;
        this.mEsperado = mEsperado;
    }

   

    

    @Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{
            {6, 2, 8, 6, 2, 4, 2, 3, 6}, 
            {8, 2, 10, 4, 8, -4, 4, 4, 16}, 
            {10, 2, 12, 10, 2, 8, 2, 5, 10}
        };
        return Arrays.asList(data);
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("Comienza la ejecucion de la clase test");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("Finaliza la ejecucion de la clase test");
    }

    @Before
    public void setUp() {
        System.out.println("Antes de ejecutar un test de la clase test");
    }

    @After
    public void tearDown() {
        System.out.println("Despues de ejecutar un test de la clase test");
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void sumaTest() {

        assertEquals(sEsperado, objetoCalculadora.suma(s1, s2), 0);
    }

    @Test
    public void restaTest() {

        assertEquals(rEsperado, objetoCalculadora.resta(r1, r2), 0);
    }
    
    @Test
    public void multiplicaTest() {

        assertEquals(mEsperado, objetoCalculadora.multiplicacion(m1, m2), 0);
    }
}
