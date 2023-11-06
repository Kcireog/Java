
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

public class PersonaService {
    
    public Persona crearPersona(){
        
        Scanner leer=new Scanner(System.in);
        Persona personaCompleta= new Persona();
        
        System.out.println("Ingrese el nombre de la persona:");
        personaCompleta.setNombre(leer.nextLine());
        
        System.out.println("Ingrese la edad de la persona:");
        personaCompleta.setEdad(leer.nextInt());
        
        System.out.println("Ingrese el id de la persona:");
        personaCompleta.setId(leer.nextInt());
        
        
        return personaCompleta;
    }

   
    
    public void  mostrarPersona(Persona persona3){
        
        System.out.println(" Datos Persona 3 ");
        
        System.out.println("Nombre: "+persona3.getNombre()
                            +"\nEdad: "+persona3.getEdad()
                            +"\nID: "+persona3.getId());
    }
}
