package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;

public class RectanguloService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Rectangulo crearRectangulo() {

        Rectangulo rectangulo = new Rectangulo();

        System.out.println("Base del rectangulo:");
        rectangulo.setBase(leer.nextInt());

        System.out.println("altura del rectangulo:");
        rectangulo.setAltura(leer.nextInt());

        return rectangulo;
    }

    public double calcularSuperficie(Rectangulo rectangulo) {

        int superficie = (rectangulo.getBase() * rectangulo.getAltura());
       
        return superficie;
    }

    public double calcularPerimetro(Rectangulo rectangulo) {

        int perimetro = (int) Math.pow(rectangulo.getBase()+rectangulo.getAltura(), 2);
       
       return perimetro;
    }
    
    public void dibujarRectangulo(Rectangulo rectangulo){
        
        for (int i = 0; i < rectangulo.getAltura(); i++) {
            for (int j = 0; j <rectangulo.getBase(); j++) {
                if(i==0||i==rectangulo.getAltura()-1|| j==0|| j==rectangulo.getBase()-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                    
            }
            System.out.println("");
        }
    }

}
