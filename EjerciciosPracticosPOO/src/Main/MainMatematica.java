
package Main;

import Servicio.MatematicaService;

public class MainMatematica {
    public static void main(String[] args) {
        MatematicaService ms=new MatematicaService();
        
        ms.setNum(Math.random(), Math.random());
        
        
        
        ms.calcularPotencia();
        
        ms.calculaRaiz();
        
    }
 
}
