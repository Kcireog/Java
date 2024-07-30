package Entidad;

public class Perros {

    private String nombre;
    private String raza;

    public Perros() {
    }

    public Perros(String raza, String nombre) {
        this.raza = raza;
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Perros{" + "nombre=" + nombre + ", raza=" + raza + '}';
    }

}
