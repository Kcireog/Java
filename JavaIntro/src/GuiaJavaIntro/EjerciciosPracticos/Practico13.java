
package GuiaJavaIntro.EjerciciosPracticos;

import java.util.Scanner;


public class Practico13 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Tamaño del cuadrado: ");
        int tamaño = leer.nextInt();
        
        for (int i = 0; i < tamaño ; i++) {
            for (int j = 0; j < tamaño; j++) {
                
                if (i==0 || j==0 ||i==tamaño-1||j==tamaño-1){
                    
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        
    }
}
