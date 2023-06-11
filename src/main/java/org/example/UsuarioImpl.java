package org.example;

public class UsuarioImpl implements UsuarioServices{
    @Override
    public String registrarUsuario(Usuario usuario) {
        usuario.setCodigo("codigo");
        //usuario.setApellido("apellido");
        return usuario.getCodigo();
    }

    @Override
    public String eliminarUsuario(String codigo) {
        return null;
    }

    @Override
    public void actualizarUsuario(Usuario usuario) {
        usuario.setCorreo("alfred@gmail.com");
        usuario.setApellido("Barrios");
    }

    @Override
    public void actualizarUsuario(String codigo, String correo) {
        Usuario usuario = new Usuario();
        usuario.setCodigo(codigo);
        usuario.setCorreo(correo);
    }


}
