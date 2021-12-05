/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio09;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author fabri
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
    
       boolean bandera = true;
       String cadena = "";
       int contador = 0;
       String signo;
       int numero;

       while (bandera){
    System.out.println("Ingrese un número para la serie (8 números): ");
    numero = entrada.nextInt();
    
    contador = contador + 1;
    if (contador % 2 == 0){
        signo = "+";
    }else{
        signo = "-";
    }
    if (contador == 8){
        signo = "";
    }
    cadena = (cadena + numero + signo);
    if (contador == 8){
        bandera = false;
    
    
    
       } 
    }
       System.out.println("S1 = " + cadena);
    }
    
}
