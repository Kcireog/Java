package Servicio;

import Entidad.Pais;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PaisService {

    private Scanner leer;
    private Set<Pais> paises;

    public PaisService() {
        this.leer = new Scanner(System.in);
        this.paises = new TreeSet<>();
    }

    public void crearPais() {
        Pais pais = new Pais();

        System.out.println("--Datos Pais--");
        System.out.println("Nombre:");
        pais.setNombre(leer.nextLine());

        paises.add(pais);
    }

    public void fabricaPaises() {
        boolean seguir = true;

        while (seguir) {
            crearPais();

            System.out.println("¿Quiere guardar otro pais? S/N");
            String respuesta = leer.nextLine();
            seguir = respuesta.endsWith("s");
        }
    }

    public void mostrarPaises() {
        System.out.println("""
                           
                           ---Paises---
                           """);
        for (Pais var : paises) {
            System.out.println(var.toString());
        }
    }

    public void ordenarAlfabeticamente() {
        System.out.println("--- Paises ordenados alfabéticamente ---");

        mostrarPaises();
    }

    public void eliminarPaisPorNombre(String nombre) {

        System.out.println("----Eliminar Pais----");
        boolean esEncontrado = false;

        Iterator<Pais> it = paises.iterator();
        while (it.hasNext()) {
            Pais pais = it.next();
            if (pais.getNombre().startsWith(nombre)) {
                it.remove();
                esEncontrado = true;
                break;
            }
        }
        if (!esEncontrado) {
            System.out.println("Pais sin eliminar, Nombre no encontrado...");
        }

        mostrarPaises();
    }

}
