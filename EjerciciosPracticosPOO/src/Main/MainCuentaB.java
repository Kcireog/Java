package Main;

//import Entidad.CuentaB;
import Servicio.CuentaBService;
import java.util.Scanner;

public class MainCuentaB {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        CuentaBService cs = new CuentaBService();
        cs.crearCuenta();
        int opc;
        do {
            System.out.println("""
                              MENU
                           1. Ingresar
                           2. Retirar
                           3. Extracción Rapida
                           4. Consultar Saldo
                           5. Cosultar Datos
                           6. Salir
                           """);
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Cantidad de dinero a ingresar:");
                    int ingreso = leer.nextInt();
                    cs.ingresar(ingreso);
                    break;
                case 2:
                    System.out.println("Cantidad de dinero a retirar:");
                    int retiro = leer.nextInt();
                    cs.retirar(retiro);
                    break;
                case 3:
                    cs.extraccionRapida();
                    break;
                case 4:
                    cs.consultarSaldo();
                    break;
                case 5:
                    cs.consultarDatos();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opcion invalida....");
                    ;
            }
        } while (opc != 6);

    }
}
