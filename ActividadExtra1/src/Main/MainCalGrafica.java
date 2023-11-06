package Main;

import Servicio.CalGraficaService;
import java.util.Scanner;

public class MainCalGrafica {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int opc;
        CalGraficaService cgs1=new CalGraficaService();
        CalGraficaService cgs2=new CalGraficaService();
        CalGraficaService cgs3=new CalGraficaService();
        CalGraficaService cgs4=new CalGraficaService();
        CalGraficaService cgs5=new CalGraficaService();
        CalGraficaService cgs6=new CalGraficaService();
        CalGraficaService cgs7=new CalGraficaService();
        
        do {
            System.out.println("""
                                 MENU
                               1.Cuadrado
                               2.Rectangulo
                               3.Triangulo
                               4.Circulo
                               5.Hexagono
                               6.Pentagono
                               7.Rombo
                               8.Salir
                               
                               """);
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    cgs1.crearCuadrado();
                    cgs1.areayperimetroCuadrado();
                    break;

                case 2:
                    cgs2.crearRectangulo();
                    cgs2.areayperimetroRectangulo();
                    break;

                case 3:
                    cgs3.crearTriangulo();
                    cgs3.areayperimetroTriangulo();
                    break;

                case 4:
                    cgs4.crearCirculo();
                    cgs4.areayperimetroCirculo();
                    break;

                case 5:
                    cgs5.crearHexagono();
                    cgs5.areayperimetroHexagono();
                    break;

                case 6:
                    cgs6.areayperimetroPentagono();
                    cgs6.areayperimetroPentagono();
                    break;

                case 7:
                    cgs7.crearRombo();
                    cgs7.areayperimetroRombo();
                    break;

                case 8:

                    break;
                default:
                    System.out.println("Opcion invalida...");
            }

        } while (opc != 8);
    }
}
