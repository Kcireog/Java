package Servicio;

import Entidad.MesSecreto;
import java.util.Scanner;

public class MesSecretoService {

    MesSecreto mes = new MesSecreto();
    Scanner leer = new Scanner(System.in);

    public boolean adivinarMes() {

        System.out.println(" Adivine el mes secreto ");
        System.out.println("Mes: ");
        String mesIngresado = leer.nextLine();

        return mesIngresado.equalsIgnoreCase(mes.getMesSecreto());

    }
}
