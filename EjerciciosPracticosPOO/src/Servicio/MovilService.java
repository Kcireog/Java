package Servicio;

import Entidad.Movil;
import java.util.Arrays;
import java.util.Scanner;

public class MovilService {

    Scanner leer = new Scanner(System.in);
    Movil movil = new Movil();

    public void cargarCelular() {
        System.out.println(" Datos Movil ");
        System.out.println("Marca:");
        movil.setMarca(leer.nextLine());

        System.out.println("Precio:");
        movil.setPrecio(leer.nextInt());
        leer.nextLine();

        System.out.println("Modelo:");
        movil.setModelo(leer.nextLine());

        System.out.println("Ram:");
        movil.setMemoriaRam(leer.nextInt());

        System.out.println("Almacenamiento:");
        movil.setAlmacenamiento(leer.nextInt());
        leer.nextLine();
        
        ingresarCodigo();

    }

    public void ingresarCodigo() {
        int[] codigo = movil.getCodigo();

        System.out.println("Codigo: ");
        String cod = leer.nextLine();

        for (int i = 0; i < codigo.length; i++) {

            codigo[i] = Integer.parseInt(cod.substring(i, i + 1));
        }
        movil.setCodigo(codigo);
    }

    public void mostrarMovil() {
        System.out.println(" Datos Movil ");

        System.out.println("Marca: "+movil.getMarca());
       

        System.out.println("Precio: "+movil.getPrecio());
        

        System.out.println("Modelo: "+movil.getModelo());
      

        System.out.println("Ram: "+movil.getMemoriaRam()+"GB");
      

        System.out.println("Almacenamiento: "+movil.getAlmacenamiento()+"GB");
        
        
        System.out.println("Codigo: "+Arrays.toString(movil.getCodigo()));

    }

}
