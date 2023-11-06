package Servicio;

import Entidad.Cancion;
import java.util.Scanner;

public class CancionService {

    Cancion cancion =new Cancion();
    Scanner leer=new Scanner(System.in);
    
    public void crearCacion(){
        
        System.out.println("Ingrese el nombre de la cancion: ");
        cancion.setTitulo(leer.nextLine());
        
        System.out.println("Ingrese el autor de la cancion: ");
        cancion.setAutor(leer.nextLine());
        
    }
    
    public void mostrarCancion(){
        System.out.println(" Cancion ");
        System.out.println("Titulo: "+cancion.getTitulo());
        System.out.println("Autor: ~"+cancion.getAutor());
    }
}
