package Main;

import Servicio.ClienteService;
import Servicio.RutinaService;
import java.util.Scanner;

public class MainGimnasio {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ClienteService cs = new ClienteService();
        RutinaService rs = new RutinaService();

        System.out.println("No. Clientes a agregar:");
        int n1 = leer.nextInt();
        leer.nextLine();

        for (int i = 0; i < n1; i++) {
            System.out.println(" Cliente " + (i + 1));
            cs.registrarCliente();
        }

        System.out.println("No. Rutinas a agregar:");
        int n2 = leer.nextInt();
        leer.nextLine();

        for (int i = 0; i < n2; i++) {
            System.out.println(" Rutina " + (i+1));
            rs.crearRutina();
        }

        cs.obtenerClientes();

        rs.obtenerRutinas();

        System.out.println(" Actualización Cliente ");
        System.out.println("ID:");
        int idCliente = leer.nextInt();
        leer.nextLine();
        System.out.println("Nombre:");
        String nombreCliente = leer.nextLine();
        System.out.println("Edad:");
        int edadCliente = leer.nextInt();
        leer.nextLine();
        System.out.println("Altura:");
        double alturaCliente = leer.nextDouble();
        System.out.println("Peso:");
        double pesoCliente = leer.nextDouble();
        leer.nextLine();
        System.out.println("Objetivo:");
        String objetivoCliente = leer.nextLine();

        cs.actualizarCliente(idCliente, nombreCliente, edadCliente, alturaCliente, pesoCliente, objetivoCliente);

        System.out.println(" Actualización Rutina ");

        System.out.println("ID:");
        int idRutina = leer.nextInt();
        leer.nextLine();
        System.out.println("Nombre:");
        String nombreRutina = leer.nextLine();
        System.out.println("Duracion(min):");
        int duracionRutina = leer.nextInt();
        leer.nextLine();
        System.out.println("Dificultad:");
        String dificultadRutina = leer.nextLine();
        System.out.println("Descripcion:");
        String descripcionRutina = leer.nextLine();

        rs.actualizarRutina(idRutina, nombreRutina, duracionRutina, dificultadRutina, descripcionRutina);

        cs.eliminarCliente(2);
        rs.eliminarRutina(2);

        cs.obtenerClientes();

        rs.obtenerRutinas();

    }
}
