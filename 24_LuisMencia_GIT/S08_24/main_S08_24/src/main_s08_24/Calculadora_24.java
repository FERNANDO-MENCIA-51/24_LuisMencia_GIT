/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main_s08_24;

public class Calculadora_24 {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 5;

        // Suma
        int suma = numero1 + numero2;
        System.out.println("Suma: " + suma);

        // Resta
        int resta = numero1 - numero2;
        System.out.println("Resta: " + resta);

        // Multiplicación
        int multiplicacion = numero1 * numero2;
        System.out.println("Multiplicación: " + multiplicacion);

        // División
        if (numero2 != 0) {
            double division = (double) numero1 / numero2;
            System.out.println("División: " + division);
        } else {
            System.out.println("No se puede dividir por cero.");
        }
    }
}
