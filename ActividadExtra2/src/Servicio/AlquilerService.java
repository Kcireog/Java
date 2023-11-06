package Servicio;

import Entidad.Alquiler;
import java.util.Date;
import java.util.Scanner;

public class AlquilerService {

    private Alquiler[] alquiladas;
    private int cantAlquiladas;
    Scanner leer = new Scanner(System.in);
    Alquiler alquiler = new Alquiler();

    public void crearAlquiler() {

        System.out.println("Cantidad de peliculas a alquilar: ");
        cantAlquiladas = comprobarEsNumero();
        alquiladas = new Alquiler[cantAlquiladas];
        leer.nextLine();

        for (int i = 0; i < cantAlquiladas; i++) {
            System.out.println(" Datos Alquiler " + i + 1);
            System.out.println("Pelicula Alquilada: ");
            alquiler.setPeliculaAlquilada(leer.nextLine());

            System.out.println("Fecha inicio(dd/mm/aa):");

            int dia = leer.nextInt();
            int mes = leer.nextInt() - 1;
            int anio = leer.nextInt() - 1900;

            Date fecha = new Date(anio, mes, dia);
            alquiler.setFechaInicio(fecha);

            System.out.println("Fecha fin(dd/mm/aa):");

            dia = leer.nextInt();
            mes = leer.nextInt() - 1;
            anio = leer.nextInt() - 1900;

            fecha = new Date(anio, mes, dia);
            alquiler.setFechaFin(fecha);

            costoServicio(alquiler);
            alquiladas[i] = alquiler;

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

    public void costoServicio(Alquiler alquiler) {

        long milisegundos = alquiler.getFechaFin().getTime() - alquiler.getFechaInicio().getTime();

        int dias = (int) (milisegundos / (1000 * 60 * 60 * 24));

        System.out.println(dias);

        if (dias <= 3) {

            alquiler.setPrecio(10);

        } else {

            double precio = 10 + (10 * 0.1 * (dias - 3));

            alquiler.setPrecio(precio);

        }

    }

    public void listarPeliculasAlquiladas() {
        System.out.println(" Peliculas Disponibles ");
        for (int i = 0; i < cantAlquiladas; i++) {
            System.out.println(alquiladas[i].toString());

        }
    }
    
    public void buscarAlquilerFecha(){
        boolean existe=false;
        System.out.println("Fecha de la pelicula a buscar(dd/mm/aa):");
        Date fecha= new Date(comprobarEsNumero()-1900,comprobarEsNumero()-1,comprobarEsNumero());
        for (int i = 0; i < cantAlquiladas; i++) {
            if(fecha.equals(alquiladas[i].getFechaInicio())){
                existe=true;
                System.out.println(alquiladas[i].toString());
            }
        }
        if(!existe){
            System.out.println("No disponible...");
        }
    }
}
