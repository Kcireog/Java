package Main;

import Servicio.NIFService;

public class MainNIF {

    public static void main(String[] args) {
        NIFService ns = new NIFService();

        ns.crearNif();
        ns.mostrar();
    }

}
