package GuiaJavaIntro.EjerciciosPracticos;

import java.util.*;


public class Practico21 {

    public static void main(String[] args) {
//        int[][] matrizM = new int[10][10];
        int[][] matrizM = {
            {1, 2, 3, 47, 5, 6, 72, 81, 95, 10},
            {4, 5, 6, 21, 41, 22, 67, 20, 10, 61},
            {7, 8, 9, 90, 9, 90, 17, 12, 87, 67},
            {41, 87, 24, 56, 97, 74, 87, 42, 64, 35},
            {32, 76, 79, 1, 36, 5, 67, 96, 12, 11},
            {99, 13, 54, 88, 89, 90, 75, 12, 41, 76},
            {67, 78, 87, 45, 14, 22, 26, 42, 56, 78},
            {98, 45, 34, 23, 32, 56, 74, 16, 19, 18},
            {24, 67, 97, 46, 87, 13, 67, 89, 93, 24},
            {21, 68, 78, 98, 90, 67, 12, 41, 65, 12}
        };
//        int[][] matrizP = new int[3][3];
        int[][] matrizP = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

//        LlenarMatrices(matrizM, matrizP);
        List<int[]> posiciones = ComprobarMatrizPEnMatrizM(matrizM, matrizP);
        MostrarMatrices(matrizM, matrizP);
        MostrarPosiciones(posiciones);
    }

//    public static void LlenarMatrices(int[][] matrizM, int[][] matrizP) {
//
////        Scanner leer = new Scanner(System.in);
////        for (int i = 0; i < 10; i++) {
////            for (int j = 0; j < 10; j++) {
////
////                System.out.println("Ingrese el valor para la posición [" + i + "][" + j + "]:");
////                matrizM[i][j] = leer.nextInt();
////
////            }
////        }
////        for (int i = 0; i < 3; i++) {
////            for (int j = 0; j < 3; j++) {
////                System.out.println("Ingrese el valor para la posición [" + i + "][" + j + "]:");
////                matrizP[i][j] = leer.nextInt();
////
////            }
////        }
////        leer.close();//para  cerrar el objeto Scanner y no seguir consumiendo recursos.
//    }

    public static List<int[]> ComprobarMatrizPEnMatrizM(int[][] matrizM, int[][] matrizP) {
        int filasM = 10, columnasM = 10, filasP = 3, columnasP = 3;

        List<int[]> posiciones = new ArrayList<>();

        for (int i = 0; i <= filasM - filasP; i++) {
            for (int j = 0; j <= columnasM - columnasP; j++) {
                if (esSubmatriz(matrizM, matrizP, i, j)) {//mando los valores de la matrizM para 
//                                                                             ser comprobados en la matrizP
                    posiciones.add(new int[]{i, j});
                }
            }
        }

        return posiciones;
    }

    private static boolean esSubmatriz(int[][] matrizM, int[][] matrizP, int filaInicio, int columnaInicio) {
        int filasP = matrizP.length;
        int columnasP = matrizP[0].length;

        for (int i = 0; i < filasP; i++) {
            for (int j = 0; j < columnasP; j++) {
                if (matrizM[filaInicio + i][columnaInicio + j] != matrizP[i][j]) {//iterara 3 veces para ir compropando los valores
//                                                                    de matrizP en matrizM
                    return false;
                }
            }
        }

        return true;
    }

    public static void MostrarMatrices(int[][] matrizM, int[][] matrizP) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("[" + matrizM[i][j] + "] ");
            }
            System.out.println("");
        }
        System.out.println("-----------------------------------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matrizP[i][j] + "] ");
            }
            System.out.println("");
        }

    }

    public static void MostrarPosiciones(List<int[]> posiciones) {
        if (posiciones.isEmpty()) {
            System.out.println("La submatriz P no se encuentra en la matriz M.");
        } else {
            System.out.println("La submatriz P incia en las siguientes posiciones de la matriz M:");
            for (int[] posicion : posiciones) {
                int filaInicio = posicion[0];
                int columnaInicio = posicion[1];
                System.out.println("Fila: " + filaInicio + ", Columna: " + columnaInicio);
            }
        }
    }
}
