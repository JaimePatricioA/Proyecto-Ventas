package modelo;     /**     @author Curso-09-04     */

import java.util.ArrayList;


public class Usuario {
    
    String nombre;
    char[] pass;
    ArrayList<Usuario> ListaUsuarios = new ArrayList<>();

    public Usuario(String nombre, char[] pass) {
        this.nombre = nombre;
        this.pass = pass;
        addUser(this);
    }
    
    public void addUser(Usuario user) {
        ListaUsuarios.add(user);
    }
    
}
