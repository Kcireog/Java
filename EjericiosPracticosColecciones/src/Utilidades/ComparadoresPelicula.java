package Utilidades;

import Entidad.Pelicula;
import java.util.Comparator;

public class ComparadoresPelicula {
    /**
     * Ordenar de menor a mayor duracion las peliculas
     */
    public static Comparator<Pelicula> ordenarPorDuraciónAscendente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getDuracion().compareTo(o2.getDuracion());
        }
    };

    /**
     * Ordenar de mayor a menor duracion las peliculas
     */
    public static Comparator<Pelicula> ordenarPorDuraciónDescendente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o2.getDuracion().compareTo(o1.getDuracion());
        }
    };

    /**
     * Ordena por orden alfabetico las peliculas A-Z
     */
    public static Comparator<Pelicula> ordenarPorTituloAlfabeticamente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getTitulo().compareTo(o2.getTitulo());
        }
    };
    /**
     * Ordena por orden alfabetico las peliculas A-Z
     */
    public static Comparator<Pelicula> ordenarPorDirectorAlfabeticamente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getDirector().compareTo(o2.getDirector());
        }
    };

}
