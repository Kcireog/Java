
package Servicio;


public class DiscountCalculator {
    
    public double Discount(double precio, int porcentaje){
         double aux= (precio*porcentaje)/100;
         return precio-aux;
    }
}
