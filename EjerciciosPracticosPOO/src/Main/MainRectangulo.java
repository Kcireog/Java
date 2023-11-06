
package Main;

import Entidad.Rectangulo;
import Servicio.RectanguloService;


public class MainRectangulo {
    public static void main(String[] args) {
        
        RectanguloService rc = new RectanguloService();
        
        Rectangulo rectangulo = rc.crearRectangulo();
        
        double superficie= rc.calcularSuperficie(rectangulo);
        double perimetro= rc.calcularPerimetro(rectangulo);
        
        System.out.println("Superficie del rectangulo: "+superficie
        +"Perimetro del rectangulo: "+perimetro);
        
        rc.dibujarRectangulo(rectangulo);
        
        
        
    }
}
