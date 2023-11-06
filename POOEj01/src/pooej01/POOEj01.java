
package pooej01;

import Entidad.Persona;
import Servicio.PersonaService;

public class POOEj01 {

    public static void main(String[] args) {
       
        Persona persona2=new Persona();//INSTANCIAR UN OBJETO ES LLAMADAR AL CONSTRUCTOR
        /*
        Al crear una instancia de la clase utilizando el constructor vacío, 
        se crea un objeto con los atributos inicializados con los valores predeterminados 
        para sus tipos de datos. Por ejemplo, los atributos numéricos se inicializan a 0, 
        los booleanos a false, los objetos de referencia a null, etc.
        */
        Persona persona1=new Persona("Erick", 20, 1006126215);
        
        /*
        En resumen, un constructor vacío se utiliza cuando no se requieren parámetros específicos 
        para inicializar los atributos de una clase, mientras que un constructor con parámetros 
        se utiliza cuando se desea proporcionar valores específicos al crear una instancia de la clase.
        */
        
        
        PersonaService persServicio = new PersonaService();
        //alojamos el retorno del metodo en un objeto de tipo Persona:
        Persona persona3 = persServicio.crearPersona();
        
        persServicio.mostrarPersona(persona3);
        
    }
    
}
