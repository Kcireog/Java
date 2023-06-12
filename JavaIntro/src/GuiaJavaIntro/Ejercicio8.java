//Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
//pedirá de nuevo hasta que la nota sea correcta.
package GuiaJavaIntro;
import java.util.*;

public class Ejercicio8 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int nota=0;
        System.out.println("Ingrese una nota:");
        while(nota<1 || nota>10){
            nota=leer.nextInt();
             if(nota<1 || nota>10){
               System.out.println("Nota incorrecta...");
            }else{
                 System.out.println("Nota correcta...");
             }
        }
        
    }
}
