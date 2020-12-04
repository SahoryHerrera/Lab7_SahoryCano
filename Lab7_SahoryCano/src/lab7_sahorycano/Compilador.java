
package lab7_sahorycano;


import javax.swing.JTable;

/**
 *
 * @author sahor
 */
public class Compilador  {

    private String Nombre, Nombre_Creador;
    private JTable Tabla_Variables, Tabla_Errores;
    private int lineasTotales;
    private int lineas_Lexico, lineas_Sintactico, lineas_Semantico;
    private int lineas_Intermedio, lineas_Optimizador, lineas_Generador;

    public Compilador(String Nombre, String Nombre_Creador, JTable Tabla_Variables, JTable Tabla_Errores, int lineasTotales) {
        this.Nombre = Nombre;
        this.Nombre_Creador = Nombre_Creador;
        this.Tabla_Variables = Tabla_Variables;
        this.Tabla_Errores = Tabla_Errores;
        this.lineasTotales = lineasTotales;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre_Creador() {
        return Nombre_Creador;
    }

    public void setNombre_Creador(String Nombre_Creador) {
        this.Nombre_Creador = Nombre_Creador;
    }

    public JTable getTabla_Variables() {
        return Tabla_Variables;
    }

    public void setTabla_Variables(JTable Tabla_Variables) {
        this.Tabla_Variables = Tabla_Variables;
    }

    public JTable getTabla_Errores() {
        return Tabla_Errores;
    }

    public void setTabla_Errores(JTable Tabla_Errores) {
        this.Tabla_Errores = Tabla_Errores;
    }

    public int getLineasTotales() {
        return lineasTotales;
    }

    public void setLineasTotales(int lineasTotales) {
        this.lineasTotales = lineasTotales;
    }

    public int getLineas_Lexico() {
        return lineas_Lexico;
    }

    public void setLineas_Lexico(int lineas_Lexico) {
        this.lineas_Lexico = lineas_Lexico;
    }

    public int getLineas_Sintactico() {
        return lineas_Sintactico;
    }

    public void setLineas_Sintactico(int lineas_Sintactico) {
        this.lineas_Sintactico = lineas_Sintactico;
    }

    public int getLineas_Semantico() {
        return lineas_Semantico;
    }

    public void setLineas_Semantico(int lineas_Semantico) {
        this.lineas_Semantico = lineas_Semantico;
    }

    public int getLineas_Intermedio() {
        return lineas_Intermedio;
    }

    public void setLineas_Intermedio(int lineas_Intermedio) {
        this.lineas_Intermedio = lineas_Intermedio;
    }

    public int getLineas_Optimizador() {
        return lineas_Optimizador;
    }

    public void setLineas_Optimizador(int lineas_Optimizador) {
        this.lineas_Optimizador = lineas_Optimizador;
    }

    public int getLineas_Generador() {
        return lineas_Generador;
    }

    public void setLineas_Generador(int lineas_Generador) {
        this.lineas_Generador = lineas_Generador;
    }
       
}
