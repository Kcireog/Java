//Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
//ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
//5 *****
//3 ***
//11 ***********
//2 **
package GuiaJavaIntro;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese los 4 numeros(1-20):");
        
        for (int i = 0; i < 4; i++) {
            int num = leer.nextInt();
            
            if(num>=1 && num<=20){
                System.out.print(num+" ");
                for (int j = 0; j < num; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }else{
                System.out.println("Numero invalido...");
                i--;
            }
        }
    }
}
