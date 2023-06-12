
package GuiaJavaIntro.EjerciciosPracticos;
import java.util.*;
public class Practico3 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase:");
        String frase = leer.nextLine();
        
        System.out.println("En Mayus: "+ frase.toUpperCase()+"\nEn Minus: "+frase.toLowerCase());
                
                
    }
}
