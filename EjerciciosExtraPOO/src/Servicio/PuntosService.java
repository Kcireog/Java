package Servicio;

import Entidad.Puntos;
import java.util.Scanner;

public class PuntosService {

    Scanner leer = new Scanner(System.in);
    Puntos puntos = new Puntos();

    public void crearPuntos() {
        System.out.println(" Punto 1 ");
        System.out.println("Eje X y Y:");
        puntos.setX1(leer.nextInt());
        puntos.setY1(leer.nextInt());

        System.out.println(" Punto 2 ");
        System.out.println("Eje X y Y:");
        puntos.setX2(leer.nextInt());
        puntos.setY2(leer.nextInt());

    }

    public void distanciaPuntos() {
        int distancia;
        distancia = (int) Math.sqrt(Math.pow(puntos.getX2() - puntos.getX1(), 2) + (Math.pow(puntos.getY2() - puntos.getY1(), 2)));
        System.out.println("Distancia entre los 2 puntos: " + distancia);
    }

}
