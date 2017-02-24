
import java.util.ArrayList;


public class Restaurantes extends Lugares {
    private String categoria;
    private int calificacion;

    public Restaurantes() {
    }

    public Restaurantes(String categoria, int calificacion, String nombre, String direccion, int seguridad) {
        super(nombre, direccion, seguridad);
        this.categoria = categoria;
        this.calificacion = calificacion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getSeguridad() {
        return seguridad;
    }

    public void setSeguridad(int seguridad) {
        this.seguridad = seguridad;
    }

    public Carreteras getSalida() {
        return salida;
    }

    public void setSalida(Carreteras salida) {
        this.salida = salida;
    }

    @Override
    public String toString() {
        return "Restaurantes{" + "categoria=" + categoria + ", calificacion=" + calificacion + '}';
    }
    
}
