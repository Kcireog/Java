//Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
//bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el
//resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
//Nota: recordar el uso de la sentencia break.
package GuiaJavaIntro;

import java.util.Scanner;


public class Ejercicio9 {
    public static void main(String[] args) {
       
        int num;
        Scanner leer = new Scanner(System.in);
        
        do{
            System.out.println("Ingrese un numero: ");
            num=leer.nextInt();
            
            
        }while(num!=0);
        
        if(num==0){
            System.out.println("Se capturo el numero 0...");
        }
        
    }
}
