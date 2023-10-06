/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main_s08_24;

/**
 *
 * @author FERNANDO
 */
public class Animal_24 {
    // Atributos
    private String nombre;
    private int edad;

    // Constructor
    public Animal_24(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }

    public void comer() {
        System.out.println("El animal está comiendo.");
    }

    public void dormir() {
        System.out.println("El animal está durmiendo.");
    }

    public static void main(String[] args) {
        // Crear un objeto de la clase Animal_24
        Animal_24 animal = new Animal_24("Tigre", 5);

        // Imprimir la información del animal
        System.out.println("Nombre del animal: " + animal.getNombre());
        System.out.println("Edad del animal: " + animal.getEdad());

        // Realizar acciones del animal
        animal.hacerSonido();
        animal.comer();
        animal.dormir();
    }
}

