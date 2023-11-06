package Servicio;

import Entidad.Cliente;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClienteService {

    Scanner leer = new Scanner(System.in);
    Cliente cliente = new Cliente();
    List<Cliente> clientes = new ArrayList<>();

    public void registrarCliente() {

        System.out.println(" Datos Cliente ");
        System.out.println("ID: ");
        cliente.setId(leer.nextInt());
        leer.nextLine();

        System.out.println("Nombre:");
        cliente.setNombre(leer.nextLine());

        System.out.println("Edad:");
        cliente.setEdad(leer.nextInt());
        leer.nextLine();

        System.out.println("Altura:");
        cliente.setAltura(leer.nextDouble());

        System.out.println("Peso:");
        cliente.setPeso(leer.nextDouble());
        leer.nextLine();

        System.out.println("Objetivo:");
        cliente.setObjetivo(leer.nextLine());

        clientes.add(cliente);

    }

    public void obtenerClientes() {
        System.out.println(" -Clientes registrados- ");
        System.out.println("ID | Nombre                | Edad | Altura | Peso  | Objetivo");
        System.out.println("--------------------------------------------------------------");

        for (Cliente client : clientes) {
            System.out.printf("%-3d| %-20s| %-5d| %-7.2f| %-6.2f| %s%n",
                    client.getId(), client.getNombre(), client.getEdad(),
                    client.getAltura(), client.getPeso(), client.getObjetivo());
        }
    }

    public void actualizarCliente(int id, String nombre, int edad, double altura, double peso, String objetivo) {
        boolean clienteEncontrado = false;

        for (Cliente client : clientes) {
            if (client.getId() == id) {
                clienteEncontrado = true;
                client.setNombre(nombre);
                client.setEdad(edad);
                client.setAltura(altura);
                client.setPeso(peso);
                client.setObjetivo(objetivo);
                System.out.println("Cliente actualizado correctamente...");
                break;
            }
        }

        if (!clienteEncontrado) {
            System.out.println("No se encontró un cliente con el ID proporcionado...");
        }
    }
/**
 * Elimina todos los clientes que coincidan con el id
 * @param id 
 */
    public void eliminarCliente(int id) {
        boolean clienteEncontrado = clientes.removeIf(client -> client.getId() == id);

        if (clienteEncontrado) {
            System.out.println("Cliente eliminado correctamente...");
        } else {
            System.out.println("No se encontró un cliente con el ID proporcionado...");
        }
    }

}
