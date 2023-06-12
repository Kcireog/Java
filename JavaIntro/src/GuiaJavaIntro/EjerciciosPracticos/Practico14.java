//Crea una aplicación que a través de una función nos convierta una cantidad de euros
//introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
//función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
//una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
//(void).
//El cambio de divisas es:
//* 0.86 libras es un 1 €
//* 1.28611 $ es un 1 €
//* 129.852 yenes es un 1 €
package GuiaJavaIntro.EjerciciosPracticos;
import java.util.*;


public class Practico14 {
    public static void main(String[] args) {
        
        String moneda;
        Double euros;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una cantidad de euros:");
        euros=leer.nextDouble();
        
        System.out.println("Moneda a convertir:");
        leer.nextLine();
        moneda=leer.nextLine().toLowerCase();
        
        
        ConvertirMoneda(euros,moneda);
        
        
       
        
    }
    
    public static void ConvertirMoneda(Double euros, String moneda){
        
        double conversion;
        
        switch (moneda) {
            case "dolares":
                conversion=euros * 1.28611;
                System.out.println(euros+" euros equivalen a:  "+ conversion+ "dolares.");
                break;
                
            case "yenes":
                conversion=euros * 129.852;
                System.out.println(euros+" euros equivalen a:  "+ conversion+ "yenes.");
                break;
                
            case "libras":
                conversion=euros * 0.86;
                System.out.println(euros+" euros equivalen a:  "+ conversion+ "libras.");
                break;
                
            default:
                System.out.println("Opcion invalida....");;
                break;
        }
        
        
        
       
             
    }
    
}
