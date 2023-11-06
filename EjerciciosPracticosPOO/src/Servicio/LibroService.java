package Servicio;

import Entidad.Libro;
import java.util.Scanner;

public class LibroService {

    public Libro cargarLibro() {

        Scanner leer = new Scanner(System.in);
        Libro libroCompleto = new Libro();

        System.out.println("    DATOS DEL LIBRO     ");

        System.out.println("ISBN: ");
        libroCompleto.setIsbn(leer.nextInt());

        System.out.println("Titulo: ");
        leer.nextLine();
        libroCompleto.setTitulo(leer.nextLine());

        System.out.println("Autor: ");
        libroCompleto.setAutor(leer.nextLine());

        System.out.println("Numero de paginas: ");
        libroCompleto.setNumPag(leer.nextInt());

        return libroCompleto;
    }

    public void mostrarLibro(Libro libro1) {

        System.out.println(" Datos Libro 1 ");

        System.out.println("ISBN: " + libro1.getIsbn()
                + "\nTitulo: " + libro1.getTitulo()
                + "\nAutor: " + libro1.getAutor()
                + "\nNumero Paginas: " + libro1.getNumPag());
    }
}
