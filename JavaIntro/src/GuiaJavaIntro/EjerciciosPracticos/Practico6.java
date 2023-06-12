//Crear un programa que dado un numero determine si es par o impar.
package GuiaJavaIntro.EjerciciosPracticos;
import java.util.*;
public class Practico6 {
    public static void main(String[] args) {
        int num;
        double par;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Escriba un numero:");
        num=leer.nextInt();
        par= num%2;
        
        if(par==0){
            System.out.println("El numero "+num+" es par.");
        }else{
            System.out.println("El numero "+num+" es impar.");
        }
    }
    
}
