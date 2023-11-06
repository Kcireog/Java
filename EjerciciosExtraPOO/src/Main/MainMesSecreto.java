package Main;

import Servicio.MesSecretoService;

public class MainMesSecreto {

    public static void main(String[] args) {

        MesSecretoService ms = new MesSecretoService();
        boolean correcto;
        do {
            correcto = ms.adivinarMes();
            if (correcto) {
                System.out.println("Correcto...");

            } else {
                System.out.println("Vuelva a intentarlo...");
            }

        } while (!correcto);
    }

}
