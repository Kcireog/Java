package Main;

import Servicio.PuntosService;



public class MainPuntos {
    public static void main(String[] args) {
        PuntosService ps=new PuntosService();
        
        ps.crearPuntos();
        ps.distanciaPuntos();
    }
}
