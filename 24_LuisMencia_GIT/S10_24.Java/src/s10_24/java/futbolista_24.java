/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s10_24.java;

/**
 *
 * @author FERNANDO
 */

public class futbolista_24 extends seleccionFutbol_24{
    public futbolista_24(int dorsal, String demarcacion) {
    this.dorsal = dorsal;
    this.demarcacion = demarcacion;
    }
            
//metodo constructor

    public futbolista_24(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }
            
    
    //atributos
    private int dorsal;
     private String demarcacion;
     
     
     //metodos
    
     public void jugar(){
     }
     
     public void entrenar() {
     }
     
     
     
   
}
