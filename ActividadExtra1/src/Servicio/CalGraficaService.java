package Servicio;

import Entidad.*;
import java.util.Scanner;

public class CalGraficaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Cuadrado cuadrado = new Cuadrado();
    Rectangulo rectangulo = new Rectangulo();
    Triangulo triangulo = new Triangulo();
    Circulo circulo = new Circulo();
    Hexagono hexagono = new Hexagono();
    Pentagono pentagono = new Pentagono();
    Rombo rombo = new Rombo();

    public Cuadrado crearCuadrado() {
        System.out.println(" Cuadrado");
        System.out.println("Lado: ");
        cuadrado.setLado(leer.nextInt());
        return cuadrado;

    }

    public void areayperimetroCuadrado() {

        int perimetro = 4 * cuadrado.getLado();
        int area = (int) Math.pow(cuadrado.getLado(), 2);
        System.out.println("Perimetro: " + perimetro
                + "\nArea: " + area);
    }

    public Rectangulo crearRectangulo() {

        System.out.println(" Rectangulo ");
        System.out.println("Base:");
        rectangulo.setBase(leer.nextInt());

        System.out.println("Altura:");
        rectangulo.setAltura(leer.nextInt());

        return rectangulo;
    }

    public void areayperimetroRectangulo() {
        int perimetro = (2 * rectangulo.getAltura()) + (2 * rectangulo.getBase());
        int area = rectangulo.getBase() * rectangulo.getAltura();

        System.out.println("Perimetro: " + perimetro
                + "\nArea: " + area);
    }

    public Triangulo crearTriangulo() {
        System.out.println(" Triangulo ");
        System.out.println("Base:");
        triangulo.setBase(leer.nextInt());

        System.out.println("Altura:");
        triangulo.setAltura(leer.nextInt());

        System.out.println("Lado:");
        triangulo.setLado(leer.nextInt());
        return triangulo;
    }

    public void areayperimetroTriangulo() {
        int perimetro = triangulo.getLado() + triangulo.getLado() + triangulo.getLado();
        int area = (triangulo.getBase() * triangulo.getAltura()) / 2;

        System.out.println("Perimetro: " + perimetro
                + "\nArea: " + area);

    }

    public Circulo crearCirculo() {

        System.out.println(" Circulo ");
        System.out.println("Diametro:");
        circulo.setDiametro(leer.nextInt());

        return circulo;
    }

    public void areayperimetroCirculo() {

        int perimetro = (int) Math.PI * circulo.getDiametro();
        int area = (int) (Math.PI * Math.pow(circulo.getDiametro() / 2, 2));

        System.out.println("Perimetro: " + perimetro
                + "\nArea: " + area);
    }

    public Hexagono crearHexagono() {

        System.out.println(" Hexagono ");
        System.out.println("Lado:");
        hexagono.setLado(leer.nextInt());
        System.out.println("Apotema:");
        hexagono.setApotema(leer.nextInt());

        return hexagono;
    }

    public void areayperimetroHexagono() {
        int perimetro = 6 * hexagono.getLado();
        int area = (perimetro * hexagono.getApotema()) / 2;

        System.out.println("Perimetro: " + perimetro
                + "\nArea: " + area);
    }

    public Pentagono crearPentagono() {

        System.out.println(" Pentagono ");
        System.out.println("Lado:");
        pentagono.setLado(leer.nextInt());
        System.out.println("Apotema:");
        pentagono.setApotema(leer.nextInt());

        return pentagono;
    }

    public void areayperimetroPentagono() {
        int perimetro = 5 * pentagono.getLado();
        int area = (perimetro * pentagono.getApotema()) / 2;

        System.out.println("Perimetro: " + perimetro
                + "\nArea: " + area);
    }

    public Rombo crearRombo() {

        System.out.println(" Rombo ");
        System.out.println("Lado:");
        rombo.setLado(leer.nextInt());
        System.out.println("Diagonal Mayor:");
        rombo.setDiagonalMayor(leer.nextInt());
        System.out.println("Diagonal Menor:");
        rombo.setDiagonalMenor(leer.nextInt());

        return rombo;
    }

    public void areayperimetroRombo() {

        int perimetro = 4 * rombo.getLado();
        int area = (rombo.getDiagonalMayor() * rombo.getDiagonalMenor()) / 2;

        System.out.println("Perimetro: " + perimetro
                + "\nArea: " + area);

    }

}
