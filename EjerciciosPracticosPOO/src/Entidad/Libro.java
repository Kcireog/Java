package Entidad;

public class Libro {

    int isbn, numPag;
    String titulo, autor;

    public Libro(int isbn, String titulo, String autor, int numPag) {

        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
    }

    public Libro() {

    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

}
