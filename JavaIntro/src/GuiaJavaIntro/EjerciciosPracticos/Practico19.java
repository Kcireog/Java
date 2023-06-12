package GuiaJavaIntro.EjerciciosPracticos;

import java.util.*;

public class Practico19 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el tamaño de la mtariz cuadrada (nxn):");
        int n = leer.nextInt();

        int matriz[][] = new int[n][n];
        int transpuesta[][] = new int[n][n];

        LlenarMatrices(matriz, transpuesta, n);
        ComprobarAntiSimetrica(matriz, transpuesta, n);

        boolean esAntiSimetrica = ComprobarAntiSimetrica(matriz, transpuesta, n);

        if (esAntiSimetrica) {
            System.out.println("La matriz es antisimetrica...");
        } else {
            System.out.println("La matriz no es antisimetrica...");
        }
        MostrarMatrices(matriz, transpuesta, n);
        
    }

    public static void LlenarMatrices(int[][] matriz, int[][] transpuesta, int n) {
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Scanner leer = new Scanner(System.in);
                System.out.println("Ingrese los valores de la matriz:");
                matriz[i][j] = leer.nextInt();
//                matriz[i][j] = random.nextInt(21) - 10;//genera un número aleatorio entre 0 y 20 y luego le resta 10, obteniendo así valores entre -10 y 10.

            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }
    }

    public static boolean ComprobarAntiSimetrica(int[][] matriz, int[][] transpuesta, int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] != -transpuesta[i][j]) {//al negar el valor de la trasnpuesta 
//                                                          estaremos invirtiendo el signo del num
                    return false;
                }
            }
        }
        return true;
    }

    public static void MostrarMatrices(int[][] matriz, int[][] transpuesta, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println("");
        }
        System.out.println("-----------------------------------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + transpuesta[i][j] + "] ");
            }
            System.out.println("");
        }

    }
}
