package Main;

import Entidad.Operacion;
import Servicio.OperacionService;

public class MainOperacion {

    public static void main(String[] args) {

        OperacionService os = new OperacionService();

        Operacion operacion = os.crearOperacion();

        int suma = os.sumar(operacion);
        int resta = os.restar(operacion);
        int multi = os.multiplicar(operacion);
        double divi = os.division(operacion);

        int num1 = operacion.getNumero1();
        int num2 = operacion.getNumero2();

        System.out.println(num1 + " + " + num2 + "= " + suma);
        System.out.println(num1 + " - " + num2 + "= " + resta);

        if (multi == 0) {
            System.out.println("Es una multiplicacion por 0...");
        } else {
            System.out.println(num1 + " * " + num2 + "= " + multi);
        }

        if (divi == 0) {
            System.out.println("Es una division por 0...");
        } else {
            System.out.println(num1 + " / " + num2 + "= " + divi);
        }

    }
}
