/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_sahorycano;

/**
 *
 * @author sahor
 */
public class SuperUsuario extends Usuario {

    public SuperUsuario(String nombre, String apellido, String usuario, String contraseña) {
        super(nombre, apellido, usuario, contraseña);
        super.setNombre("Sahory");
        super.setApellido("Herrera");
        super.setApellido("Skarll");
        super.setApellido("12345678");

    }

}
