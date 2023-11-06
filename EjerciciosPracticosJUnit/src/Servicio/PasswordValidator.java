package Servicio;

import Entidad.Password;

public class PasswordValidator {

    Password ps = new Password();

    public boolean longitudContraseña(String contraseña) {

        return (contraseña.length() > ps.getLongitudMin() && contraseña.length() < ps.getLongitudMax());
    }

    public boolean mayusculas(String contraseña) {
        boolean aux = false;

        for (char caracter : contraseña.toCharArray()) {
            if (Character.isUpperCase(caracter)) {
                aux = true;
                break;
            }
        }
        return aux;
    }

    public boolean caracteresEsp(String contraseña) {
        boolean aux = false;
        for (char caracter : contraseña.toCharArray()) {
            if (caracter == '-' || caracter == '_') {
                aux = true;
                break;
            }
        }
        return aux;
    }
}
