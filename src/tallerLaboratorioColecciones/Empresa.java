package tallerLaboratorioColecciones;

import java.util.TreeSet;

public class Empresa {
    private TreeSet<Producto> productos;

    public Empresa() {
        this.productos = new TreeSet<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public String buscarProductoPorCodigo(String code) {
    	String mensaje ="El produco no se pudo encontrar o no existe.";
        for (Producto producto : productos) {
            if (producto.getCode().equals(code)) {
                mensaje=producto.toString();
            }
        }
        return mensaje;
    }

}
