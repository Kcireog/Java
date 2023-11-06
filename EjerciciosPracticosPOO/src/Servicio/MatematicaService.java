package Servicio;

import Entidad.Matematica;

public class MatematicaService {

    Matematica matematica = new Matematica();

    public void setNum(double num1, double num2) {

        matematica.setNum1(num1);
        matematica.setNum2(num2);

    }

    public double devolverMayor() {
        double max = Math.max(matematica.getNum1(), matematica.getNum2());

        if (matematica.getNum1() == max) {
            return matematica.getNum1();
        } else {

            return matematica.getNum2();
        }

    }

    public void calcularPotencia() {
        System.out.println("Num1: "+matematica.getNum1()
                + "\nNum2: "+matematica.getNum2());
        Double numMayor = devolverMayor();
        Double numMenor;
        if (numMayor == matematica.getNum1()) {
            numMenor = matematica.getNum2();
        } else {
            numMenor = matematica.getNum1();
        }

        numMayor = Math.round(numMayor * 100.0) / 100.0;
        numMenor = Math.round(numMenor * 100.0) / 100.0;

        Double potencia = Math.pow(numMayor, numMenor);
        potencia=Math.round(potencia*100.0)/100.0;

        System.out.println("La potencia del numMayor^ numMenor: " + potencia);

    }

    public void calculaRaiz() {
        Double numMayor = devolverMayor();
        Double numMenor;
        if (numMayor == matematica.getNum1()) {
            numMenor = matematica.getNum2();
        } else {
            numMenor = matematica.getNum1();
        }
        
        numMenor=Math.abs(numMenor);
        
        Double raizNumMenor=Math.sqrt(numMenor);
        raizNumMenor=Math.round(raizNumMenor*100.0)/100.0;
        System.out.println("La raiz cuadrada del numMenor: "+raizNumMenor);
    }

}
