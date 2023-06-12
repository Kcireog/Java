
//Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
//pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
//la función equals() en Java.
package GuiaJavaIntro.EjerciciosPracticos;

import java.util.*;

public class Practico7 {
    public static void main(String[] args) {
       
        String fraseCorrecta="eureka";
        String frase;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Escriba una frase: ");
        frase=leer.nextLine();
        
        if(frase.equals(fraseCorrecta)){
            
            System.out.println("Correcto...");
            
        }else{
             System.out.println("Incorrecto...");
        }
    }
}
