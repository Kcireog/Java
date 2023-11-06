
package Main;

import Servicio.ArreglosService;
import java.util.Arrays;


public class MainArreglos {
    public static void main(String[] args) {
        double[] arregloA=new double[50];
        double[] arregloB=new double[20];
        ArreglosService as=new ArreglosService();
        //dar valores al arreglo a
        as.inicializarArregloA();
        arregloA=as.getArreglo("a");
        
        //mostrar el arreglo a
        System.out.println(" Arreglo A No Ordenado ");
        as.mostrarArreglo(as.getArreglo("a"));
        
        //ordenando el arregloA de menor a mayor
        Arrays.sort(arregloA);
        as.setArreglo(arregloA);
        
        //copiar los 10 primeros números ordenados del arregloA al arregloB
        System.arraycopy(arregloA, 0, arregloB, 0, 10);
        as.setArreglo(arregloB);
        //rellenar los 10 ultimos elementos del arregloB con el valor 0.5
        Arrays.fill(arregloB,10,20,0.5);
        as.setArreglo(arregloB);
        
        //Mostrar arregloA ordenado de menor a mayor
        System.out.println(" Arreglo A Ordenado ");
        as.mostrarArreglo(as.getArreglo("a"));
    
        //Mostrar arregloB 
        System.out.println(" Arreglo B ");
        as.mostrarArreglo(as.getArreglo("b"));
    }
}
