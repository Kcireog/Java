package Servicio;

import Entidad.Curso;
import java.util.Scanner;

public class CursoService {

    Curso curso = new Curso();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void cargarAlumnos() {
        String[] alumnos = curso.getAlumnos();
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Alumno " + (i + 1));
            System.out.println("Nombre: ");
            alumnos[i] = leer.nextLine();
        }
        curso.setAlumnos(alumnos);
    }

    public void crearCurso() {
        System.out.println(" Datos Curso ");
        System.out.println("Nombre Curso: ");
        curso.setNombreCurso(leer.nextLine());

        System.out.println("Cantidad Hrs/dia: ");
        curso.setCantidadHorasPorDia(leer.nextInt());

        System.out.println("Cantidad dias/semana: ");
        curso.setCantidadDiasPorSemana(leer.nextInt());
        leer.nextLine();

        System.out.println("Turno (Manaña/Tarde): ");
        curso.setTurno(leer.nextLine().toLowerCase());

        System.out.println("Precio por hora: ");
        curso.setPrecioPorHora(leer.nextInt());
        leer.nextLine();

        System.out.println(" Datos Alumnos ");
        cargarAlumnos();

    }

    public void calcularGananciaSemanal() {

        Double ganancia = curso.getCantidadHorasPorDia() * curso.getPrecioPorHora() * curso.getAlumnos().length * curso.getCantidadDiasPorSemana();
        System.out.println("Ganacia semanal del curso: " + ganancia);
    }

}
