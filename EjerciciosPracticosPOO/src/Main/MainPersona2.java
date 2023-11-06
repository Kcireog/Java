package Main;

import Servicio.Persona2Service;
import java.util.Scanner;

public class MainPersona2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Persona2Service ps = new Persona2Service();

        ps.crearPersona();
        ps.calcularEdad();
        System.out.println("Ingrese una edad nueva: ");
        int edadEntrante = leer.nextInt();
        Boolean retorno = ps.menorQue(edadEntrante);
        if (retorno) {
            System.out.println("La persona que se creo es menor a la edad ingresada");

        } else {
            System.out.println("La persona que se creo es mayor a la edad ingresada");

        }
        ps.mostrarPersona();
    }

}
