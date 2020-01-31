package lab.pkg2_alessandroreyes;

public class Personaje {
    private int tipo;
    private String nombre;
    private String raza;
    private String estatura;
    private int peso;
    private int edad;
    private String descripcion;
    private String nacionalidad;

    public Personaje() {
    
    }

    public Personaje(int tipo, String raza, String estatura, int peso, int edad, String descripcion, String nacionalidad) {
        if(tipo >0 && tipo < 5)
            this.tipo = tipo;
        this.raza = raza;
        this.estatura = estatura;
        this.peso = peso;
        this.edad = edad;
        this.descripcion = descripcion;
        this.nacionalidad = nacionalidad;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        if(tipo >0 && tipo < 5)
            this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getEstatura() {
        return estatura;
    }

    public void setEstatura(String estatura) {
        this.estatura = estatura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    
}
