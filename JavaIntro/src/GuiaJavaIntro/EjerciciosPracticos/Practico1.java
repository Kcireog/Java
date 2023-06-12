
package GuiaJavaIntro.EjerciciosPracticos;
import java.util.*;

public class Practico1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("_Suma de 2 numeros_\n");
        System.out.println("Numero 1:");
        int num1 = leer.nextInt();

        System.out.println("Numero 2:");
        int num2 = leer.nextInt();

        int suma = num1 + num2;

        System.out.println(" Suma de los 2 numeros: " + suma);

    }

}