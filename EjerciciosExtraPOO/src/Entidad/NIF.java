package Entidad;

public class NIF {

    private long numDNI;
    private char letra;

    public NIF() {
    }

    public NIF(long numDNI, char letra) {
        this.numDNI = numDNI;
        this.letra = letra;
    }

    public long getNumDNI() {
        return numDNI;
    }

    public void setNumDNI(long numDNI) {
        this.numDNI = numDNI;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

}
