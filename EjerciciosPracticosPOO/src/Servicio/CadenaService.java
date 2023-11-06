package Servicio;

import Entidad.Cadena;
import java.util.Scanner;

public class CadenaService {

    Scanner leer = new Scanner(System.in);
    Cadena cadena = new Cadena();

    public Cadena crearCadena() {

        System.out.println("Ingrese una palabra o frase:");
        cadena.setFrase(leer.nextLine());
        cadena.setLongitud(cadena.getFrase().length());
        return cadena;
    }

    public int mostrarVocales() {
        int n = cadena.getLongitud();
        int cont = 0;
        for (int i = 0; i < n; i++) {
            char letra = cadena.getFrase().toLowerCase().charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                cont++;
            }
        }
        return cont;
    }

    public void invertirFrase() {

        StringBuilder fraseInvertida = new StringBuilder(cadena.getFrase());
        fraseInvertida.reverse();

        System.out.println("Frase invertida: " + fraseInvertida.toString().trim());
    }

    public void vecesRepetido(String letra) {

        char l = letra.charAt(0);
        int n = cadena.getLongitud();
        int cont = 0;
        for (int i = 0; i < n; i++) {
            char caracter = cadena.getFrase().toLowerCase().charAt(i);
            if (caracter == l) {
                cont++;
            }
        }
        System.out.println("El caracter '" + l + "' se repite " + cont + " veces");
    }

    public void comparLongitud(String frase) {

        int diferencia = cadena.getLongitud() - frase.length();
        int caracteres = Math.abs(diferencia);
        if (diferencia < 0) {
            System.out.println("La frase ingresada supera a la frase base por: " + caracteres + " caracteres");
        } else {
            System.out.println("La frase ingresada le hacen falta " + caracteres + " caracteres para igualar a la frase base...");
        }

    }

    public void unirFrases(String frase) {

        String fraseBase = cadena.getFrase();

        fraseBase += frase;

        System.out.println("Frase nueva: " + fraseBase);

    }

    public void remplazar(String letra) {
        String frase = cadena.getFrase();

        String fraseRemplazo = frase.replaceFirst("a", letra);

        System.out.println("Frase con remplazos: " + fraseRemplazo);

    }

    public boolean contiene(String letra) {

        char ltr = letra.charAt(0);
        int n = cadena.getLongitud();

        for (int i = 0; i < n; i++) {
            char caracter = cadena.getFrase().toLowerCase().charAt(i);
            if (caracter == ltr) {
                return true;
            }
        }
        return false;

    }
}
