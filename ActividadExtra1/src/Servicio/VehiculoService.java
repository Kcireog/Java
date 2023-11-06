package Servicio;

import Entidad.Vehiculo;
import java.util.Scanner;

public class VehiculoService {

    Vehiculo vehiculo = new Vehiculo();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Vehiculo crearVehiculo() {

        System.out.println("Marca:");
        vehiculo.setMarca(leer.nextLine());

        System.out.println("Modelo:");
        vehiculo.setModelo(leer.nextLine());

        System.out.println("Año:");
        vehiculo.setAño(leer.nextLine());

        System.out.println("Tipo:");
        vehiculo.setTipo(leer.nextLine().toLowerCase());

        return vehiculo;
    }

    public int frenar(String tipo) {
        if (tipo.equals("automovil") || tipo.equals("motocicleta")) {
            return 2;
        } else{
            return 0;
        }
       
    }

    public int moverse(int segundos) {

        switch (vehiculo.getTipo()) {
            case "automovil":
                return 3 * segundos + frenar("automovil");
            case "motocicleta":
                return 2 * segundos + frenar("motocicleta");
            case "bicicleta":
                return 1 * segundos + frenar("bicicleta");
            default:
                return 0;
        }

    }

    public String getTipoVehiculo() {
        return vehiculo.getTipo();
    }

    public void recorridoMaximo(int recorrido1, int recorrido2, int recorrido3, String tipo1, String tipo2, String tipo3) {

        int maximo = Math.max(recorrido1, Math.max(recorrido2, recorrido3));
        //guardara el valor maximo entre los 3
        System.out.println("--Luego de 5min--");
        if (recorrido1 == maximo) {
            System.out.println("Tras frenar, recorrio " + maximo + "m y fue un vehiculo del tipo: " + tipo1);

        } else if (recorrido2 == maximo) {
            System.out.println("Tras frenar, recorrio " + maximo + "m y fue un vehiculo del tipo: " + tipo2);

        }else{
            System.out.println("Tras frenar, recorrio " + maximo + "m y fue un vehiculo del tipo: " + tipo3);
        }
    }

}
