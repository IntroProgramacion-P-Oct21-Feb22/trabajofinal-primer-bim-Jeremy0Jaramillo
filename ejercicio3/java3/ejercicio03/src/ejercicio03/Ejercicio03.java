/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author fabri
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre;
        int tipo;
        int horas;
        double cuota;
        double sueldo;

        System.out.println("Ingrese su nombre");
        nombre = entrada.nextLine();

        System.out.println("Ingrese el tipo de empleado que es (1-4)");
        tipo = entrada.nextInt();

        System.out.println("Ingrese el número de horas que trabaja: ");
        horas = entrada.nextInt();

        System.out.println("Ingrese la cuota por hora: ");
        cuota = entrada.nextDouble();

        if (horas > 40) {
        }
        if (tipo == 1) {
            cuota = cuota * 1.5;
        } else {
            if (tipo == 2) {
                cuota = cuota * 2;
            } else {
                if (tipo == 3) {
                    cuota = cuota * 2.5;
                } else {
                    if (tipo == 4) {
                        cuota = cuota * 3;
                    }

                }
            }
        }
        sueldo = horas * cuota;
        System.out.printf("Cliente: %s\nSueldo: $%.2f\n", nombre, sueldo);
    }

}
