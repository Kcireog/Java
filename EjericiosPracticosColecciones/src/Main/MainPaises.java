package Main;

import Servicio.PaisService;

public class MainPaises {
    public static void main(String[] args) {
        
        PaisService ps = new PaisService();
        
        ps.fabricaPaises();
        ps.mostrarPaises();
        
        ps.ordenarAlfabeticamente();
        
        ps.eliminarPaisPorNombre("Peru");
    }
}
