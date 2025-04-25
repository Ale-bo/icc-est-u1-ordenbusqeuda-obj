package models;

public class Persona {
    private String nombre;
    private int edad;
    private Direccion direccion;
    public Persona(String nombre, int edad, Direccion direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public Direccion getDireccion() {
        return direccion;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public int getCodigoDireccion(){
        return direccion.getCodigo();
    }

    public boolean compareCodigoDireccion(Persona persona){
        boolean condicion = direccion.getCodigo() > persona.getDireccion().getCodigo();
        return condicion;
    }
    public boolean compareCodigoDireccion(int codigo){
        boolean condicion = getCodigoDireccion() > codigo;
        return condicion;
    }

    public boolean equalsByCodigoDireccion(int codigo){
        return getCodigoDireccion() == codigo;
    }


    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + ", direccion=" + direccion + "]";
    }
    
    
}