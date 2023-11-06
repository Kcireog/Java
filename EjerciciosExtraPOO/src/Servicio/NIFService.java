package Servicio;

import Entidad.NIF;
import java.util.Scanner;

public class NIFService {

    Scanner leer = new Scanner(System.in);
    NIF nif = new NIF();

    public void crearNif() {
        System.out.println(" Datos ");
        System.out.println("DNI: ");
        nif.setNumDNI(leer.nextLong());

        nif.setLetra(calcularLetra());

    }

    public char calcularLetra() {

        char letra;
        int resto = (int) (nif.getNumDNI() % 23);
        char[] tablaLetras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        letra = tablaLetras[resto];

        return letra;
    }

    public void mostrar() {
        System.out.println(" NIF ");
        System.out.println(String.format("%08d-%c", nif.getNumDNI(), nif.getLetra()));
        /*
        La cadena de formato "%08d-%c" se utiliza en el método mostrar() para formatear la salida del número de DNI 
        con ceros a la izquierda y la letra correspondiente.

        -El %08d indica que se debe formatear un entero (d) con un ancho de campo de 8 caracteres y 
        rellenar con ceros a la izquierda si el número tiene menos de 8 dígitos.
        -El - simplemente agrega un guion después del número de DNI.
        -El %c se utiliza para formatear un carácter y se coloca al final para mostrar la letra correspondiente.
        
        En resumen, "%08d-%c" formatea la salida del número de DNI con 8 dígitos, un guion y 
        la letra correspondiente al final. Por ejemplo, si el número de DNI es 395469 y 
        la letra es 'F', el formato "%08d-%c" producirá la cadena "00395469-F".
         */
    }

}
