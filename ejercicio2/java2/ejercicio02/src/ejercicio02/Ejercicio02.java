/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author fabri
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double precio;
        int cantidad;
        double descuento = 0;
        double subtotal;
        double total = 0l;
        int porcentaje;

        System.out.println("Ingrese el precio del traje: ");
        precio = entrada.nextDouble();

        System.out.println("Ingrese el número de trajes a comprar: ");
        cantidad = entrada.nextInt();

        subtotal = precio * cantidad;

        if (cantidad == 1) {
            porcentaje = 20;
            descuento = (subtotal * porcentaje) / 100;
            total = subtotal - descuento;
        } else {
            if (cantidad == 2) {
                porcentaje = 25;
                descuento = (subtotal * porcentaje) / 100;
                total = subtotal - descuento;
            } else {
                if (cantidad == 3) {
                    porcentaje = 40;
                    descuento = (subtotal * porcentaje) / 100;
                    total = subtotal - descuento;
                } else {
                    if (cantidad > 3) {
                        porcentaje = 50;
                        descuento = (subtotal * porcentaje) / 100;
                        total = subtotal - descuento;
                    }
                }
            }
        }
        System.out.printf("Subtotal: $%.2f" + "\nDescuento: $%.2f" + "\nTotal: $%.2f\n", subtotal, descuento, total);
    }

}
