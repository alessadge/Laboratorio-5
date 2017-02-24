
public class Casa extends Lugares{

    public Casa() {
    }

    public Casa(String nombre, String direccion, int seguridad) {
        super(nombre, direccion, seguridad);
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

    public Carreteras getEntrada() {
        return entrada;
    }

    public void setEntrada(Carreteras entrada) {
        this.entrada = entrada;
    }

    public Carreteras getSalida() {
        return salida;
    }

    public void setSalida(Carreteras salida) {
        this.salida = salida;
    }

    @Override
    public String toString() {
        return "Casa{" + '}';
    }
    
}
