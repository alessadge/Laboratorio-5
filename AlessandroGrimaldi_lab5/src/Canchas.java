

import java.util.ArrayList;

public class Canchas extends Lugares{
    private String categoria;
    private String estado;

    public Canchas() {
    }

    public Canchas(String categoria, String estado, String nombre, String direccion, int seguridad) {
        super(nombre, direccion, seguridad);
        this.categoria = categoria;
        this.estado = estado;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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
    
}
