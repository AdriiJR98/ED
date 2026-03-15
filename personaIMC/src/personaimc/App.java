/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package personaimc;

import java.util.Scanner;

/**
 *
 * @author adrian
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Persona[] personas = new Persona[3];

        for (int i = 0; i < personas.length; i++) {

            System.out.println("Persona " + (i + 1));

            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Apellidos: ");
            String apellidos = sc.nextLine();

            Persona p = new Persona(nombre, apellidos);

            System.out.print("Edad: ");
            p.setEDAD(sc.nextInt());

            System.out.print("Sexo (H/M): ");
            p.setSEXO(sc.next().charAt(0));

            System.out.print("Peso: ");
            p.setPESO(sc.nextDouble());

            System.out.print("Altura: ");
            p.setALTURA(sc.nextDouble());

            sc.nextLine();

            personas[i] = p;
        }

        for (Persona p : personas) {

            int imc = p.calcularIMC();

            switch (imc) {
                case -1:
                    System.out.println(p.getNOMBRE()+ " está por debajo de su peso ideal.");
                    break;
                case 0:
                    System.out.println(p.getNOMBRE() + " está en su peso ideal.");
                    break;
                default:
                    System.out.println(p.getNOMBRE() + " tiene sobrepeso.");
                    break;
            }

            if (p.esMayorDeEdad()) {
                System.out.println(p.getNOMBRE() + " es mayor de edad.");
            } else {
                System.out.println(p.getNOMBRE() + " es menor de edad.");
            }

            System.out.println("\nInformación completa:");
            System.out.println(p);
            System.out.println("-------------------");
        }

        sc.close();
    }

}
