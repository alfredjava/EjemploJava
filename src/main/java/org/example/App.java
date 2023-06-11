package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!");

        UsuarioServices services = new UsuarioImpl();
        Usuario usuario = new Usuario();
        usuario.setApellido("Barrios");
        usuario.setCodigo("C001");


        System.out.println( services.registrarUsuario(usuario));
    }
}
