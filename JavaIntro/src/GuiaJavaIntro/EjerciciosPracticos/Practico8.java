//Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
//usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
//pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
//Nota: investigar la función Lenght() en Java.
package GuiaJavaIntro.EjerciciosPracticos;

import java.util.*;

public class Practico8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        int tamaño;
        System.out.println("Escriba una frase o palabra: ");
        frase = leer.nextLine();
        tamaño=frase.length();
        if(tamaño<=8){
            System.out.println("Correcto...");
        }else{
             System.out.println("Incorrecto...");
        }
    }
}
