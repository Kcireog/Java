package Main;

import Servicio.CancionService;

public class MainCancion {
    public static void main(String[] args) {
        
       CancionService cs=new CancionService();
       
       cs.crearCacion();
       cs.mostrarCancion();
    }
}
