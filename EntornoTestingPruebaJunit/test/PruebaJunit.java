/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import entornotestingpruebajunit.Calculadora;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adrian
 */
public class PruebaJunit {
    
    double n1;
    double n2;
    double esperado;  
    Calculadora objetoCalculadora = new Calculadora(); 
    
    public PruebaJunit() {
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
        n1 = 2;
        n2 = 4;
        esperado = 6;
        
        assertEquals(esperado, objetoCalculadora.suma(n1,n2), 0.1);
    }
    
    @Test
    public void restaTest() {
        n1 = 8;
        n2 = 4;
        esperado = 4;
        assertEquals(esperado, objetoCalculadora.resta(n1, n2), 0);
    }
}
