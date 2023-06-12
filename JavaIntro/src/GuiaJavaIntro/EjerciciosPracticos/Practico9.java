//Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
//es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
//diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
//la función Substring y equals() de Java.
package GuiaJavaIntro.EjerciciosPracticos;

import java.util.Scanner;

public class Practico9 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String frase;
        String letra;
        
        System.out.println("Escriba una frase o palabra: ");
        frase = leer.nextLine().toUpperCase();
      //fraccionDeString = nombreDelString.substring (carácter Inicial Incluido, carácter Final Excluido)
        letra = frase.substring(0,1);
        
        if (letra.equals("A")) {
            System.out.println("Correcto...");
        } else {
            System.out.println("Incorrecto...");
        }
    }
}
