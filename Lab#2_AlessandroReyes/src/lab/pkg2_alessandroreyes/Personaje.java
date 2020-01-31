package lab.pkg2_alessandroreyes;

public class Personaje {
    private int tipo;
    private String nombre;
    private int raza;
    private int estatura;
    private int peso;
    private int edad;
    private String descripcion;
    private int nacionalidad;
    private int hp;
    private int cs;
    private int ac;
    private int dg;

    public Personaje() {
    
    }

    public Personaje(int tipo, int raza, int estatura, int peso, int edad, String descripcion, int nacionalidad) {
        if(tipo >0 && tipo < 5)
            this.tipo = tipo;
        this.raza = raza;
        this.estatura = estatura;
        this.peso = peso;
        this.edad = edad;
        this.descripcion = descripcion;
        this.nacionalidad = nacionalidad;
    }

    public Personaje(int tipo, String nombre, int raza, int estatura, int peso, int edad, String descripcion, int nacionalidad, int hp, int cs, int ac, int dg) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.raza = raza;
        this.estatura = estatura;
        this.peso = peso;
        this.edad = edad;
        this.descripcion = descripcion;
        this.nacionalidad = nacionalidad;
        this.hp = hp;
        this.cs = cs;
        this.ac = ac;
        this.dg = dg;
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

    
    public int getRaza() {
        return raza;
    }

    public void setRaza(int raza) {
        this.raza = raza;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
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

    public int getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(int nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getCs() {
        return cs;
    }

    public void setCs(int cs) {
        this.cs = cs;
    }

    public int getAc() {
        return ac;
    }

    public void setAc(int ac) {
        this.ac = ac;
    }

    public int getDg() {
        return dg;
    }

    public void setDg(int dg) {
        this.dg = dg;
    }

    @Override
    public String toString() {
        return "nombre= " + nombre + "\n estatura= " + estatura + "\n peso= " + peso + "\n edad= " + edad + 
                "\n descripcion=" + descripcion + "\n hp= " + hp + "\n cs= " + cs + "\n ac= " + ac + "\n dg= " + dg;
    }

    
    
    
}
