
package Main;


import Servicio.CafeteraService;


public class MainCafetera {
    public static void main(String[] args) {
       
        CafeteraService cs=new CafeteraService();
        //No hay necesidad de instaciar la entidad en el main.
        cs.llenarCafetera();
        cs.servirTaza();
        cs.vaciarCafetera();
        cs.agregarCafe();
    }
}
