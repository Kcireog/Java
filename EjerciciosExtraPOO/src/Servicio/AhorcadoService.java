package Servicio;

import Entidad.Ahorcado;
import java.util.Scanner;

public class AhorcadoService {

    Scanner leer = new Scanner(System.in);
    Ahorcado ahorcado = new Ahorcado();
    int jugadasRealizadas = 0;

    public void crearJuego() {

        System.out.println("Ingrese la palabra para jugar: ");
        ahorcado.setPalabra(leer.nextLine().toLowerCase().toCharArray());//convierte la palabra ingresada en un arreglo de char y se lo asigna al atributo

        System.out.println("Jugadas maximas:");
        ahorcado.setCantJugadasMax(leer.nextInt());
        leer.nextLine();

        ahorcado.setCantLetrasEncontradas(0);

    }

    public void longitud() {
        System.out.print("Longitud de la palabra a encontrar: ");
        System.out.println(ahorcado.getPalabra().length);
    }

    public void buscar(char letra) {

        boolean esEncontrada = encontradas(letra);

        if (esEncontrada) {
            System.out.println("La letra pertenece a la palabra...");
        } else {
            System.out.println("La letra no pertenece a la palabra...");
            jugadasRealizadas++;

        }
    }
    int letrasEncontradas = 0;

    public boolean encontradas(char letra) {

        for (char l : ahorcado.getPalabra()) {
            if (l == letra) {
                letrasEncontradas++;
            }
        }
        ahorcado.setCantLetrasEncontradas(letrasEncontradas);

        int letrasFaltantes = ahorcado.getPalabra().length - letrasEncontradas;

        System.out.println("Numero de letras (encontradas, faltantes) : (" + letrasEncontradas + "," + letrasFaltantes + ")");

        return letrasEncontradas > 0;// devuelve true/false si la letra fue/o no encontrada
    }

    public void intentos() {
        int oportunidadesRestantes = ahorcado.getCantJugadasMax() - jugadasRealizadas;
        System.out.println("Oportunidades restantes: " + oportunidadesRestantes);
    }

    public void juego() {
        crearJuego();
        while (ahorcado.getCantLetrasEncontradas() < ahorcado.getPalabra().length && jugadasRealizadas < ahorcado.getCantJugadasMax()) {

            System.out.println("Ingrese una letra: ");
            char letra = leer.nextLine().charAt(0);

            longitud();
            buscar(letra);
            intentos();
            System.out.println("------------------------------------");

        }
        if (ahorcado.getCantLetrasEncontradas() == ahorcado.getPalabra().length) {
            System.out.println("¡Felicidades! Has descubierto toda la palabra: " + new String(ahorcado.getPalabra()));
        } else {
            System.out.println("Se te han agotado las oportunidades");
        }
    }

}
