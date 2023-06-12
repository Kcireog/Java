//Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
//que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
//segundo, sino informe que no lo son.
package GuiaJavaIntro;

import java.util.*;

public class Ejercicio12 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el num 1:");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el num 2:");
        int num2 = leer.nextInt();

        EsMultiplo(num1, num2);
    }

    public static void EsMultiplo(int num1, int num2) {
        
        if(num1%num2==0){//si la division es exacta, es decir si da 0 entonces el num1 es multiplo de num2.
            System.out.println(num1+ " es multiplo de "+ num2+"...");
            
        }else{
            System.out.println(num1+ " no es multiplo de "+ num2+"...");
        }
        
    }
}
