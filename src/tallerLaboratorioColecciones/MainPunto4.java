package tallerLaboratorioColecciones;

public class MainPunto4 {
	public static void main(String[] args) {
        ControlPila pila = new ControlPila<>();
        
        // Agregar elementos a la pila
        System.out.println(pila.mostrarMensaje(5));        
        System.out.println(pila.mostrarMensaje("hola"));  
        System.out.println(pila.mostrarMensaje("hola"));
        
        pila.imprimirPila();
        
        
        

	}
	
}
