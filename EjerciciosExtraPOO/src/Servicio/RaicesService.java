package Servicio;

import Entidad.Raices;

public class RaicesService {

    Raices raices = new Raices(1,-5,6);

    public double getDiscriminante() {
        Double discriminante;
        discriminante = (Math.pow(raices.getB(), 2) - 4 * raices.getA() * raices.getC());

        return discriminante;
    }

    public boolean tieneRaices() {
        return getDiscriminante() >= 0;
    }

    public boolean tieneRaiz() {
        return getDiscriminante() == 0;
    }

    public void obtenerRaices() {

        double solucion1 = (-raices.getB() + (Math.sqrt(getDiscriminante())) / (2 * raices.getA()));
        double solucion2 = (raices.getB() + (Math.sqrt(getDiscriminante())) / (2 * raices.getA()));

        if (tieneRaices()) {
            System.out.println("Solucion 1: " + solucion1);
            System.out.println("Solucion 2: " + solucion2);
        }
    }

    public void obtenerRaiz() {

        if (tieneRaiz()) {
            double raiz = (-raices.getB()) / (2 * raices.getA());
            System.out.println("Raiz unica: " + raiz);
        }
    }

    public void calcular() {
        if (tieneRaices()) {
            obtenerRaices();
        } else if (tieneRaiz()) {
            obtenerRaiz();
        } else {
            System.out.println("No existen soluciones reales.");
        }
    }

}
