//Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
//muestre por pantalla en orden descendente.
package GuiaJavaIntro.EjerciciosPracticos;

import java.util.*;

public class Practico15 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int[] vector = new int[100];

        LlenarVector(vector);
        MostrarVector(vector);
    }
    public static void LlenarVector(int[] vector) {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 100; i++) {
            vector[i] = i + 1;

        }
    }
    public static void MostrarVector(int[] vector) {
        for (int i = 99; i >= 0; i--) {//empezara desde la posicion final hasta llegar a una posición igual a 0, es decir la incial
            System.out.print("[" + vector[i] + "] ");
        }
        System.out.println("");
    }
}
