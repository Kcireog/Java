
package Main;
import java.util.Date;
import java.util.Scanner;


public class MainDate {
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        System.out.println(" Fecha ");
        System.out.println("Dia:");
        int dia=leer.nextInt();
        
        System.out.println("Mes:");
        int mes=leer.nextInt()-1;// se resta 1 porque los meses en la clase Date van 0-11.
        
        System.out.println("Anio:");
        int anio=leer.nextInt();
        
        
        
        
        
        Date fecha=new Date(anio-1900,mes,dia);
        Date fechaActual=new Date();
        
        System.out.println("Fecha ingresada: "+fecha);
        System.out.println("Fecha ingresada: "+fechaActual);
        
        int diferenciaAños=fechaActual.getYear()-fecha.getYear();
        
        System.out.println("Diferencia de años entre fecha ingresada y actual: "+diferenciaAños+" anio/s");
        
        
    }
}
