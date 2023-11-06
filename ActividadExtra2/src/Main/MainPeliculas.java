package Main;

import Servicio.AlquilerService;
import Servicio.PeliculaService;
import java.util.Scanner;

public class MainPeliculas {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        PeliculaService ps = new PeliculaService();
        AlquilerService as = new AlquilerService();

        int opc;
        do {
            menu();
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    ps.crearPelícula();
                    break;
                case 2:
                    ps.listarPeliculasDisponibles();
                    break;
                case 3:
                    as.crearAlquiler();
                    break;
                case 4:
                    as.listarPeliculasAlquiladas();
                    break;
                case 5:
                    ps.buscarPeliculaTitulo();
                    break;
                case 6:
                    ps.buscarPeliculaGenero();
                    break;
                case 7:
                    as.buscarAlquilerFecha();
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Opcion invalida....");
                    ;
            }
        } while (opc != 8);
    }

    public static void menu() {
        System.out.println("""
                           1. Cargar peliculas
                           2. Listar Peliculas
                           3. Cargar peliculas
                           4. Listar alquieres
                           5. Buscar peliculas titulo
                           6. Buscar peliculas genero
                           7. Buscar alquileres fecha
                           8. salir
                           """);

    }
}
