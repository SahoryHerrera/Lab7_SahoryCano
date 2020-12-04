package lab7_sahorycano;

/**
 * @author sahory
 */
public class Error {

    private int codigo_error;
    private String descripcion;
   
    public Error(int codigo_error, String descripcion) {
        this.codigo_error = codigo_error;
        this.descripcion = descripcion;
    }

    public int getCodigo_error() {
        return codigo_error;
    }

    public void setCodigo_error(int codigo_error) {
        this.codigo_error = codigo_error;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Error{" + "codigo_error=" + codigo_error + ", descripcion=" + descripcion + '}';
    }
    
    
    
}
