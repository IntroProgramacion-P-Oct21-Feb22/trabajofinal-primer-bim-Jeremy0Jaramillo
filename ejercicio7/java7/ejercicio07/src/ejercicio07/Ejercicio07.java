/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author fabri
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int proceso = 0;
        int par = 0;
        int numero;

        System.out.println("Ingrese un número par: ");
        numero = entrada.nextInt();

        if (numero < 2) {
            System.out.println("El número ingresado es menor a 2");
        } else {
            while (par < numero) {
                par = par + 2;
                proceso = proceso + par;
            }
        }
        System.out.printf("La suma de números pares hasta el valor que ingreso da igual a:\n%d\n", proceso);
    }

}
