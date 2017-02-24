


public class Lugares {
    protected String nombre;
    protected String direccion;
    protected int seguridad;
    protected Carreteras entrada;
    protected Carreteras salida;

    public Lugares() {
    }

    public Lugares(String nombre, String direccion, int seguridad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.seguridad = seguridad;
        this.salida = salida;
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

    public Carreteras getEntrada() {
        return entrada;
    }

    public void setEntrada(Carreteras entrada) {
        this.entrada = entrada;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
