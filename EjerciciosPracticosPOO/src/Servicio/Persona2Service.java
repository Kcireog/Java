package Servicio;

import Entidad.Persona2;
import java.util.Date;
import java.util.Scanner;

public class Persona2Service {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Persona2 persona = new Persona2();

    public void crearPersona() {
        System.out.println(" Datos Persona ");
        System.out.println("Nombre: ");
        persona.setNombre(leer.nextLine());

        System.out.println("Fecha de nacimiento: ");
        System.out.println("Dia: ");
        int dia = leer.nextInt();

        System.out.println("Mes: ");
        int mes = leer.nextInt() - 1;

        System.out.println("Anio: ");
        int anio = leer.nextInt();

        Date fechaNacimiento = new Date(anio - 1900, mes, dia);
        persona.setFechaNacimiento(fechaNacimiento);

    }

    public int calcularEdad() {
        int edad = 0;
        Date fechaActual = new Date();
        edad = fechaActual.getYear() - persona.getFechaNacimiento().getYear();

        return edad;
    }

    public boolean menorQue(int edadEntrante) {

        int edadPersona2 = calcularEdad();

        return edadPersona2 < edadEntrante;//si se cumple devuelve true, sino false.
    }
    
    public void mostrarPersona(){
        System.out.println(" Datos Persona2 ");
        System.out.println("Nombre: "+persona.getNombre());
        System.out.println("Edad: "+calcularEdad());
        System.out.println("Fecha Nacimiento: "+persona.getFechaNacimiento());
    }
}
