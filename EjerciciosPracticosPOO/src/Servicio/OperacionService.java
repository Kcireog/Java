package Servicio;

import Entidad.Operacion;
import java.util.Scanner;

public class OperacionService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Operacion crearOperacion() {

        Operacion operacion = new Operacion();

        System.out.println("Ingrese el num1: ");
        operacion.setNumero1(leer.nextInt());

        System.out.println("Ingrese el num2: ");
        operacion.setNumero2(leer.nextInt());

        return operacion;
    }

    public int sumar(Operacion operacion) {
        int suma;
        suma = operacion.getNumero1() + operacion.getNumero2();

        return suma;
    }

    public int restar(Operacion operacion) {
        int resta;
        resta = operacion.getNumero1() - operacion.getNumero2();

        return resta;
    }

    public int multiplicar(Operacion operacion) {
        int multi;

        if (operacion.getNumero1() == 0 || operacion.getNumero2() == 0) {
            multi = 0;
        } else {
            multi = operacion.getNumero1() * operacion.getNumero2();
        }

        return multi;
    }

    public double division(Operacion operacion) {
        double divi;

        if (operacion.getNumero2() == 0) {
            divi = 0;

        } else {
            divi = operacion.getNumero1() / operacion.getNumero2();
        }

        return divi;
    }

}
