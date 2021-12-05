/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author fabri
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String numero1;
        String signo1;
        String numero2;
        String signo2;
        String coordenada;

        System.out.println("Ingrese el signo de la coordenada en X:");
        signo1 = entrada.nextLine();

        System.out.println("Ingrese la coordenada en X (solo número): ");
        numero1 = entrada.nextLine();

        System.out.println("Ingrese el signo de la coordenada en Y:");
        signo2 = entrada.nextLine();

        System.out.println("Ingrese la coordenada en Y (solo número): ");
        numero2 = entrada.nextLine();

        coordenada = ("(" + signo1 + numero1 + ";" + signo2 + numero2 + ")");

        if ((signo1.equals("+")) && (signo2.equals("+"))) {
            System.out.printf("Las coordenadas " + coordenada + " pertenecen al 1° cuadrante\n");
        } else {
            if ((signo1.equals("-")) && (signo2.equals("+"))) {
                System.out.printf("Las coordenadas " + coordenada + " pertenecen al 2° cuadrante\n");
            } else {
                if ((signo1.equals("-")) && (signo2.equals("-"))) {
                    System.out.printf("Las coordenadas " + coordenada + " pertenecen al 3° cuadrante\n");
                } else {
                    if ((signo1.equals("+")) && (signo2.equals("-"))) {
                        System.out.printf("Las coordenadas " + coordenada + " pertenecen al 4° cuadrante\n");
                    }
                }
            }
        }

    }
}
