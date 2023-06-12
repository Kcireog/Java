//Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
//traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
//cambiando sus filas por columnas (o viceversa).
package GuiaJavaIntro.EjerciciosPracticos;
import java.util.*;

public class Practico18 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        int n=4;
        int [][] matriz1=new int [n][n];
        int [][] matriz2=new int [n][n];
        
        LlenarMatrices(matriz1, matriz2, n);
        MostrarMatrices(matriz1, matriz2, n);
        
    }
     public static void LlenarMatrices(int[][] matriz1,int[][] matriz2, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz1[i][j]=(int)(Math.random()*10);
                
            }
        }
         for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz2[j][i]=matriz1[i][j];
                
            }
        }
    }
    public static void MostrarMatrices(int[][] matriz1,int[][] matriz2, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                 System.out.print("[" + matriz1[i][j] + "] ");
            }
             System.out.println("");
        }
        System.out.println("-----------------------------------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                 System.out.print("[" + matriz2[i][j] + "] ");
            }
            System.out.println("");
        }
        
    }
}
