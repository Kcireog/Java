//Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
//de 2 dígitos, etcétera (hasta 5 dígitos).
package GuiaJavaIntro.EjerciciosPracticos;

import java.util.*;

public class Practico17 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Tamaño del vector: ");
        int n = leer.nextInt();

        int[] vector = new int[n];
        LlenarVector(vector, n);

        int[] conteo = new int[6];  // Índice 0 no se utiliza, del 1 al 5 dígitos
        ContarDigitos(vector, conteo);
        MostrarVector(vector, n);
        MostrarResultados(conteo);
    }

    public static void LlenarVector(int[] vector, int n) {
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 100000);
        }
    }

    public static void ContarDigitos(int[] vector, int[] conteo) {
        for (int num : vector) {// for each para asignar cada valor del vector a una variable y evaluar cuantos digitos tiene
            int digitos = ContarDigitosNumero(num);
            if (digitos >= 1 && digitos <= 5) {
                conteo[digitos]++;//almacena la cantidad de digitos en la posicion correspondiente
                /*
                El arreglo conteo almacenará el conteo de números de 1 dígito en conteo[1], 
                el conteo de números de 2 dígitos en conteo[2], y así sucesivamente hasta los números de 5 dígitos en conteo[5].
                */
            }
        }
    }

    public static int ContarDigitosNumero(int numero) {
        if (numero == 0) {
            return 1;  // El número 0 tiene 1 dígito
        }

        int digitos = 0;
        while (numero != 0) {
            numero /= 10;//numero=numero/10 para ir reduciendo los digitos y contarlos
            digitos++;
        }

        return digitos;
    }

    public static void MostrarVector(int[] vector, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("[" + vector[i] + "] ");
        }
        System.out.println("");
    }

    public static void MostrarResultados(int[] conteo) {
        System.out.println("\nResultados:");
        for (int i = 1; i < conteo.length; i++) {
            System.out.println("Números de " + i + " dígito(s): " + conteo[i]);
        }
    }

}
