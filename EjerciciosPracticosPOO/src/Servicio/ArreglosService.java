package Servicio;

import Entidad.Arreglos;
import java.util.Random;

public class ArreglosService {

    Arreglos arreglos = new Arreglos();

    public void inicializarArregloA() {
        Random random = new Random();
        double[] arregloEntrada = arreglos.getArregloA();
        for (int i = 0; i < arreglos.getArregloA().length; i++) {
            arregloEntrada[i] = random.nextDouble() * 100;

        }
        arreglos.setArregloA(arregloEntrada);

    }

    public void mostrarArreglo(double[] arreglo) {

        for (double elemento:arreglo) {
            System.out.print("["+elemento+"]");
        }
        System.out.println();

    }
    
    public double[] getArreglo(String opc){
        if(opc.equalsIgnoreCase("a")){
            return arreglos.getArregloA();
        }else{
            return arreglos.getArregloB();
        }
    }
    public void setArreglo(double[] arreglo){
        if(arreglo.length>=50){
            arreglos.setArregloA(arreglo);
        }else{
           arreglos.setArregloB(arreglo);
        }
    }
    
   
}
