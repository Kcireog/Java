//Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
//alguno de ellos es mayor a 25.
package GuiaJavaIntro;
import java.util.*;

public class Ejercicio6 {
    
    public static void main(String[] args) {
      
        Scanner leer = new Scanner(System.in);

        System.out.println("Escriba el Num1 :");
        int num1 = leer.nextInt();
        System.out.println("Escriba el Num2:");
        int num2 = leer.nextInt();

        if (num1 > 25 || num2 > 25) {

            System.out.println("Ambos o alguno de los 2 numeros es mayor a 25...");

        } else {
            System.out.println("Ninguno de los 2 numeros es mayor a 25");
        }
    }
}
