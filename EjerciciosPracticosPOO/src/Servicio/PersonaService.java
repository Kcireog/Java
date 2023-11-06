package Servicio;

import Entidad.Persona;
import java.util.*;

public class PersonaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Persona persona = new Persona();

    public Persona crearPersona() {
        Boolean esCorrecto = false;
        System.out.println("Nombre:");
        persona.setNombre(leer.nextLine());

        System.out.println("Edad:");
        persona.setEdad(leer.nextInt());

        System.out.println("Sexo('H' hombre, 'M' mujer, 'O' otro):");
        persona.setSexo(leer.next().toLowerCase().charAt(0));
        while (persona.getSexo() != 'h' && persona.getSexo() != 'm' && persona.getSexo() != 'o') {
            System.out.println("Sexo introducido, no valido...");
            System.out.println("Sexo('H' hombre, 'M' mujer, 'O' otro):");
            persona.setSexo(leer.next().toLowerCase().charAt(0));

        }

        System.out.println("Peso:");
        persona.setPeso(leer.nextDouble());

        System.out.println("Altura:");
        persona.setAltura(leer.nextDouble());

        return persona;
    }

    public int calcularIMC() {

        double peso = persona.getPeso();
        double altura = persona.getAltura();

        double imc = peso / Math.pow(altura, 2);

        if (imc < 20) {

            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }

    }
    
    public boolean esMayorDeEdad(){
        return persona.getEdad()>=18;//si esto se cumple devuelve true, sino false
        
    }
}
