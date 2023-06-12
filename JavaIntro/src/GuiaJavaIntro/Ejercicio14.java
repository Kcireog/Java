//Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo
package GuiaJavaIntro;

import java.util.*;
public class Ejercicio14 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del equipo: ");
        int n = leer.nextInt();
        String [] equipo= new String[n];
        
        LlenarVector(n, equipo);
        MostrarVector(n, equipo);
    }
    
    public static void LlenarVector(int n, String[] equipo){
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i < n; i++) {
            System.out.println("Nombre del integrante No."+i+":");
            equipo[i]=leer.nextLine();
        }
    }
    public static void MostrarVector(int n, String[] equipo){
        
        
        for (int i = 0; i < n; i++) {
            System.out.print("["+equipo[i]+"] ");
        }
        System.out.println("");
    }
}
