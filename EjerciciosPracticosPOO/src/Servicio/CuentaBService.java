package Servicio;

import Entidad.CuentaB;
import java.util.Scanner;

public class CuentaBService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    CuentaB cuenta = new CuentaB();

    public CuentaB crearCuenta() {

        System.out.println("Ingrese el numero de cuenta:");
        cuenta.setNumeroCuenta(leer.nextInt());

        System.out.println("Ingrese el DNI del cliente:");
        cuenta.setDniCliente(leer.nextLong());

        System.out.println("Ingrese el saldo actual:");
        cuenta.setSaldoActual(leer.nextInt());

        return cuenta;
    }

    /*
    El método ingresar se ha definido como void, porque su objetivo es modificar 
    el estado interno de la clase, específicamente el atributo 
    saldoActual. Al definirlo como void, estás indicando que el método no devuelve ningún valor 
    y solo realiza una acción.
     */
    public void ingresar(int ingreso) {

        cuenta.setSaldoActual(cuenta.getSaldoActual() + ingreso);
    }

    public void retirar(int retiro) {

        if (cuenta.getSaldoActual() <= retiro) {
            cuenta.setSaldoActual(0);

        } else {
            cuenta.setSaldoActual(cuenta.getSaldoActual() - retiro);

        }

    }

    public void extraccionRapida() {

        double limite = cuenta.getSaldoActual() * 0.2;
        boolean esMayor = true;

        System.out.println("Cantidad de dinero a extraer:");
        int extraccion = leer.nextInt();

        while (esMayor) {
            if (extraccion <= limite) {
                cuenta.setSaldoActual((int) (cuenta.getSaldoActual() - limite));
                esMayor = false;
            } else {
                System.out.println("No puede sacar un monto mayor al 20% de su saldo....");
                System.out.println("Cantidad de dinero a extraer:");
                extraccion = leer.nextInt();
            }
        }
    }

    public void consultarSaldo() {

        System.out.println("Saldo disponible: $" + cuenta.getSaldoActual());

    }

    public void consultarDatos() {

        System.out.println(" DATOS "
                + "\nNumero de cuenta: " + cuenta.getNumeroCuenta()
                + "\nDNI: " + cuenta.getDniCliente()
                + "\nSaldo Actual: $" + cuenta.getSaldoActual());

    }
}
