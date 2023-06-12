package GuiaJavaIntro.EjerciciosPracticos;

import java.util.*;

public class Practico5 {

    public static void main(String[] args) {
        int doble , triple;
        double raiz;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        int num = leer.nextInt();
        
        doble=num*2;
        triple=num*3;
        raiz=Math.sqrt(num);
        
        System.out.println(" Doble del num: "+doble
                +"\n  Triple del numero: "+triple
                +"\n   Raiz del numero: "+raiz);

    }

}
