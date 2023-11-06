package Main;

import Servicio.VehiculoService;
import java.util.Scanner;

public class MainVehiculo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        VehiculoService vs = new VehiculoService();
        VehiculoService vs1 = new VehiculoService();
        VehiculoService vs2 = new VehiculoService();
        VehiculoService vs3 = new VehiculoService();

        for (int i = 1; i < 4; i++) {
            System.out.println("Vehiculo " + i);
            switch (i) {
                case 1:
                    vs1.crearVehiculo();
                    System.out.println("Moviendose 5 seg: " + vs1.moverse(5) + " m");
                    System.out.println("Moviendose 10 seg: " + vs1.moverse(10) + " m");
                    System.out.println("Moviendose 1 min: " + vs1.moverse(60) + " m");
                    
                    break;
                case 2:
                    vs2.crearVehiculo();
                    System.out.println("Moviendose 5 seg: " + vs2.moverse(5) + " m");
                    System.out.println("Moviendose 10 seg: " + vs2.moverse(10) + " m");
                    System.out.println("Moviendose 1 min: " + vs2.moverse(60) + " m");
                    
                    break;
                default:
                    vs3.crearVehiculo();
                    System.out.println("Moviendose 5 seg: " + vs3.moverse(5) + " m");
                    System.out.println("Moviendose 10 seg: " + vs3.moverse(10) + " m");
                    System.out.println("Moviendose 1 min: " + vs3.moverse(60) + " m");
                    

            }
        }
        
        int recorrido1=vs1.moverse(300);
        int recorrido2=vs2.moverse(300);
        int recorrido3=vs2.moverse(300);
        
        String tipo1=vs1.getTipoVehiculo();
        String tipo2=vs2.getTipoVehiculo();
        String tipo3=vs3.getTipoVehiculo();
        
        vs.recorridoMaximo( recorrido1, recorrido2,recorrido3,tipo1,tipo2,tipo3);
        
        
        
       

    }

}
