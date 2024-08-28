package tallerLaboratorioColecciones;

public class Producto implements Comparable<Producto> {

	private String code;
    private String nombre;
    private double precio;
 
    public Producto(String code, String nombre, double precio) {
        this.code = code;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getCode() {
        return code;
    }

    public void setCodigo(String code) {
        this.code = code;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public int compareTo(Producto o) {
        return this.code.compareTo(o.getCode());
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo='" + code + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}

