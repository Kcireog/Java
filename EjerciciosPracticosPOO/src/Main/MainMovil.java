package Main;

import Servicio.MovilService;

public class MainMovil {
    public static void main(String[] args) {
        MovilService ms=new MovilService();
        
        ms.cargarCelular();
        ms.mostrarMovil();
    }
}
