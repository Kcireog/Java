package GuiaJavaIntro;

import java.util.*;

public class Ejercicio11 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String entrada, vocales = "aeiou";

        System.out.println("Ingrese una frase o palabra terminada en '.':");
        entrada = leer.nextLine().toLowerCase();

        String entradaCodificada = codificar(entrada, vocales);

        System.out.println("Salida codificada: \n" + entradaCodificada);
    }

    public static String codificar(String entrada, String vocales) {
        String codificado = "";

        for (int i = 0; i < entrada.length(); i++) {

            char letra = entrada.charAt(i);
            String letraCod = String.valueOf(letra);

            if (vocales.contains(letraCod)) {
                switch (letra) {
                    case 'a':
                        letraCod = "@";
                        break;
                    case 'e':
                        letraCod = "#";
                        break;
                    case 'i':
                        letraCod = "$";
                        break;
                    case 'o':
                        letraCod = "%";
                        break;
                    case 'u':
                        letraCod = "*";
                        ;
                        break;
                }
            }
            codificado = codificado.concat(letraCod);
        }
        return codificado;
    }
}
