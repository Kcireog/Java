package Entidad;

import java.util.Date;

public class Pelicula {

    private String titulo;
    private String genero;
    private Date anio;
    private int duracionPelicula;

    public Pelicula() {
    }

    public Pelicula(String genero, Date anio, int duracionPelicula) {
        this.genero = genero;
        this.anio = anio;
        this.duracionPelicula = duracionPelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getAño() {
        return anio;
    }

    public void setAño(Date anio) {
        this.anio = anio;
    }

    public int getDuracionPelicula() {
        return duracionPelicula;
    }

    public void setDuracionPelicula(int duracionPelicula) {
        this.duracionPelicula = duracionPelicula;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", genero=" + genero + ", anio=" + anio + ", duracion=" + duracionPelicula + " min" + '}';
    }

}
