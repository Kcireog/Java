package Servicio;

import Entidad.Pelicula;
import Utilidades.ComparadoresPelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PeliculaService {

    private Scanner leer;
    private List<Pelicula> peliculas;

    public PeliculaService() {
        this.leer = new Scanner(System.in);
        this.peliculas = new ArrayList();
    }

    public Pelicula crearPelicula() {

        Pelicula peli = new Pelicula();
        System.out.println(" --Datos Pelicula--");
        System.out.println("Titulo:");
        peli.setTitulo(leer.nextLine());

        System.out.println("Director:");
        peli.setDirector(leer.nextLine());

        System.out.println("Duración:");
        peli.setDuracion(leer.nextInt());
        leer.nextLine();

        peliculas.add(peli);
        return peli;
    }

    public void fabricaPeliculas() {
        boolean seguir = true;

        while (seguir) {
            crearPelicula();

            System.out.println("¿Quiere crear otra pelicula? S/N");
            String respuesta = leer.nextLine();
            seguir = respuesta.equalsIgnoreCase("s");
        }
    }

    public void mostrarPeliculas() {
        System.out.println("""
                           
                ----Peliculas----""");

        for (Pelicula var : peliculas) {
            System.out.println(var.toString());
        }
    }

    public void mostrarPeliculasMayorUnaHora() {
        System.out.println("""
                           
                           --Peliculas >1hr--""");
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getDuracion() >= 1) {
                System.out.println(pelicula.toString());
            }
        }
    }

    public void ordenarDuracionPeliculasDescendente() {
        Collections.sort(peliculas, ComparadoresPelicula.ordenarPorDuraciónDescendente);
        mostrarPeliculas();
    }

    public void ordenarDuracionPeliculasAscendente() {
        Collections.sort(peliculas, ComparadoresPelicula.ordenarPorDuraciónAscendente);
        mostrarPeliculas();
    }

    public void ordenarAlfabeticamentePorTitulo() {
        Collections.sort(peliculas, ComparadoresPelicula.ordenarPorTituloAlfabeticamente);
        mostrarPeliculas();
    }

    public void ordenarAlfabeticamentePorDirector() {
        Collections.sort(peliculas, ComparadoresPelicula.ordenarPorDirectorAlfabeticamente);
        mostrarPeliculas();
    }
}
