package Servicio;

import Entidad.Pelicula;
import java.util.Date;
import java.util.Scanner;

public class PeliculaService {

    private Pelicula[] peliculas;
    private int cantPeliculas;
    Scanner leer = new Scanner(System.in);
    Pelicula pelicula = new Pelicula();

    public void crearPelícula() {

        System.out.println("Cantidad de peliculas a registrar: ");
        cantPeliculas = comprobarEsNumero();
        peliculas = new Pelicula[cantPeliculas];
        leer.nextLine();

        for (int i = 0; i < cantPeliculas; i++) {
            System.out.println(" Datos pelicula " + i + 1);
            System.out.println("Nombre:");
            pelicula.setTitulo(leer.nextLine());

            System.out.println("Genero:");
            pelicula.setGenero(leer.nextLine());

            System.out.println("Fecha(dd/mm/aa): ");

            int dia = leer.nextInt();
            int mes = leer.nextInt() - 1;
            int anio = leer.nextInt() - 1900;

            Date fecha = new Date(anio, mes, dia);
            pelicula.setAño(fecha);

            System.out.println("Duración(min):");
            pelicula.setDuracionPelicula(leer.nextInt());
            leer.nextLine();

            peliculas[i] = pelicula;// asigna el objeto creado al verctor.

        }
    }

    public int comprobarEsNumero() {
        while (true) {
            if (leer.hasNextInt()) {
                int input = leer.nextInt();
                return input;
            } else {
                System.out.println("Valor incorrecto...");
            }
            System.out.println("Cantidad de peliculas a registrar:");
            leer.next();//salta la entrada incorrecta, para volver a perdir un valor, reiniciar el bucle.
        }
    }

    public void listarPeliculasDisponibles() {
        System.out.println(" Peliculas Disponibles ");
        for (int i = 0; i < cantPeliculas; i++) {
            System.out.println(peliculas[i].toString());

        }
    }

    public void buscarPeliculaTitulo() {
        System.out.println("Titulo de la pelicula a buscar: ");
        String peli = leer.nextLine();
        Boolean existe = false;
        for (int i = 0; i < cantPeliculas; i++) {
            if (peli.equalsIgnoreCase(pelicula.getTitulo())) {
                existe = true;
                break;
            }
        }
        if (existe) {
            System.out.println(peli + " existe...");
        } else {
            System.out.println(peli + " no existe...");
        }
    }

    public void buscarPeliculaGenero() {
        System.out.println("Genero de la pelicula a buscar: ");
        String genero = leer.nextLine();
        int cont = 0;

        for (int i = 0; i < cantPeliculas; i++) {
            if (genero.equalsIgnoreCase(pelicula.getGenero())) {
                cont++;
                System.out.println(peliculas[i].getTitulo());
            }
        }
        if (cont == 0) {
            System.out.println("No hay peliculas con ese genero...");
        }
    }
}
