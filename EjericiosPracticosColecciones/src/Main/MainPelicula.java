package Main;

import Servicio.PeliculaService;

public class MainPelicula {

    public static void main(String[] args) {

        PeliculaService ps = new PeliculaService();

        ps.fabricaPeliculas();
        ps.mostrarPeliculas();
        ps.mostrarPeliculasMayorUnaHora();
        ps.ordenarDuracionPeliculasDescendente();
        ps.ordenarDuracionPeliculasAscendente();
        ps.ordenarAlfabeticamentePorTitulo();
        ps.ordenarAlfabeticamentePorDirector();

    }

}
