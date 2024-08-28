package tallerLaboratorioColecciones;

public class MainPunto2 {
	public static void main(String[] args) {
		Empresa empresa = new Empresa();
	    Producto p1 = new Producto("A123", "Producto 1", 100.0);
	    Producto p2 = new Producto("B456", "Producto 2", 150.0);
	    Producto p3 = new Producto("C789", "Producto 3", 200.0);

	    empresa.agregarProducto(p1);
	    empresa.agregarProducto(p2);
	    empresa.agregarProducto(p3);
	    
	    String mensajeProducto =empresa.buscarProductoPorCodigo("A123");
	    System.out.println(mensajeProducto);

		}
}
