package Main;

import Servicio.AlumnoService;
import java.util.Scanner;

public class MainAlumno {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        AlumnoService as = new AlumnoService();

        as.fabricaAlumnos();
        System.out.println("Nombre del alumno a calcular promedio: ");
        double promedio=as.notaFinal(leer.nextLine());
        System.out.println("El promedio del alumno es: "+promedio);
        
    }
}
