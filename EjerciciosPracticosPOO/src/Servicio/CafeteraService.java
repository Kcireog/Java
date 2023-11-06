package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;

public class CafeteraService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Cafetera cafetera = new Cafetera();//instancia de la entidad, plantilla/molde que usara el servicio

    public Cafetera llenarCafetera() {
        cafetera.setCapacidadMaxima(1000);
        cafetera.setCapacidadActual(cafetera.getCapacidadMaxima());
        return cafetera;
    }

    public void servirTaza() {

        System.out.println("Tamaño de la taza: ");
        int tamañoTaza = leer.nextInt();
        System.out.println("Sirviendo la taza...");

        if (cafetera.getCapacidadActual() < tamañoTaza) {
            System.out.println("La taza no fuene llenada del todo...");
            System.out.println("la taza fue llenada con: " + cafetera.getCapacidadActual() + " ml");

        } else {
            System.out.println("Taza llena...");
        }
    }

    public void vaciarCafetera() {
        cafetera.setCapacidadActual(0);
    }

    public void agregarCafe() {
        System.out.println("Agregue cafe a la cafetera: ");
        int cafe = leer.nextInt();

        while (cafe > cafetera.getCapacidadMaxima()) {

            System.out.println("Esa cantidad supera la cantidad maxima de la cafetera");
            System.out.println("Agregue cafe a la cafetera: ");
            cafe = leer.nextInt();

        }
        int temp = cafetera.getCapacidadActual();
        temp += cafe;
        cafetera.setCapacidadActual(temp);
        System.out.println("Cantidad actual cafetera: " + cafetera.getCapacidadActual());

    }
    
}
