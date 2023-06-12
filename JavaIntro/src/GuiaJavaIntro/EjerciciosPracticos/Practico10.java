//Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
//números al usuario hasta que la suma de los números introducidos supere el límite inicial.
package GuiaJavaIntro.EjerciciosPracticos;

import java.util.*;

public class Practico10 {

    public static void main(String[] args) {
        int num, limite, suma = 0;

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un limite positivo:");
        limite = leer.nextInt();

        while (suma <= limite) {
            
            System.out.println("Ingrese el numero para la suma:");
            num = leer.nextInt();
            if (num >= limite) {
                System.out.println("El numero supera el limite...");
                break;
            }
            suma += num;
        }

        System.out.println("""
                           La suma ha superado el limite... 
                           Suma total: """ + suma);

    }
}
