package Main;

import Servicio.CadenaService;
import java.util.Scanner;

public class MainCadena {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int opc;
        CadenaService cs = new CadenaService();

        cs.crearCadena();

        do {
            System.out.println("""
                                  MENU
                               1.Mostrar Vocales
                               2.Invertir Frase
                               3.Caracter Repetido
                               4.Comparar Longitud
                               5.Unir Frases
                               6.Reemplazar "a"
                               7.Encontrar Caracter
                               8.Salir
                               
                               """);
            opc = leer.nextInt();
            leer.nextLine();
            switch (opc) {
                case 1:
                    int vocales = cs.mostrarVocales();
                    System.out.println("La frase/palabra tiene " + vocales + " vocales");
                    break;

                case 2:
                    cs.invertirFrase();
                    break;

                case 3:
                    System.out.println("Ingrese un caracter para encontrar:");
                    String letra = leer.next();
                    cs.vecesRepetido(letra);
                    break;

                case 4:
                    System.out.println("Ingrese una frase nueva para comparar:");
                    String frase = leer.nextLine();
                    cs.comparLongitud(frase);
                    break;

                case 5:
                    System.out.println("Ingrese una frase nueva para añadir:");
                    frase = leer.nextLine();
                    cs.unirFrases(frase);
                    break;

                case 6:
                    System.out.println("Ingrese un caracter para reemplazar 'a':");
                    letra = leer.next();
                    cs.remplazar(letra);
                    break;

                case 7:
                    System.out.println("Ingrese una letra para buscar en la frase:");
                    letra = leer.next();
                    boolean resultado = cs.contiene(letra);
                    if (resultado) {
                        System.out.println("La letra " + letra + " se encuentra en la frase...");
                    } else {
                        System.out.println("La letra " + letra + " no se encuentra en la frase...");
                    }
                    break;

                case 8:

                    break;
                default:
                    System.out.println("Opcion invalida...");
            }

        } while (opc != 8);
    }

}
