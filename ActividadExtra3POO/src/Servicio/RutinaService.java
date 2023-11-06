package Servicio;

import Entidad.Rutina;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RutinaService {

    Scanner leer = new Scanner(System.in);
    Rutina rutina = new Rutina();
    List<Rutina> rutinas = new ArrayList<>();

    public void crearRutina() {
        System.out.println(" Datos Rutina ");

        System.out.println("ID:");
        rutina.setId(leer.nextInt());
        leer.nextLine();

        System.out.println("Nombre:");
        rutina.setNombre(leer.nextLine());

        System.out.println("Duración(min):");
        rutina.setDuracion(leer.nextInt());
        leer.nextLine();

        System.out.println("Nivel De Dificultad:");
        rutina.setNivelDificultad(leer.nextLine());

        System.out.println("Descripcion:");
        rutina.setDescripcion(leer.nextLine());

        rutinas.add(rutina);
    }

    public void obtenerRutinas() {
        System.out.println(" -Rutinas Registradas- ");
        System.out.println("ID | Nombre                | Duración | Nivel de Dificultad | Descripción");
        System.out.println("-------------------------------------------------------------------------");

        for (Rutina rutin : rutinas) {
            System.out.printf("%-3d| %-20s| %-8d| %-19s| %s%n",
                    rutin.getId(), rutin.getNombre(), rutin.getDuracion(),
                    rutin.getNivelDificultad(), rutin.getDescripcion());
        }
    }

    public void actualizarRutina(int id, String nombre, int duracion, String nivelDificultad, String descripcion) {

        boolean rutinaEncontrada = false;

        for (Rutina rutin : rutinas) {
            if (rutin.getId() == id) {
                rutinaEncontrada = true;
                rutin.setNombre(nombre);
                rutin.setDuracion(duracion);
                rutin.setNivelDificultad(nivelDificultad);
                rutin.setDescripcion(descripcion);

                System.out.println("Rutina actualizada...");
                break;
            }
        }
        if (!rutinaEncontrada) {
            System.out.println("No se encontro una rutina con esa ID...");
        }
    }

    public void eliminarRutina(int id) {
        boolean rutinaEncontrada = rutinas.removeIf(rutin -> rutin.getId() == id);

        if (rutinaEncontrada) {
            System.out.println("Rutina eliminada...");
        } else {
            System.out.println("No se encontro una rutina con esa ID...");

        }
    }
}
