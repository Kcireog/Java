package Main;

import Servicio.PersonaService;

public class MainPersona {

    public static void main(String[] args) {

        PersonaService ps1 = new PersonaService();
        PersonaService ps2 = new PersonaService();
        PersonaService ps3 = new PersonaService();
        PersonaService ps4 = new PersonaService();

        int contPesoIdeal = 0;
        int contDebajoPeso = 0;
        int contSobrePeso = 0;
        int contMayorEdad = 0;
        int contMenorEdad = 0;

        for (int i = 1; i < 5; i++) {
            System.out.println(" Persona " + i);
            switch (i) {
                case 0:
                    ps1.crearPersona();
                    int imc1 = ps1.calcularIMC();
                    if (imc1 == 0) {
                        contPesoIdeal++;
                    } else if (imc1 == -1) {
                        contDebajoPeso++;
                    } else if (imc1 == 1) {
                        contSobrePeso++;
                    }

                    boolean edad1 = ps1.esMayorDeEdad();
                    if (edad1 == true) {
                        contMayorEdad++;
                    } else {
                        contMenorEdad++;
                    }
                    break;
                case 2:
                    ps2.crearPersona();
                    int imc2 = ps2.calcularIMC();
                    if (imc2 == 0) {
                        contPesoIdeal++;
                    } else if (imc2 == -1) {
                        contDebajoPeso++;
                    } else if (imc2 == 1) {
                        contSobrePeso++;
                    }
                    boolean edad2 = ps2.esMayorDeEdad();
                    if (edad2 == true) {
                        contMayorEdad++;
                    } else {
                        contMenorEdad++;
                    }
                    break;
                case 3:
                    ps3.crearPersona();
                    int imc3 = ps3.calcularIMC();
                    if (imc3 == 0) {
                        contPesoIdeal++;
                    } else if (imc3 == -1) {
                        contDebajoPeso++;
                    } else if (imc3 == 1) {
                        contSobrePeso++;
                    }
                    boolean edad3 = ps3.esMayorDeEdad();
                    if (edad3 == true) {
                        contMayorEdad++;
                    } else {
                        contMenorEdad++;
                    }
                    break;
                default:
                    ps4.crearPersona();
                    int imc4 = ps4.calcularIMC();
                    if (imc4 == 0) {
                        contPesoIdeal++;
                    } else if (imc4 == -1) {
                        contDebajoPeso++;
                    } else if (imc4 == 1) {
                        contSobrePeso++;
                    }
                    boolean edad4 = ps4.esMayorDeEdad();
                    if (edad4 == true) {
                        contMayorEdad++;
                    } else {
                        contMenorEdad++;
                    }
                    break;
            }
        }

        System.out.println(" Resultados ");
        System.out.println("Personas en Peso ideal: " + contPesoIdeal);
        System.out.println("Personas por debajo del Peso ideal: " + contDebajoPeso);
        System.out.println("Personas con sobre peso: " + contSobrePeso);
        System.out.println("Personas mayores de edad: " + contMayorEdad);
        System.out.println("Personas mayores de edad: " + contMenorEdad);

    }

}
