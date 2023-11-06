package Main;

import Entidad.Circunferencia;
import Servicio.CircunferenciaService;

public class MainCircunferencia {
    public static void main(String[] args) {
        
        CircunferenciaService circunServicio = new CircunferenciaService();

        //guardamos el return del metodo en una variable de tipo objeto
        Circunferencia circunferencia = circunServicio.crearCircunferencia();
        circunServicio.areaCircunferencia(circunferencia);
        circunServicio.perimetroCircunferencia(circunferencia);
        
        
    }
}
