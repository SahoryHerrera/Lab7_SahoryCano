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
 * @author sahory
 */
public class Administrador_compiladores {

    ArrayList<Compilador> compilador = new ArrayList();
    File file = null;

    public Administrador_compiladores(String fileLocation) {
        this.file = new File(fileLocation);
    }

    public ArrayList<Compilador> getcompilador() {
        return compilador;
    }

    public void setCompis(ArrayList<Compilador> compilador) {
        this.compilador = compilador;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public void addCompi(Compilador compilador) {
        this.compilador.add(compilador);
    }

    public void readFile() {

        try {

            compilador = new ArrayList();
            Compilador temp_Compilador;

            if (file.exists()) {

                FileInputStream inputFile = new FileInputStream(file);
                ObjectInputStream objectInput = new ObjectInputStream(inputFile);

                try {

                    while ((temp_Compilador = (Compilador) objectInput.readObject()) != null) {
                        compilador.add(temp_Compilador);
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

            for (Compilador compilator : compilador) {
                o_output.writeObject(compilator);
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
