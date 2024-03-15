/*
 * . Se tienen tres esferas (A, B, C) de diferente peso, elaborar un algoritmo que determine cuál es la esfera de mayor peso
 */
package javaejercicio24;

import java.util.Scanner;

public class JavaEjercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Definición de variables
        double pesoA, pesoB, pesoC;

        // Entrada de datos
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el peso de la esfera A: ");
        pesoA = scanner.nextDouble();

        System.out.println("Ingrese el peso de la esfera B: ");
        pesoB = scanner.nextDouble();

        System.out.println("Ingrese el peso de la esfera C: ");
        pesoC = scanner.nextDouble();

        // Proceso con condicionales
        if (pesoA > pesoB && pesoA > pesoC) {
            System.out.println("La esfera A es la de mayor peso.");
        } else if (pesoB > pesoA && pesoB > pesoC) {
            System.out.println("La esfera B es la de mayor peso.");
        } else if (pesoC > pesoA && pesoC > pesoB) {
            System.out.println("La esfera C es la de mayor peso.");
        } else {
            System.out.println("Las esferas tienen pesos iguales.");
        }
    }
    
}
