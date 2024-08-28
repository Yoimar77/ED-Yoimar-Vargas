package tallerLaboratorioColecciones;

import java.util.Stack;

public class ControlPila<T> {
    private Stack<T> stack = new Stack<>();
    
    // Agrega un elemento a la pila
    public boolean push(T element) {
    	boolean state=false;
        if (stack.isEmpty()) {
            // Si la pila está vacía, simplemente agrega el elemento
            stack.push(element);
            state = true;
        } else {
            // Verifica el tipo del elemento a agregar con el tipo del elemento en la cima
            T topElement = stack.peek();
            if (element.getClass().equals(topElement.getClass())) {
                stack.push(element);
                state = true;
            }
        }
        return state;
    }
    public String mostrarMensaje(T element) {
    	String mensaje ="No se pudo agregar a pila";
    	boolean aggregate = push(element);
		if(aggregate) {
			mensaje="Se ha agregado con éxito el valor a la pila.";
		}
    	return mensaje;
    }
    public void imprimirPila() {
    	for (int i = 0; i < stack.size(); i++) {
    	    System.out.println(stack.get(i));
    	}
    }
    
}
