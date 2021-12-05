/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author fabri
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double angulo1;
        double angulo2;
        double angulo3;

        System.out.println("Ingrese el grado (primer valor): ");
        angulo1 = entrada.nextDouble();

        System.out.println("Ingrese el grado (segundo valor): ");
        angulo2 = entrada.nextDouble();

        System.out.println("Ingrese el grado (tercer valor): ");
        angulo3 = entrada.nextDouble();

        if ((angulo1 == 90) || (angulo2 == 90) || (angulo3 == 90)) {
            System.out.println("Los grados ingresados pertenecen a un Triángulo Rectángulo");
        } else {
            if (((angulo1 > 90) && (angulo1 < 180)) || ((angulo2 > 90) && (angulo2 < 180)) || ((angulo3 > 90) && (angulo3 < 180))) {
                System.out.println("Los grados ingresados pertenecen a un Triángulo Obtusángulo");
            } else {
                if ((angulo1 < 90) && (angulo2 < 90) && (angulo3 < 90)) {
                    System.out.println("Los grados ingresados pertenecen a un Triángulo Acutángulo");
                }
            }
        }
    }

}
