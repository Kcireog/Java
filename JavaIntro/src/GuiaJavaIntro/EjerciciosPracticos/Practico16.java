//Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
//usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
//numero y si se encuentra repetido
package GuiaJavaIntro.EjerciciosPracticos;

import java.util.*;

public class Practico16 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del vector:");
        int n = leer.nextInt();

        int[] vector = new int[n];
        LlenarVector(vector, n);

        System.out.println("Ingrese el num a buscar:");
        int buscarnum = leer.nextInt();
        BuscarNumero(vector, n, buscarnum);
        MostrarVector(vector, n);

    }

    public static void LlenarVector(int[] vector, int n) {
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
    }

    public static void BuscarNumero(int[] vector, int n, int buscarnum) {
        boolean esencontrado = false;
        int cont = 0;
        List<Integer> posiciones = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (vector[i] == buscarnum) {
                esencontrado = true;
                cont++;
                posiciones.add(i);
            }
        }
        if (esencontrado) {
            if (cont >= 2) {
                System.out.println("Se encuentra repetido...");
            }
            System.out.println("El " + buscarnum + " se encuentra en la posicion " + posiciones);

        } else {
            System.out.println("El " + buscarnum + " no se encuentra en el vector...");
        }
    }

    public static void MostrarVector(int[] vector, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("[" + vector[i] + "] ");
        }
        System.out.println("");
    }

}
