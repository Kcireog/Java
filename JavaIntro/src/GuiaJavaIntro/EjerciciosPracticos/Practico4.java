
package GuiaJavaIntro.EjerciciosPracticos;
import java.util.*;
public class Practico4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
            
        System.out.println("Ingrese una temperatura en C:");
        Double temperatura = leer.nextDouble();
        
        Double celsiustofarenheit = 32+(9*temperatura/5);
        
        
        System.out.println("Temperatura en:\n"+" Celsius: "+temperatura+"C\n"
                +"  Farenheit: "+celsiustofarenheit+"F");
        
    }
}
