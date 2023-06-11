package org.example;

public class Usuario extends Persona{

    private String codigo;
    private String correo;

    public Usuario() {
        super();
    }

    public String getCorreo() {
        return correo;
    }

    public Usuario(String nombre, String apellido, String direccion, String codigo,String correo) {
        super(nombre,apellido,direccion);
        this.codigo = codigo;
        this.correo = correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }



}
