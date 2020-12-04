/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_sahorycano;

import java.io.Serializable;

/**
 *
 * @author sahor
 */
public class Usuario implements Serializable {

    String nombre, apellido;
    String usuario, contraseña;
    int nota_final;
    private Compilador compiladorUsuario;
    
    private static final long SerialVersionUID = 567L;

    public Usuario(String nombre, String apellido, String usuario, String contraseña) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getNota_final() {
        return nota_final;
    }

    public void setNota_final(int nota_final) {
        this.nota_final = nota_final;
    }
    
     public Compilador getCompiladorUsuario() {
        return compiladorUsuario;
    }

    public void setCompiladorUsuario(Compilador compiladorUsuario) {
        this.compiladorUsuario = compiladorUsuario;
    }
    
}
