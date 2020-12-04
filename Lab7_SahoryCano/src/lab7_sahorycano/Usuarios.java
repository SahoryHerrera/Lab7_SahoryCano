/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_sahorycano;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author sahor
 */
public class Usuarios {

    private ArrayList<Usuario> usuario = new ArrayList();
    private File file = null;

    public Usuarios(String fileLocation) {
        this.file = new File(fileLocation);
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public ArrayList<Usuario> getUsers() {
        return usuario;
    }

    public void setUsers(ArrayList<Usuario> users) {
        this.usuario = users;
    }

    public void addUser(Usuario user) {
        this.usuario.add(user);
    }

    public void readFile() {

        try {

            usuario = new ArrayList();
            Usuario tempUser;

            if (file.exists()) {

                FileInputStream inputFile = new FileInputStream(file);
                ObjectInputStream objectInput = new ObjectInputStream(inputFile);

                try {

                    while ((tempUser = (Usuario) objectInput.readObject()) != null) {
                        usuario.add(tempUser);
                    }

                } catch (EOFException e) {
                    e.printStackTrace();
                }

                objectInput.close();
                inputFile.close();

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void writeFile() {

        FileOutputStream f_output = null;
        ObjectOutputStream o_output = null;

        try {

            f_output = new FileOutputStream(file);
            o_output = new ObjectOutputStream(f_output);

            for (Usuario user : usuario) {
                o_output.writeObject(user);
            }

            o_output.flush();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {

                o_output.close();
                f_output.close();

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
