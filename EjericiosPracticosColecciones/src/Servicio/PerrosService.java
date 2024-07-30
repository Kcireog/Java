package Servicio;

import Entidad.Perros;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PerrosService {

    private Scanner leer;
    private List<String> perros;

    public PerrosService() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.perros = new ArrayList<>();
    }

    public void crearPerro() {
        Perros perro = new Perros();

        System.out.println("Nombre:");
        perro.setNombre(leer.nextLine());

        System.out.println("Raza:");
        perro.setRaza(leer.nextLine());

        perros.add(perro.getNombre() + " " + perro.getRaza());

    }

    //TODO ordenar lista
    public void mostrarPerros() {
        System.out.println("-----------Perros Guardados-----------");
        for (String var : perros) {
            System.out.println(var);
        }
    }

    public void fabricaPerro() {
        boolean seguir = true;
        while (seguir) {
            crearPerro();

            System.out.println("Desea guardar otro perro? S/N");
            String letra = leer.nextLine();
            seguir = letra.equalsIgnoreCase("s");
        }

        mostrarPerros();

    }

    public void eliminarPerroPorNombre(String nombre) {

        System.out.println("----Eliminar Perro----");
        boolean esEncontrado = false;

        Iterator<String> it = perros.iterator();
        while (it.hasNext()) {
            String perro = it.next();
            if (perro.startsWith(nombre)) {
                it.remove();
                esEncontrado = true;
                break;
            }
        }
        if (!esEncontrado) {
            System.out.println("Perro sin eliminar, Nombre no encontrado...");
        }
    }
    
    

}
