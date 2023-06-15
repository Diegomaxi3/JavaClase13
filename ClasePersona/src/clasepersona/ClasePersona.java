/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasepersona;
import java.util.Scanner;
import Entity.Servicio.ServicioPersona;
import Entity.Persona;
import java.util.ArrayList;
/**
 *
 * @author Diego
 */
public class ClasePersona {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona [] personas = new Persona[2];

         ServicioPersona persona = new ServicioPersona("Diego",38,94,183,"M");   
         personas[0] = new Persona("Diego",37,94,183,"M");
         personas[1] = new Persona("Laura",48,80,158,"H");
    
         for(int i = 0; i <= 3; i++){
             personas[i].toString();
         }
   
        Persona persona1 = null;
        try{
         System.out.println(persona1.getEdad());
         System.out.println(persona.esMayor(persona1));
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
           
        }
        
        System.out.println(persona.persona.toString());
       
    }
    
}
