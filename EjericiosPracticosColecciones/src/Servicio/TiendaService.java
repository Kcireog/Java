package Servicio;

import Entidad.Tienda;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TiendaService {

    private Scanner leer;
    private HashMap<String, Integer> productos;

    public TiendaService() {
        this.leer = new Scanner(System.in);
        this.productos = new HashMap();
    }

    public void CrearProductos() {

        Tienda producto = new Tienda();

        System.out.println("--Datos Producto--");
        System.out.println("Nombre:");
        producto.setNombre(leer.nextLine());

        System.out.println("Valor:");
        producto.setPrecio(leer.nextInt());
        leer.nextLine();

        productos.put(producto.getNombre(), producto.getPrecio());

    }

    public void fabricaProductos() {
        boolean seguir = true;

        while (seguir) {
            CrearProductos();

            System.out.println("¿Quiere ingresar otro producto? S/N");
            String respuesta = leer.nextLine();
            seguir = respuesta.endsWith("s");
        }
    }

    public void modificarPrecioProducto() {
        System.out.println("Ingrese el nombre del producto que desea modificar:");
        String nombreProducto = leer.nextLine();

        if (productos.containsKey(nombreProducto)) {
            System.out.println("Ingrese el nuevo precio para " + nombreProducto + ":");
            int nuevoPrecio = leer.nextInt();
            leer.nextLine();

            productos.put(nombreProducto, nuevoPrecio);
            System.out.println("Precio de " + nombreProducto + " modificado exitosamente.");
        } else {
            System.out.println("El producto " + nombreProducto + " no existe en la tienda.");
        }
    }

    public void eliminarProducto() {
        System.out.println("Ingrese el nombre del producto que desea eliminar:");
        String nombreProducto = leer.nextLine();

        if (productos.containsKey(nombreProducto)) {
            productos.remove(nombreProducto);

            System.out.println(nombreProducto + " eliminado exitosamente.");
        } else {
            System.out.println("El producto " + nombreProducto + " no existe en la tienda.");
        }
    }

    public void mostrarProductos() {
        System.out.println("""
                           
                           ---Productos---
                           """);
        for (Map.Entry<String, Integer> var : productos.entrySet()) {
            String key = var.getKey();
            Integer value = var.getValue();
            System.out.println("___");
            System.out.println("Nombre: " + key
                    + " \nValor: " + value);
        }
    }

    public void menuTienda() {
        int opc = 0;
        do {
            System.out.println("""
                                    Menu
                               1. Ingresar Producto
                               2. Modificar Precio
                               3. Eliminar Producto
                               4. Mostrar Productos
                               5. Salir
                               
                               """);
            opc = leer.nextInt();
            leer.nextLine();

            switch (opc) {
                case 1 -> fabricaProductos();
                case 2 -> modificarPrecioProducto();
                case 3 -> eliminarProducto();
                case 4 -> mostrarProductos();
                case 5 -> {
                }
                default -> System.out.println("Opción invalida...");
            }
        } while (opc != 5);
    }
}
