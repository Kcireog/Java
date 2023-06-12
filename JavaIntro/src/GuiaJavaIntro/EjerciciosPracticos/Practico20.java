package GuiaJavaIntro.EjerciciosPracticos;

import java.util.*;

public class Practico20 {

    public static void main(String[] args) {

        int n = 3;

        int[][] matriz = new int[n][n];
        LlenarMatriz(matriz, n);

        boolean esMagico = VerificarCuadradoMagico(matriz, n);
        MostrarMatriz(matriz, n);
        if (esMagico) {
            System.out.println("El cuadro ingresado es magico...");
        } else {
            System.out.println("El cuadro ingresado no es magico...");
        }

    }

    public static void LlenarMatriz(int[][] matriz, int n) {
        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int valor;
                do {
                    System.out.println("Ingrese el valor para la posición [" + i + "][" + j + "]:");
                    valor = leer.nextInt();
                    if (!(valor >= 1 && valor <= 9)) {// si el valor ingresado, sale del rango validado...
                        System.out.println("Solo se permiten valores entre 1 y 9...");
                    }
                } while (!(valor >= 1 && valor <= 9));
                matriz[i][j] = valor;
            }
        }

        leer.close();//para  cerrar el objeto Scanner y no seguir consumiendo recursos.
    }

    public static boolean VerificarCuadradoMagico(int[][] matriz, int n) {
        int sumaPrimerFila = 0;
        int sumaPrimerColumna = 0;
        int sumaDiagonalPrincipal = 0;
        int sumaDiagonalSecundaria = 0;

        //calcular la suma de la primer fila
        for (int j = 0; j < n; j++) {
            sumaPrimerFila += matriz[0][j];

        }

        //verificar que las filas tengan sumas iguales
        for (int i = 1; i < n; i++) {//empezamos en 1 porque ya tenemos la suma de la primer fila
            int sumaActual = 0;
            for (int j = 0; j < n; j++) {
                sumaActual += matriz[i][j];
            }
            if (sumaActual != sumaPrimerFila) {//verificamos despues de obtener la suma de la segunda fila,
//                                            para evitar seguir iterando sin sentido
                return false;
            }
        }

        //verificar que las columnas tengan sumas iguales
        for (int j = 0; j < n; j++) {
            int sumaActual = 0;
            for (int i = 0; i < n; i++) {
                sumaActual += matriz[i][j];
            }
            if (sumaActual != sumaPrimerFila) {//verificamos despues de obtener la suma de la primer columna,
//                                            para evitar seguir iterando sin sentido
                return false;
            }
        }

        //calcular la suma de la diagonal principal
        for (int i = 0; i < n; i++) {
            sumaDiagonalPrincipal += matriz[i][i];

        }

        //calcular la suma de la diagonal secundaria
        for (int i = 0; i < n; i++) {
            sumaDiagonalSecundaria += matriz[i][2 - i];
        }

        //verificar que las diagonales sumen igual
        if (sumaDiagonalPrincipal != sumaPrimerFila || sumaDiagonalSecundaria != sumaPrimerFila) {
            return false;
        }
        return true;
    }

    public static void MostrarMatriz(int[][] matriz, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println("");
        }
    }
}
