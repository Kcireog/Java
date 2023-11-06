package Servicio;

import Entidad.Circunferencia;
import java.util.Scanner;

public class CircunferenciaService {

    public Circunferencia crearCircunferencia() {

        Scanner leer = new Scanner(System.in);
        Circunferencia circunferencia = new Circunferencia();

        System.out.println("Radio: ");
        circunferencia.setRadio(leer.nextDouble());

        return circunferencia;
    }

    public  void areaCircunferencia(Circunferencia circunferencia) {

        Double area = Math.PI * Math.pow(circunferencia.getRadio(), 2);

        System.out.println("EL area de la circunferencia es: "+area);

        
    }

    public void perimetroCircunferencia(Circunferencia circunferencia) {

        Double perimetro = 2 * Math.PI * circunferencia.getRadio();
        System.out.println("EL perimetro de la circunferencia es: "+perimetro);
    }

    
}
