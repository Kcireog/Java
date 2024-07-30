package Servicio;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlumnoService {

    private Scanner leer;
    private List<Alumno> alumnos;

    public AlumnoService() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.alumnos = new ArrayList<>();
    }

    public void crearAlumno() {

        System.out.println(" Datos Alumno ");
        System.out.println("");
        System.out.println("Nombre:");
        String nombre = leer.nextLine();

        List<Integer> notasAlumno = new ArrayList<>();
        for (int i = 0; i <= 2; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + " del alumno: ");
            int nota = leer.nextInt();
            notasAlumno.add(nota);
        }
        leer.nextLine();

        Alumno alumno = new Alumno(nombre, notasAlumno);
        alumnos.add(alumno);

    }

    public void fabricaAlumnos() {

        boolean seguir = true;

        while (seguir) {
            crearAlumno();

            System.out.println("¿Quiere crear otro alumno? S/N");
            String letra = leer.nextLine();
            seguir = letra.equalsIgnoreCase("s");
        }

    }

    public double notaFinal(String nombre) {
        Alumno alumnoEncontrado = buscarAlumnoPorNombre(nombre);
        if (alumnoEncontrado != null) {
            List<Integer> notasAlumnoEncontrado = alumnoEncontrado.getNotas();
            int sumNotas = 0;

            for (Integer nota : notasAlumnoEncontrado) {
                sumNotas += nota;
            }

            double promedio = sumNotas / notasAlumnoEncontrado.size();
            return promedio;
        } else {
            
            System.out.println("Alumno no encontrado...");
            return 0.0;
        }

    }

    public Alumno buscarAlumnoPorNombre(String nombre) {
        for (Alumno alumno : alumnos) {
            if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                return alumno;
            }
        }
        return null;
    }

//    public void mostraAlumnos() {
//        System.out.println("-----------Alumno-----------");
//        for (Alumno var : alumnos) {
//            System.out.println(var.toString());
//        }
//    }

}
