
package Main;

import Entidad.Libro;
import Servicio.LibroService;


public class MainLibro {
    public static void main(String[] args) {
        
        LibroService libroServicio =new  LibroService();
        //alojamos el retorno del metodo en un objeto de tipo Libro:
        
        Libro libro1 = libroServicio.cargarLibro();
        
        libroServicio.mostrarLibro(libro1);
       
        
    }
}
