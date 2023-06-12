//Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
//dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
//fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
//X y el último tiene que ser una O.
//Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
//especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
//de FDE, que no respete el formato se considera incorrecta.
//Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
//incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
//siguientes funciones de Java Substring(), Length(), equals().
package GuiaJavaIntro.EjerciciosPracticos;

import java.util.*;

public class Practico12 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int contCorrectos = 0, contIncorrectos = 0;

        while (true) {

            System.out.println("Ingrese una cadena:");
            String cadena = leer.nextLine();

            if (cadena.equals("&&&&&")) {
                break; // Finalizar el programa si se ingresa FDE
            }
            if (cadena.length() == 5 && cadena.charAt(0) == 'X' && cadena.charAt(4) == 'O') {

                contCorrectos++;
            } else {
                contIncorrectos++;
            }

        }
        
        System.out.println("Lecturas correcttas: "+contCorrectos
                + "\nLecturas incorrectas: "+contIncorrectos);

    }
}
