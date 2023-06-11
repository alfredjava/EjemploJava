package org.example;

public class Persona {

    private String nombre;
    private String apellido;
    private String direccion;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Persona(String nombre, String apellido, String direccion) {

    }

    public Persona() {

    }

    public void setApellido(String barrios) {
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
