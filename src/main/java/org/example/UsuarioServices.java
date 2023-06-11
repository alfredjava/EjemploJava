package org.example;

public interface UsuarioServices {

    public String registrarUsuario(Usuario usuario);
    public String eliminarUsuario(String codigo);
    public void actualizarUsuario(Usuario usuario);
    public void actualizarUsuario(String codigo, String correo);
}
