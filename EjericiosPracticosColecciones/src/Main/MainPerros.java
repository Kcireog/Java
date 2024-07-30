package Main;

import Servicio.PerrosService;

public class MainPerros {

    public static void main(String[] args) {

        PerrosService ps = new PerrosService();

        ps.fabricaPerro();
        ps.eliminarPerroPorNombre("Lola");
        ps.mostrarPerros();
    }
}
