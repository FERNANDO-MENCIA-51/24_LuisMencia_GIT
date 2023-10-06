/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s10_24.java;

import java.util.ArrayList;


public class S10_24Java {
    
    public static void main(String[] args) {
        
        
        futbolista_00 futbolista1 = new futbolista_00(9, "arquero", 1, "paolo", "guerrero", 42);
        masajista_00 masajista1  = new masajista_00("si", 15, 2, "raul", "Martines", 50);
        entrenador_00 RicardoGareca = new entrenador_00("uno", 1, "Ricardo", "Gareca", 65);
        
        //ENTRESNAR
        futbolista1.concentrarse();
        futbolista1.entrenar();
        
        masajista1.darMasaje();
        masajista1.concentrarse();
        
        
                
        
        
    }

}
