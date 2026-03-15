/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personaimc;

/**
 *
 * @author adrian
 */
public class Persona {

    private String NOMBRE;
    private String APELLIDOS;
    private int EDAD;
    private char SEXO;
    private double PESO;
    private double ALTURA;

    public Persona(String NOMBRE, String APELLIDOS) {
        this.NOMBRE = NOMBRE;
        this.APELLIDOS = APELLIDOS;
        this.EDAD = 0;
        this.PESO = 0;
        this.ALTURA = 0;
        this.SEXO = 'H';
    }

    public Persona() {
    }
    
    

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getAPELLIDOS() {
        return APELLIDOS;
    }

    public void setAPELLIDOS(String APELLIDOS) {
        this.APELLIDOS = APELLIDOS;
    }

    public int getEDAD() {
        return EDAD;
    }

    public void setEDAD(int EDAD) {
        this.EDAD = EDAD;
    }

    public double getPESO() {
        return PESO;
    }

    public void setPESO(double PESO) {
        this.PESO = PESO;
    }

    public double getALTURA() {
        return ALTURA;
    }

    public void setALTURA(double ALTURA) {
        this.ALTURA = ALTURA;
    }

    public char getSEXO() {
        return SEXO;
    }

    public void setSEXO(char SEXO) {
        this.SEXO = SEXO;
    }
    
    // Metodo para calcular IMC
    public int calcularIMC() {

        if (ALTURA == 0) {
            return 0;
        }

        double imc = PESO / (ALTURA * ALTURA);

        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    // Metodo para comprobar si es mayor de edad
    public boolean esMayorDeEdad() {
        return EDAD >= 18;
    }
    
    // Método para comprobar sexo
    public void comprobarSexo() {
        if (this.SEXO != 'H' && this.SEXO != 'M') {
            this.SEXO = 'H';
        }
    }

    @Override
    public String toString() {
        return "Persona{" + "NOMBRE=" + NOMBRE + ", APELLIDOS=" + APELLIDOS + ", EDAD=" + EDAD + ", SEXO=" + SEXO + ", PESO=" + PESO + ", ALTURA=" + ALTURA + '}';
    }
    
    
}
