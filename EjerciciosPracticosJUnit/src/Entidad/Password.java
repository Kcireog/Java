package Entidad;

public class Password {

    private int longitudMin = 3;
    private boolean caracteresEspeciales;
    private boolean mayusculas;
    private int longitudMax = 9;

    public Password() {
    }

    public Password(int longitudMin, boolean caracteresEspeciales, boolean mayusculas, int longitudMax) {
        this.longitudMin = longitudMin;
        this.caracteresEspeciales = caracteresEspeciales;
        this.mayusculas = mayusculas;
        this.longitudMax = longitudMax;
    }

    public int getLongitudMin() {
        return longitudMin;
    }

    public void setLongitudMin(int longitudMin) {
        this.longitudMin = longitudMin;
    }

    public boolean isCaracteresEspeciales() {
        return caracteresEspeciales;
    }

    public void setCaracteresEspeciales(boolean caracteresEspeciales) {
        this.caracteresEspeciales = caracteresEspeciales;
    }

    public boolean isMayusculas() {
        return mayusculas;
    }

    public void setMayusculas(boolean mayusculas) {
        this.mayusculas = mayusculas;
    }

    public int getLongitudMax() {
        return longitudMax;
    }

    public void setLongitudMax(int longitudMax) {
        this.longitudMax = longitudMax;
    }

}
