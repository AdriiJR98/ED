/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

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
import personaimc.Persona;

/**
 *
 * @author adrian
 */

@RunWith(value = Parameterized.class)
public class PersonaTestParam {
    
    //Atributos pesoIMC
    private double altura, peso, resultadoIMC;
    
    //Atributos edad
    private int edad;
    private boolean resultEdad;
    
    //Atributos sexo
    private char sexo, resultSexo;
     

    Persona personaTest = new Persona();

    public PersonaTestParam(double altura, double peso, double resultadoIMC, int edad, boolean resultEdad, char sexo, char resultSexo) {
        this.altura = altura;
        this.peso = peso;
        this.resultadoIMC = resultadoIMC;
        this.edad = edad;
        this.resultEdad = resultEdad;
        this.sexo = sexo;
        this.resultSexo = resultSexo;
    }

    

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{
            {1.70, 60, 0, 19, true, 'H', 'H'}, 
            {1.70, 55, -1, 25, true, 'M', 'M'}, 
            {1.70, 90, 1, 12, false, 'J', 'H'}
        };
        return Arrays.asList(data);
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
    public void pesoTest() {
        
        personaTest.setPESO(peso);
        personaTest.setALTURA(altura);
        
        assertEquals(resultadoIMC, personaTest.calcularIMC(), 0);
    }

    @Test
    public void edadTest() {
        
        personaTest.setEDAD(edad);
        //assertTrue(personaTest.esMayorDeEdad());
        //assertFalse(personaTest.esMayorDeEdad());
        assertEquals(resultEdad, personaTest.esMayorDeEdad());

    }

    @Test
    public void sexoTest() {
        
        personaTest.setSEXO(sexo);
        personaTest.comprobarSexo();
        assertTrue(personaTest.getSEXO() == resultSexo);
    }
}
