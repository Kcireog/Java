//Realizar un programa que pida dos números enteros positivos por teclado y muestre por
//pantalla el siguiente menú:
//
//MENU
//1. Sumar
//2. Restar
//3. Multiplicar
//4. Dividir
//5. Salir
//Elija opción:
//
//El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
//y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
//Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
//directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
//desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
//programa, caso contrario se vuelve a mostrar el menú.
package GuiaJavaIntro.EjerciciosPracticos;

import java.util.*;

public class Practico11 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String salir = "n";
        int suma = 0, resta = 0, opcion;
        double multi = 0, divi = 0;
        
        System.out.println("Ingrese el num 1:");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el num 2:");
        int num2 = leer.nextInt();

        do {
            System.out.println("""
                            MENU
                           1. Sumar
                           2. Restar
                           3. Multiplicar
                           4. Dividir
                           5. Salir
                           Elija opcion:
                           """);
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    suma = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + suma);
                    break;
                case 2:
                    resta = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + resta);
                    break;
                case 3:
                    multi = num1 * num2;
                    System.out.println(num1 + " * " + num2 + " = " + multi);
                    break;
                case 4:
                    divi = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + divi);
                    break;
                case 5:
                    System.out.println("Desea salir(S/N)?");
                    leer.next();
                    salir = leer.nextLine().toLowerCase();
                    break;
                default:
                    System.out.println("Opcion invalida...");
            }
        } while (salir.equals("n") && opcion <= 5);

    }
}
