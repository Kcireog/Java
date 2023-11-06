

package Entidad;


public class Persona {
    public String nombre;
    public int edad;
    public int id;

    public Persona() {
    }
    
    /*
    Para diferenciar entre los atributos del objeto y los identificadores de los parámetros del método
    constructor, se utiliza la palabra this. De esta forma, los parámetros del método pueden tener el
    mismo nombre que los atributos de la clase.
    */
    public Persona(String nombre, int edad, int id) {
        //atributos de la clase = parametros del metodo
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
